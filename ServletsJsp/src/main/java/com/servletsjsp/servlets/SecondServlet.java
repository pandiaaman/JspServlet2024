package com.servletsjsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("SecondServlet priting on the console...");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("from second servlet");
	}
	
}
