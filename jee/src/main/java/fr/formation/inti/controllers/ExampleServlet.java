package fr.formation.inti.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleServlet
 */
@WebServlet("/example")
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExampleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nom = request.getParameter("name");
		Integer age = null;
		if (request.getParameter("age") != null)
			age = Integer.parseInt(request.getParameter("age"));
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		if (age > 25) {
			response.sendRedirect("test.html");
		} else if (age == 25) {
			request.setAttribute("message", nom + " " + age);
			request.getRequestDispatcher("/infos").forward(request, response);
		} else
			for (int i = 0; i < 20; i++)
				out.println("<h1>Super " + nom + " " + age + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
