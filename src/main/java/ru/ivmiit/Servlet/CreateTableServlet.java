package ru.ivmiit.Servlet;

import ru.ivmiit.Table;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class CreateTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // req.setAttribute("Table", );
        RequestDispatcher dispatcher=req.getServletContext().getRequestDispatcher("/jsp/home.jsp");
        dispatcher.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int kolStrok= Integer.parseInt(req.getParameter("Strok"));
        int kolStolbcov=Integer.parseInt(req.getParameter("Stolbec"));
        String fon= req.getParameter("Fon");
        String zagolovok=req.getParameter("Zagolovok");
        Table table= new Table(zagolovok, fon, kolStrok, kolStolbcov);
        req.setAttribute("infoTable", table);
        RequestDispatcher dispatcher=req.getServletContext().getRequestDispatcher("/jsp/table.jsp");
        dispatcher.forward(req,resp);
    }
}
