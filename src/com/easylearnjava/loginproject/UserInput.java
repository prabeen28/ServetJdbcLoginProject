package com.easylearnjava.loginproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInput extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("Hello Userinput");
		String user= request.getParameter("unTextBox");
		String pw= request.getParameter("unPassword");
		//out.println("Username is:"+user);
		//out.println("<br />Password is :"+pw);
		DataComparision dc= new DataComparision();
		boolean isValidate=dc.validateInput(user,pw);
		if(isValidate)
		{
			//out.println("Credential is correct");
			RequestDispatcher rd= request.getRequestDispatcher("loginsuccess.html");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			rd.forward(request, response); 
			//out.println("Credential is wrong"); 
		}
		
		
	}
}
