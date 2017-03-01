package proj.forms;

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
	
	public mailForm(){

	}
	
	public void envoyer(HttpServletRequest request){
		/*Récupération des champs du formulaire de demande de clé */
		String nom = request.getParameter( "name" );
		String destinataire = request.getParameter("email");
		String message = request.getParameter( "message" );
		
		/* Envoi d'un mail*/ 
		Email email = new SimpleEmail();
		DefaultAuthenticator defaultAuthenticator = new DefaultAuthenticator(USERNAME, PASSWORD);
		String mail = "Nom : "+nom+"\n Adresse mail : "+destinataire+"\n Message : "+message;
		
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
		}
		catch(EmailException e){e.printStackTrace();}
	}
	
	
	
	
	
	
}
