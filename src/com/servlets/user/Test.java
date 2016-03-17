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
public class Test extends HttpServlet {

	private static final long serialVersionUID = -7069857314143602670L;
	
	/**
	 * URL : http://localhost:8080/Crowdfunding/modifyUser
	 */
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	    String paramAuteur = request.getParameter( "auteur" );

	    String message = "Transmission de variables : OK ! " + paramAuteur;

	    request.setAttribute( "test", message );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/modifyUser.jsp" ).forward( request, response );
	}

}
