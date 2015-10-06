package com.sdzee.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.DatabaseConnection;

/**
 * Servlet implementation class DownloadFile
 */
@WebServlet("/DownloadFile")
public class DownloadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
	ResultSet res;
	
	String username,password,query;
	
	DatabaseConnection dbconn;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadFile() {
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
			String filepath = request.getParameter("path");
			String filename = request.getParameter("filename");
			System.out.println(filepath+filename);
			FileInputStream filetodownload = new FileInputStream(filepath);
			ServletOutputStream out = response.getOutputStream();
			response.setContentType("application/rar");
			response.setHeader("Content-Disposition", "attachment ; filename = "+filename);
			response.setContentLength(filetodownload.available());
			int c;
			while((c=filetodownload.read())!=-1)
			{
				out.write(c);
			}
			out.flush();
			out.close();
			filetodownload.close();
			RequestDispatcher rd = request.getRequestDispatcher("/download.jsp");
			rd.forward(request, response);
		}
		catch(Exception e) {}
	}
	
	

}
