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
 * Servlet implementation class AddRate
 */
@WebServlet("/AddRate")
public class AddRate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;
	String coordinateur,nom,description,query,query2;
	
	DatabaseConnection dbconn;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRate() {
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
		int note = Integer.parseInt(request.getParameter("stars"));
		System.out.print(note);
		int rep = Integer.parseInt(request.getParameter("rep"));
		System.out.print(rep);
		dbconn = new DatabaseConnection();
		conn = dbconn.setConnection();
		try {
			stmt = conn.createStatement();
			query = "update repprobindiv set note="+note+" where idrep="+rep;
			
			int i = stmt.executeUpdate(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//interests[i]
	
	
	
	RequestDispatcher rd = request.getRequestDispatcher("DisplayRepProbIndiv");
	rd.forward(request,response);
	}

}
