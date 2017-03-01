package proj.outils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;



public class gestionMail {

	private final String 	HOSTNAME = "smtp.gmail.com";
	private final int 		PORT = 465;
	private final String 	USERNAME = "theoweblib@gmail.com"; 
	private final String 	PASSWORD = "LespertPerrin"; 
	private final String 	FROM = "theoweblib@gmail.com"; 
	private final String 	TO = "theoperrin@ymail.com";
	private final String 	SUBJECT = "Demande de clé d'activation";

	
	public void envoyer(String message, String destinataire){
		Email email = new SimpleEmail();
		DefaultAuthenticator defaultAuthenticator = new DefaultAuthenticator(USERNAME, PASSWORD);
		message = message+destinataire;
		try{	
		email.setHostName(HOSTNAME);
		email.setSmtpPort(465);
		email.setAuthenticator(defaultAuthenticator);
		email.setSSLOnConnect(true);
		email.setFrom(FROM);
		email.setSubject(SUBJECT);
		email.setMsg(message);
		email.addTo(TO);
		email.send(); 		
		}
		catch(EmailException e){e.printStackTrace();}
	}
	
}
