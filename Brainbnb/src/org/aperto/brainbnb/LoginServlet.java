package org.aperto.brainbnb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aperto.brainbnb.dto.User;
import org.aperto.brainbnb.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID, password;
		
		userID = request.getParameter("userID");
		password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userID, password);
		
		if (result){
			response.sendRedirect("startpage.jsp");
			User user = loginService.getUserDetails(userID);
			request.getSession().setAttribute("user", user);
			return;
			
			
			//response.sendRedirect(SERVLET); -- auch m�glich
			
		}
		else{
			response.sendRedirect("login.jsp");
			return;
		}
		
	}

}
