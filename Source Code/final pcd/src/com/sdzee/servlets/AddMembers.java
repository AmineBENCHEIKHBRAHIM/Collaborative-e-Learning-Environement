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
import classes.DatabaseConnection;

/**
 * Servlet implementation class AddMembers
 */
@WebServlet("/AddMembers")
public class AddMembers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;
	String coordinateur,nom,description,query,query2;
	
	DatabaseConnection dbconn;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMembers() {
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
		conn = dbconn.setConnection();
		String[] interests = request.getParameterValues("interests");
		for (int j=0;j<interests.length; j++) {
			//System.out.print(interests[j]);
			try {
				stmt = conn.createStatement();
				int s = Integer.parseInt(interests[j]);
				System.out.print(s);
				query = "insert into membresgroupes (id) values('"+s+"')";
				System.out.print(request.getParameter("idgrp"));
				query2 = "insert into intgroupemembre (groupe_no,membre_no) values('"+Integer.parseInt(request.getParameter("idgrp"))+"','"+s+"')";
				int i = stmt.executeUpdate(query);
				stmt = conn.createStatement();
				i = stmt.executeUpdate(query2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//interests[i]
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("groupe.jsp");
		rd.forward(request,response);
		
		
	}

}
