package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "converter", urlPatterns = "/converter")
public class Converter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("Rate"));
        float usd = Float.parseFloat(req.getParameter("USD"));
        float vnd = rate*usd;
        PrintWriter writer = resp.getWriter();
        writer.println("VND: " + vnd + " d");
    }
}
