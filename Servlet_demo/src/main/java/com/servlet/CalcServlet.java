package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int no1 = Integer.parseInt(req.getParameter("num1"));
		int no2 = Integer.parseInt(req.getParameter("num2"));
		int result = no1+no2;
	    System.out.println(result);
	    PrintWriter pw = res.getWriter();
	    pw.println(result);
	}
}
