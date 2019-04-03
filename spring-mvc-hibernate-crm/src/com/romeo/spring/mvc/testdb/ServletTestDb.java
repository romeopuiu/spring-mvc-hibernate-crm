package com.romeo.spring.mvc.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTestDb
 */
@WebServlet("/ServletTestDb")
public class ServletTestDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTestDb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String user = "doctor112";
	String pass = "doctor112";
	
	String jdbcUrl  =  "jdbc:mysql://localhost:3306/doctori?useSSL=false&serverTimezone=UTC";
	
	String driver = "com.mysql.jdbc.Driver";
	
	try {
		PrintWriter out = response.getWriter();
		
		out.println("Conection with database: " + jdbcUrl);
		
		Class.forName(driver);
		
		Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
		
		out.println("Connection is Succesfull!!");
		
		myConn.close();
		
		
		
	}catch (Exception ex) {
  ex.printStackTrace();
	throw new ServletException();
	
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
