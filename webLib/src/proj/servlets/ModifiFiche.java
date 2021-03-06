package proj.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import proj.beans.Utilisateur;
import proj.dao.DAOFactory;
import proj.dao.UtilisateurDao;
import proj.forms.ModifiFicheForm;


public class ModifiFiche extends HttpServlet {
	public static final String CONF_DAO_FACTORY = "daofactory";
    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
    public static final String ATT_FORM         = "form";
	public static final String MODIF_FICHE      = "/WEB-INF/modifiFiche.jsp";
	public static final String FICHE      		= "/WEB-INF/fiche.jsp";
    
	private UtilisateurDao     utilisateurDao;
	private Utilisateur     utilisateur;
	
	
    public void init() throws ServletException {
        /* Récupération d'une instance de notre DAO Utilisateur */
        this.utilisateurDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getUtilisateurDao();
        
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		if ( session.getAttribute(ATT_SESSION_USER) == null ) {
            /* Redirection vers la page d'accueil */
        	this.getServletContext().getRequestDispatcher("/index.jsp").forward( request, response );
        } else {
            /* Affichage de la page restreinte */
            this.getServletContext().getRequestDispatcher(MODIF_FICHE).forward( request, response );
          }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		utilisateur=(Utilisateur)session.getAttribute(ATT_SESSION_USER);
		
		ModifiFicheForm form = new ModifiFicheForm( utilisateurDao, utilisateur );
		

		utilisateur = form.modifieUtilisateur( request );

		
		
		if ( form.getErreurs().isEmpty() ) {
            session.setAttribute( ATT_SESSION_USER, utilisateur );
    		request.setAttribute( ATT_FORM, form );
            request.setAttribute( ATT_USER, utilisateur );
            this.getServletContext().getRequestDispatcher( FICHE ).forward( request, response );
            
            
            
        } else {
            session.setAttribute( ATT_SESSION_USER, utilisateur );
    		request.setAttribute( ATT_FORM, form );
            request.setAttribute( ATT_USER, utilisateur );
            this.getServletContext().getRequestDispatcher( MODIF_FICHE ).forward( request, response );
        }

	}

}
