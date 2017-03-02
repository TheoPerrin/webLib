package proj.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import proj.beans.Utilisateur;

public class Fiche extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String FICHE         = "/WEB-INF/fiche.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		this.getServletContext().getRequestDispatcher( FICHE ).forward( request, response );
	}

}
