package fr.formation.inti.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.inti.dao.IUsersDao;
import fr.formation.inti.dao.UsersDaoImpl;
import fr.formation.inti.entity.Users;

/**
 * Servlet implementation class ConnectionServlet
 */
@WebServlet("/userlogin")
public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IUsersDao userDao;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnectionServlet() {
		userDao = new UsersDaoImpl();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Users user = userDao.findUserBy(userName,password);
		if (user != null) {
			out.println("<h1> Bonjour " + user.getUsername() + " </h1>");
		} else{
            request.getRequestDispatcher("/login.html").forward(request, response); 
        }

	}

}
