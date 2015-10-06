package com.sdzee.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ForumBeanManager;
import Domain.Utilisateur;
import classes.DatabaseConnection;

/**
 * Servlet implementation class ValidateLogin
 */
@WebServlet("/ValidateLogin")
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection conn;
	ResultSet res;
	Statement stmt;
	String username,password,query;
	int has = 0;
	DatabaseConnection dbconn;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			username = request.getParameter("username");
			password = request.getParameter("pass");
			
			query = "select * from users where login='"+username+"' and password='"+password+"'";
			dbconn = new DatabaseConnection();
			conn = dbconn.setConnection();
			res = dbconn.getResult(query, conn);
			if((username.equals("admin"))||(password.equals("admin")))
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				
				conn = dbconn.setConnection();
				try {
					stmt = conn.createStatement();
					query = "insert into usersconn (login) values('"+username+"')";
					int i = stmt.executeUpdate(query);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
					rd.forward(request,response);
				}
				
				RequestDispatcher rd = request.getRequestDispatcher("/adminprofile.jsp");
				rd.forward(request, response);
			}
			else {if(res.next())
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				conn = dbconn.setConnection();
				try {
					stmt = conn.createStatement();
					query = "insert into usersconn (login) values('"+username+"')";
					int i = stmt.executeUpdate(query);
					
					
					
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
					rd.forward(request,response);
				}
				
				
				
				
				
				
				
				
				
				
				
				RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
				rd.forward(request, response);
			}
				}
			
		}
		catch(Exception e){
			e.printStackTrace();
			//RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			//rd.forward(request, response);
		}
	}

}
