package fr.formation.inti.controllers;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InitExempleServlet
 */
@WebServlet(urlPatterns = { "/init", "/initparam" }, initParams = {
		@WebInitParam(name = "driver", value = "com.mysql.cj.Driver"),
		@WebInitParam(name = "username", value = "root"),
		@WebInitParam(name = "password", value = "123456"), })
public class InitExempleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
		public void init(ServletConfig config) throws ServletException {
			super.init(config);
			System.out.println("init: InitExempleServlet");
		}
	
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest) req;
		System.out.println(request.getMethod());
		super.service(req, resp);
		}
	
	public InitExempleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = this.getServletConfig().getInitParameter("name");
		String password = this.getServletConfig().getInitParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("name", username);
		session.setAttribute("pwd", password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	//creer table de login pwd dans bd gestion rh

}
