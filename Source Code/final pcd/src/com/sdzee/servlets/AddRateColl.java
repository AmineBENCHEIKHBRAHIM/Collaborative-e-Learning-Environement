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
 * Servlet implementation class AddRateColl
 */
@WebServlet("/AddRateColl")
public class AddRateColl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;
	String coordinateur,nom,description,query,query2;
	
	DatabaseConnection dbconn;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRateColl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		dbconn = new DatabaseConnection();
		conn = dbconn.setConnection();
		int v = Integer.parseInt(request.getParameter("v"));
		int idprob = Integer.parseInt(request.getParameter("idprob"));
		String poseur = request.getParameter("poseur");
		String objectif = request.getParameter("o");
		String tache = request.getParameter("t");
		String artefact = request.getParameter("a");
		String contrainte = request.getParameter("c");
		int user = Integer.parseInt(request.getParameter("user"));
		int idrep = Integer.parseInt(request.getParameter("idrep"));
		System.out.print(v);
		System.out.print(idprob);
		System.out.print(poseur);
		System.out.print(objectif);
		System.out.print(tache);
		System.out.print(artefact);
		System.out.print(contrainte);
		System.out.print(user);
		System.out.print(idrep);
		try {
			stmt = conn.createStatement();
			query = "insert into notes (idrep,idnoteur,value) values('"+idrep+"','"+user+"','"+v+"')";
			stmt.executeUpdate(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("repgroupecoll.jsp?idprob="+idprob+"&poseur="+poseur+"&o="+objectif+"&t="+tache+"&a="+artefact+"&c="+contrainte+"&user="+user);
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
