package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Discount", urlPatterns = "/calculator")
public class CalDiscount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("moTa");
        float price = Float.parseFloat(req.getParameter("price"));
        float discount = Float.parseFloat(req.getParameter("discount"));
        float amountDiscount = price*discount*0.01f;
        float newPrice = price - amountDiscount;
        PrintWriter writer = resp.getWriter();
        writer.println("Description: " + description);
        writer.println("Price: " + price);
        writer.println("Discount: " + discount + "%");
        writer.println("Discount Amount: " + amountDiscount);
        writer.println("Discount Price: " + newPrice);
    }
}
