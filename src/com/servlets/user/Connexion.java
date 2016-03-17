/**
 * 
 */
package com.servlets.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author florian
 *
 */
public class Connexion extends HttpServlet {

	private static final long serialVersionUID = -7069857314143602670L;
	
	/**
	 * URL : http://localhost:8080/Crowdfunding/connexion
	 */
//	public Connexion() {
//		// TODO Auto-generated constructor stub
//	}
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	    String message = "Transmission de variables : OK !";
	    request.setAttribute( "test", message );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Connexion.jsp" ).forward( request, response );
	}

}
