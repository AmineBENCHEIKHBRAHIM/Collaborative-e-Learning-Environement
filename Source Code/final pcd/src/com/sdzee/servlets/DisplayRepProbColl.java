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
 * Servlet implementation class DisplayRepProbColl
 */
@WebServlet("/DisplayRepProbColl")
public class DisplayRepProbColl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	Statement stmt;
	ResultSet res;

	String query;
	
	DatabaseConnection dbconn;
	
	List lst = new ArrayList();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayRepProbColl() {
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
		System.out.print(request.getParameter("idprob"));
		try
		{
			
			query = "select * from probcoll where idprob="+request.getParameter("idprob");
			dbconn = new DatabaseConnection();
			conn = dbconn.setConnection();
			res = dbconn.getResult(query, conn);
			
			int i=0;
			//response.sendRedirect("index2.jsp");
			while(res.next()){
				i++;
				int idposeur = res.getInt(2);
				ForumBeanManager fbm = new ForumBeanManager();
				String poseur = fbm.getuseerbyid(idposeur).getPseudo();
				String objectif = res.getString(4);
				String tache = res.getString(5);
				String artefact = res.getString(6);
				String contrainte = res.getString(7);
	
			
				RequestDispatcher rd = request.getRequestDispatcher("/repgroupecoll.jsp?idprob="+request.getParameter("idprob")+"&poseur="+poseur+"&o="+objectif+"&t="+tache+"&a="+artefact+"&c="+contrainte+"&user="+request.getParameter("iduser")+"&i="+Integer.parseInt(request.getParameter("i")));
				rd.forward(request, response);
			System.out.print("i passed by display rep prob coll");
			   // response.sendRedirect("index2.jsp");
		}}
		catch(Exception e){}
	}

}
