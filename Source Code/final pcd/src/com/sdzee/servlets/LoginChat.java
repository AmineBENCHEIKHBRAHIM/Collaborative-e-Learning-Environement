package com.sdzee.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.DatabaseConnection;

/**
 * Servlet implementation class LoginChat
 */
@WebServlet("/LoginChat")
public class LoginChat extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	ResultSet res;
	
	String username,query;
	
	DatabaseConnection dbconn;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginChat() {
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
			username = request.getParameter("chatlogin");
		
			query = "select * from users where login='"+username+"'";
			dbconn = new DatabaseConnection();
			conn = dbconn.setConnection();
			res = dbconn.getResult(query, conn);
			if(res.next())
			{
				request.setAttribute("chatlogin", username);
				RequestDispatcher rd = request.getRequestDispatcher("/myproperchatroom.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
				rd.forward(request, response);
			}
				
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
