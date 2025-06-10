package org.example.demobase;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "monServlet", value = "/monservlet")
public class MonServlet extends HttpServlet {

    private String prenom;

    @Override
    public void init() throws ServletException {
        System.out.println("monServlet est lancé !!!!");
        prenom = "yamine";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("une requete GET a ete envoyer a /monservlet !!!");
//        resp.setContentType("text/plain");
//
//        PrintWriter writer = resp.getWriter();
//        writer.println("du jolie texte !!!");


//        resp.setContentType("text/html");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html><body>");
//        writer.println("<h1>" +"son prenom est : " + prenom + "</h1>");
//        writer.println("</body></html>");


        getServletContext().getRequestDispatcher("/maPage.jsp").forward(req,resp);
    }
}
