package proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proj.forms.mailForm;
import proj.outils.gestionMail;

public class envoyerMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String CONTACT        = "/index.jsp";


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( CONTACT ).forward( request, response );
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*Création d'un objet gestionMail*/
		mailForm mailForm = new mailForm();
		
		/*Envoi d'un mail*/
		mailForm.envoyer(request);
		
		/*Envoi de la réponse */
		this.getServletContext().getRequestDispatcher( CONTACT ).forward( request, response );

	}

}
