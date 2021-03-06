package proj.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;

import proj.beans.Utilisateur;
import proj.dao.UtilisateurDao;

public class ModifiFicheForm{
	
	public static final String CHAMP_EMAIL 	= "email";
    public static final String CHAMP_ADRESSE= "adresse";
    public static final String CHAMP_CP		= "codePostal";
    public static final String CHAMP_VILLE 	= "ville";
    
    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
    
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    
    private UtilisateurDao      utilisateurDao;
    private Utilisateur      user;
    private Utilisateur 	utilisateur;
    
    public ModifiFicheForm( UtilisateurDao utilisateurDao, Utilisateur utilisateur ) {
        this.utilisateurDao = utilisateurDao;
        this.user = utilisateur;
    }
    
    

	public Utilisateur modifieUtilisateur( HttpServletRequest request ) {
    	
    	//R�cup�ration du login de session
		HttpSession session= request.getSession();
        user=(Utilisateur)session.getAttribute("sessionUtilisateur");
        String mail=user.getEmail();
        String city=user.getVille();
        String ad=user.getAdresse();
        String cp=String.valueOf(user.getCodePostal());
    	//System.out.println(log);


        //R�cup�ration des champs du formulaire
    	String email = getValeurChamp( request, CHAMP_EMAIL );
    	String ville = getValeurChamp( request, CHAMP_VILLE );
        String codePostal =getValeurChamp( request, CHAMP_CP );
        String adresse = getValeurChamp( request, CHAMP_ADRESSE );
        
        
        
        //Traitement des informations
     if(email!=null){
    	  if(email.compareTo("")==0){email=mail;}
      }
      
      else {email=mail;}
      
       if(codePostal!=null){
    	  if(codePostal.compareTo("")==0){codePostal=cp;}
      }
       
      else {codePostal=cp;}
     
      if(adresse!=null){
    	  if(adresse.compareTo("")==0){adresse=ad;}
      }
      else {adresse=ad;}
     
      if(ville!=null){
    	  if(ville.compareTo("")==0){ville=city;}
      }
      else {ville=city;}
      
      
      traiterEmail(email);
      traiterCodePostal(codePostal);
      
      if (erreurs.isEmpty()){
    	  resultat="OK";
    	  utilisateur.setLogin(email);
    	  utilisateur.setLogin(adresse);
    	  utilisateur.setLogin(codePostal);
    	  utilisateur.setLogin(ville);
    	  
          utilisateurDao.modifier(user);
          
          return utilisateur;
      }
      else {
    	  resultat="NOK";
    	  return user;
      }

}
        
        
        
        private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
            String valeur = request.getParameter( nomChamp );
            if ( valeur == null || valeur.trim().length() == 0 ) {
                return null;
            } else {
                return valeur.trim();
            }
        }
        
        
        /*
         * Ajoute un message correspondant au champ spécifié à la map des erreurs.
         */
        private void setErreur( String champ, String message ) {
            erreurs.put( champ, message );
        }
        

        
        /*
         * Appel à la validation de l'adresse email reçue et initialisation de la
         * propriété email du bean
         */
        private void traiterEmail( String email) {
            try {
                validationEmail( email );
            } catch ( FormValidationException e ) {
                setErreur( CHAMP_EMAIL, e.getMessage() );
            }
           
        }
        
        /* Validation de l'adresse email */
        private void validationEmail( String email ) throws FormValidationException {
            if ( email != null ) {
                if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
                    throw new FormValidationException( "Merci de saisir une adresse mail valide." );
                } else if ( utilisateurDao.trouver( email ) != null ) {
                    throw new FormValidationException( "Cette adresse email est déjà utilisée, merci d'en choisir une autre." );
                }
            } else {
                throw new FormValidationException( "Merci de saisir une adresse mail." );
            }
        }
        
        /*
         * Appel à la validation des mots de passe reçus, chiffrement du mot de
         * passe et initialisation de la propriété motDePasse du bean
         */
       


        /**
         * Valide le code postal saisi.
         */
        
        private void traiterCodePostal ( String codePostal) {
            try {
                validationCodePostal( codePostal);
            } catch ( FormValidationException e ) {
                setErreur( CHAMP_CP, e.getMessage() );
            }
        }
        
        
        /**
         * Valide le code postal saisi.
         */
        private void validationCodePostal(String codePostal) throws FormValidationException {  	
        		if (codePostal == null){
        			throw new FormValidationException( "Merci de saisir un code postal valide" );
        		}
        		else if (codePostal.length() != 5){
    	    		throw new FormValidationException( "Merci de saisir un code postal valide" );
    	    	}
        }

 

}