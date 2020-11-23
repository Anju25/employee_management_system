package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employeedao;
import model.Employee;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/Adddetails.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String fathername=request.getParameter("fathername");
		String mothername=request.getParameter("mothername");
		String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String education=request.getParameter("education");
		String button=request.getParameter("submit");
		String gender=request.getParameter("gender");
		
		Employee emp=new Employee();
		Employeedao empdao=new Employeedao();
		
		emp.setFirstname(firstname);
		emp.setLastname(lastname);
		emp.setFathername(fathername);
		emp.setMothername(mothername);
		emp.setDob(dob);
		emp.setEmail(email);
		emp.setPassword(password);
		emp.setMobile(mobile);
		emp.setAddress(address);
		emp.setEducation(education);
		emp.setGender(gender);
		
		
		int result=0;
		try {
			result = empdao.add(emp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result!=0)
		{
			 request.setAttribute("message","Registration Succesfull");
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/Adddetails.jsp");
				rd.forward(request, response);
				/*RequestDispatcher rd1=this.getServletContext().getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
				rd1.forward(request, response);*/
				
		}
		else
		{
			 request.setAttribute("message","Registration unSuccesfull");
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/Adddetails.jsp");
				rd.forward(request, response);
		}
			
	}

}
