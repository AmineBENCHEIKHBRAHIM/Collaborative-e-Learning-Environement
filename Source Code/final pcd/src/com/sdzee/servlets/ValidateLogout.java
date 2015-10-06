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

import classes.DatabaseConnection;

/**
 * Servlet implementation class ValidateLogout
 */
@WebServlet("/ValidateLogout")
public class ValidateLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;
	
	String username,password,email,nom,prenom,query;
	
	DatabaseConnection dbconn;
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
    public ValidateLogout() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		username = (String)request.getSession().getAttribute("username");
		request.getSession().invalidate();
		dbconn = new DatabaseConnection();
		
		conn = dbconn.setConnection();
		try {
			stmt = conn.createStatement();
			query = "delete from usersconn where login='"+username+"'";
			int i = stmt.executeUpdate(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request,response);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        
	}

}
