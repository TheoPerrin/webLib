package proj.forms;

import proj.beans.Utilisateur;

public class dd {

	private String login;
	
	
	Utilisateur utilisateur = (Utilisateur) request.getAttribute("utilisateur");
    String login = utilisateur.getLogin();
    System.out.println(login);
    
    
    
    
    
}
