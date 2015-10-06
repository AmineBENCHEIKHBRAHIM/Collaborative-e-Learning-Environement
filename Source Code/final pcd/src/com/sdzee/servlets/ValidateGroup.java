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
 * Servlet implementation class ValidateGroup
 */
@WebServlet("/ValidateGroup")
public class ValidateGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;
	
	String nom,description,query;
	int coordinateur;
	DatabaseConnection dbconn;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateGroup() {
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
		coordinateur = Integer.parseInt(request.getParameter("coordinateur"));
		description = request.getParameter("description");
		nom = request.getParameter("nom");
		System.out.print(description+coordinateur+nom);
		conn = dbconn.setConnection();
		
		try {
			stmt = conn.createStatement();
			query = "insert into groupe (coordinateur,nom,description) values('"+coordinateur+"','"+nom+"','"+description+"')";
			int i = stmt.executeUpdate(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		rd.forward(request,response);
	}

}
