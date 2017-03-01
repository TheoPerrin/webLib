package proj.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class mailForm {
	
	private final String 	HOSTNAME = "smtp.gmail.com";
	private final int 		PORT = 465;
	private final String 	USERNAME = "theoweblib@gmail.com"; 
	private final String 	PASSWORD = "LespertPerrin"; 
	private final String 	FROM = "theoweblib@gmail.com"; 
	private final String 	TO = "theoperrin@ymail.com";
	private final String 	SUBJECT = "Demande de clé d'activation";
	
	private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
    
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }
	
	public mailForm(){

	}
	
	public void envoyer(HttpServletRequest request){
		/*Récupération des champs du formulaire de demande de clé */
		String nom = request.getParameter( "name" );
		String destinataire = request.getParameter("email");
		String message = request.getParameter( "message" );
		
		/*Validation des champs*/
		try{validationEmail( destinataire );
		} catch( FormValidationException e ){
			setErreur( "destinataire", e.getMessage() );
		  }
		
		
		/* Envoi d'un mail*/ 
		Email email = new SimpleEmail();
		DefaultAuthenticator defaultAuthenticator = new DefaultAuthenticator(USERNAME, PASSWORD);
		String mail = "Nom : "+nom+"\n Adresse mail : "+destinataire+"\n Message : "+message;
		
		if (erreurs.isEmpty()){
			try{	
				email.setHostName(HOSTNAME);
				email.setSmtpPort(465);
				email.setAuthenticator(defaultAuthenticator);
				email.setSSLOnConnect(true);
				email.setFrom(FROM);
				email.setSubject(SUBJECT);
				email.setMsg(mail);
				email.addTo(TO);
				email.send(); 	
				resultat = "Votre mail à bien été envoyé, nous essayons de vous répondre au plus vite";
			} catch(EmailException e){
				e.printStackTrace(); resultat = "Echec de l'envoi du mail";
			  }
		}else{resultat = "Echec de l'envoi du mail";}
		
	}
	
	
	 /* Validation de l'adresse email */
    private void validationEmail( String email ) throws FormValidationException {
        if ( email != null ) {
            if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
                throw new FormValidationException( "Merci de saisir une adresse mail valide." );
            }
        } else {
            throw new FormValidationException( "Merci de saisir une adresse mail." );
        }
    }
	
	
	
}
