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
 * Servlet implementation class AjoutProbColl
 */
@WebServlet("/AjoutProbColl")
public class AjoutProbColl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;
	String coordinateur,nom,description,query,query2;
	
	DatabaseConnection dbconn;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutProbColl() {
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
		String objectif = request.getParameter("objectif");
		String tache = request.getParameter("tache");
		String artefact = request.getParameter("artefact");
		String contrainte = request.getParameter("contrainte");
		int idgrp = Integer.parseInt(request.getParameter("idgrp"));
		int co = Integer.parseInt(request.getParameter("co"));
		int poseur = Integer.parseInt(request.getParameter("iduser"));
		System.out.print(idgrp);
		System.out.print(co);
		System.out.print(poseur);
		System.out.print(objectif);
		System.out.print(tache);
		System.out.print(artefact);
		System.out.print(contrainte);
			//System.out.print(interests[j]);
		   try {
				stmt = conn.createStatement();
				query = "insert into probcoll (idposeur,idgroupe,objectif,tache,artefact,contrainte) values('"+poseur+"','"+idgrp+"','"+objectif+"','"+tache+"','"+artefact+"','"+contrainte+"')";
				stmt.executeUpdate(query);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//interests[i]
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplayProbColl");
		rd.forward(request,response);
	}

}
