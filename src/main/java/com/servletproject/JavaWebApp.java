package com.servletproject;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class JavaWebApp extends HttpServlet{
   
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String userName = request.getParameter("User Name");
        response.setContentType("text/html");
        PrintWriter print = response.getWriter();
        print.println("<h1>"+userName+"</h1>");
    }
}
