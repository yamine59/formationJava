package org.example.expersonne.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.expersonne.model.Personne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(value = "/personne")
public class PersonneServlet extends HttpServlet {
    private String prenom;
    private String nom;
    private int age;
    private List<Personne> personnes;
    @Override
    public void init() throws ServletException {
        personnes = new ArrayList<>();
        prenom = "Pierre";
        nom = "Dupont";
        age = 25;
        Personne personne = Personne.builder().prenom(prenom).nom(nom).age(age).build();
        personnes.add(personne);
        prenom = "yamine";
        nom = "benkouider";
        age = 23;
        Personne personne2 = Personne.builder().prenom(prenom).nom(nom).age(age).build();
        personnes.add(personne2);
        personnes.add(new Personne("toto", "tata", 20));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personnes);
        getServletContext().getRequestDispatcher("/WEB-INF/view/personne.jsp").forward(req, resp);
    }
}
