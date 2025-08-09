package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GradeServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get values from form
        String name = request.getParameter("name");
        String rollNo = request.getParameter("rollno");
        int marks = Integer.parseInt(request.getParameter("marks"));

        // Grade logic
        String grade;
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B";
        else if (marks >= 60) grade = "C";
        else if (marks >= 50) grade = "D";
        else grade = "F";

        // Set response content type
        response.setContentType("text/html");

        // Display result
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Student Grade Report</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Roll No:</strong> " + rollNo + "</p>");
        out.println("<p><strong>Marks:</strong> " + marks + "</p>");
        out.println("<p><strong>Grade:</strong> " + grade + "</p>");
        out.println("</body></html>");
    }
}

