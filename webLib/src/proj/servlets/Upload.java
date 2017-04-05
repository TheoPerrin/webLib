package proj.servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import proj.beans.Fichier;
import proj.dao.DAOFactory;
import proj.dao.FichierDao;
import proj.forms.UploadForm;


public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/uploadBonjour.jsp";
	public static final String ATT_FICHIER = "fichier";
	public static final String ATT_FORM    = "form";	
	public static final String CHEMIN        = "chemin";
	public static final String CONF_DAO_FACTORY = "daofactory";
	
	private FichierDao<Fichier>     fichierDao;
	
	public void init() throws ServletException {
        /* Récupération d'une instance de notre DAO Fichier */
        this.fichierDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getFichierDao();
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		if ( session.getAttribute("sessionUtilisateur" ) == null ) {
            /* Redirection vers la page d'accueil */
        	this.getServletContext().getRequestDispatcher("/index.jsp").forward( request, response );
        } else {
            /* Affichage de la page restreinte */
            this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
          }
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
         * Lecture du paramètre 'chemin' passé à la servlet via la déclaration
         * dans le web.xml
         */
        String chemin = this.getServletConfig().getInitParameter( CHEMIN );

        /* Préparation de l'objet formulaire */
        UploadForm form = new UploadForm( fichierDao );

        /* Traitement de la requête et récupération du bean en résultant */
        Fichier fichier = form.enregistrerFichier( request, chemin );

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_FICHIER, fichier );
        
        System.out.println(fichier.getType());
        

        	this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

    }

}
