package fr.formation.inti.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.inti.dao.DepartmentDaoImpl;
import fr.formation.inti.dao.IDepartmentDao;
import fr.formation.inti.entity.Department;

/**
 * Servlet implementation class DepartmentController
 */
@WebServlet("/dept")
public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IDepartmentDao departmentDao;   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentController() {
        super();
        departmentDao = new DepartmentDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Department> departments = departmentDao.findAll();
		request.setAttribute("list", departments);
		request.getRequestDispatcher("forEachDept.jsp").forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
