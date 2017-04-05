package proj.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UploadRedirection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/uploadBonjour.jsp";
		
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
		
		String type = request.getParameter( "type" );
		
		if(type.compareTo("Video")==0){
			this.getServletContext().getRequestDispatcher( "/WEB-INF/uploadVideo.jsp" ).forward( request, response );
		}
		else if (type.compareTo("Musique")==0){
			this.getServletContext().getRequestDispatcher( "/WEB-INF/uploadMusique.jsp" ).forward( request, response );
		}
		else {
			this.getServletContext().getRequestDispatcher( "/WEB-INF/uploadPhoto.jsp" ).forward( request, response );
		}
        
    }

}
