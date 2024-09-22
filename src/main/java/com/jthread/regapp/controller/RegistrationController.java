package com.jthread.regapp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Page</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Registration Page</h1>");
        out.println("<h2>Welcome " + name + "</h2>");
        out.println("<h2>Your Age is  " + age + "</h2>");
        out.println("</body>");
        out.println("</html>");

    }
}
