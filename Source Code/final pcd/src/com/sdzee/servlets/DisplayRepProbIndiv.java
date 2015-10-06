package com.sdzee.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ForumBeanManager;
import classes.DatabaseConnection;

/**
 * Servlet implementation class DisplayRepProbIndiv
 */
@WebServlet("/DisplayRepProbIndiv")
public class DisplayRepProbIndiv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;

	String query;
	
	DatabaseConnection dbconn;
	int idposeur ;
	
	String poseur;
	String objectif;
	String tache ;
	String artefact ;
	String contrainte ;
    int note;
	List lst = new ArrayList();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayRepProbIndiv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idprob = request.getParameter("idprob");
		System.out.print(idprob);
		System.out.print("get");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print(request.getParameter("idprob"));
		try
		{
			
			query = "select * from probindiv where idprob="+request.getParameter("idprob");
			dbconn = new DatabaseConnection();
			conn = dbconn.setConnection();
			res = dbconn.getResult(query, conn);
			
			int i=0;
			//response.sendRedirect("index2.jsp");
			while(res.next()){
				i++;
				idposeur = res.getInt(2);
				ForumBeanManager fbm = new ForumBeanManager();
				poseur = fbm.getuseerbyid(idposeur).getPseudo();
				objectif = res.getString(4);
				tache = res.getString(5);
				artefact = res.getString(6);
				contrainte = res.getString(7);
			    note = res.getInt(8);
			    System.out.print(idposeur);
			    System.out.print(poseur);
			    System.out.print(objectif);
			    System.out.print(tache);
			    System.out.print(artefact);
			    System.out.print(contrainte);
			    System.out.print(note);
			    
			    
			    System.out.print("i entred try of display rep prob indiv");
			    RequestDispatcher rd = request.getRequestDispatcher("/repgroupeindiv.jsp?idprob="+request.getParameter("idprob")+"&poseur="+poseur+"&o="+objectif+"&t="+tache+"&a="+artefact+"&c="+contrainte+"&user="+request.getParameter("iduser")+"&n="+note+"&i="+Integer.parseInt(request.getParameter("i")));
				rd.forward(request, response);
			System.out.print("i passed by display rep prob indiv");
			   // response.sendRedirect("index2.jsp");
			
				
		}
			
		}
		catch(Exception e){}
		
	}

}