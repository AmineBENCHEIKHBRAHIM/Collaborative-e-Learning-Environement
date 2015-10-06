package com.sdzee.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.DatabaseConnection;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;
	
	String username,password,email,nom,prenom,query;
	
	DatabaseConnection dbconn;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		dbconn = new DatabaseConnection();
		
		username = request.getParameter("username");
		password = request.getParameter("pass");
		email = request.getParameter("email");
		nom = request.getParameter("nom");
		prenom = request.getParameter("prenom");
		
		conn = dbconn.setConnection();
		try {
			stmt = conn.createStatement();
			query = "insert into users (login,password,email,Nom,prenom) values('"+username+"','"+password+"','"+email+"','"+nom+"','"+prenom+"')";
			int i = stmt.executeUpdate(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request,response);
		}
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
		
		
	}

}
