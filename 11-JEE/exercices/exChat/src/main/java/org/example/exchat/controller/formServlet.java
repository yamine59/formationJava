package org.example.exchat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exchat.model.Cat;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cat/add")
public class formServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        catList = new ArrayList<>();
    }

    private List<Cat> catList;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        req.getRequestDispatcher("/WEB-INF/addCat.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String favouriteFood = req.getParameter("favouriteFood");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birthdate"));

        Cat cat = Cat.builder().name(name).breed(breed).favouriteFood(favouriteFood).birthDate(birthDate).build();
        catList.add(cat);
        req.setAttribute("catList",catList);
        req.getRequestDispatcher("/WEB-INF/listCat.jsp").forward(req, resp);

    }
}
