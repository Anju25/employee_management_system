package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogic.Validation;
import dao.Admindao;
import model.Admin;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupview.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmpswd=request.getParameter("confirmPassword");
		String button=request.getParameter("submit");
		
		Admin admin=new Admin();
		Validation valid=new Validation();
		Admindao admindao=new Admindao();
		
		 admin.setUsername(email);
		 admin.setPassword(password);
		
		int result=admindao.signUp(admin);
		
	if(valid.check(email,password,confirmpswd)) 
		{
			if(result!=0)
				{
			        request.setAttribute("message","Registration Succesfull");
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupview.jsp");
					rd.forward(request, response);
			   }
			else
			  {
				  request.setAttribute("message","Registration Unsuccesfull");
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupview.jsp");
					rd.forward(request, response);  
			  }

		}
	     else
		  {
			  request.setAttribute("message","Check your username and password");
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupview.jsp");
				rd.forward(request, response);  
		  }
		}
	}
