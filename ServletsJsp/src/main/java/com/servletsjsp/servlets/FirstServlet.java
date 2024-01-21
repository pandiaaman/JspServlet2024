package com.servletsjsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//life cycle methods
	
	ServletConfig config;
	
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("creating the object");
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("servicing...");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<p>running the firstServlet</p>");
		out.println("<h4>Today's date and time is: " + new Date() + "</h4>");
	}
	
	public void destroy() {
		System.out.println("destroying servlet objects");
	}
	
	//NON life cycle methods
	
	public ServletConfig getServletConfig() {
		return this.config;
	}
	
	public String getServletInfo() {
		return "this is created by Aman Pandia";
	}

}
