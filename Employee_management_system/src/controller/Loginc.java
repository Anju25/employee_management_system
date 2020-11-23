package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Admindao;
import model.Admin;

@WebServlet("/login")
public class Loginc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Loginc() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginview.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String button=request.getParameter("submit");
		
		Admin admin=new Admin();
		admin.setUsername(email);
		admin.setPassword(password);
		
		Admindao admindao=new Admindao();
		boolean value=admindao.loginUser(admin);
		
		
		
		if(button!=null)
		{
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message","Check your username and password");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginview.jsp");
			rd.forward(request, response);
		}
		
	}

}
