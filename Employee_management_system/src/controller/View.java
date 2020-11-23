package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employeedao;
import model.Employee;

/**
 * Servlet implementation class View
 */
@WebServlet("/View")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/viewdetails.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employeedao dao=new Employeedao();
		List<Employee> list=dao.display();
		for(Employee emp:list)
		{
			System.out.println(emp.getFirstname());
			//request.setAttribute("message",emp.getFirstname());
			//RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/viewdetails.jsp");
			//rd.forward(request, response);
		}
		//String email=request.getParameter("email");
		
		//mployeedao employeedao=new Employeedao();
		
		
		//response.sendRedirect("login");
		//Employee emp=employeedao.select(email);
		
		//System.out.println(emp.getPassword());
		//System.out.println(emp.getUsername());
	}

}
