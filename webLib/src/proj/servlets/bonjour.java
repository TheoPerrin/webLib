package proj.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/bonjour.jsp";
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		if ( session.getAttribute("sessionUtilisateur" ) == null ) {
            /* Redirection vers la page d'accueil */
        	this.getServletContext().getRequestDispatcher("/index.jsp").forward( request, response );
        } else {
            /* Affichage de la page restreinte */
            this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
          }
	}

}
