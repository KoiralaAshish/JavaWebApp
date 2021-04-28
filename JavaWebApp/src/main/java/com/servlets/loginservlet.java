package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.services.UserServImpl;
import com.services.UserServices;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un=request.getParameter("username");
		String pswd=request.getParameter("password");
		
		UserServices us= new UserServImpl();
		
		if(us.checkDetails(un, pswd))
		{
			HttpSession session=request.getSession();
			
			session.setAttribute("user", un);
			
			request.getRequestDispatcher("new.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("error", "Username/Password Incorrect!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		
		
		
		
	}

}
