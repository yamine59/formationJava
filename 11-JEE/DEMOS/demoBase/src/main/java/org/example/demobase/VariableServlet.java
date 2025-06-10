package org.example.demobase;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(value = "/variable")
public class VariableServlet extends HttpServlet {
    private String prenom = "yamine";
    private String nom = "m2i";
    private List<String> prenoms;

    @Override
    public void init() throws ServletException {
        prenom = "yamine";
        nom = "m2i";
        prenoms = new ArrayList<>();
        prenoms.add("yamine");
        prenoms.add("thomas");
        prenoms.add("teo");



    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("leprenom", prenom);
        req.setAttribute("lenom", nom);
        req.setAttribute("lesprenoms", prenoms);
        req.getRequestDispatcher("/variable.jsp").forward(req,resp);
    }
}


