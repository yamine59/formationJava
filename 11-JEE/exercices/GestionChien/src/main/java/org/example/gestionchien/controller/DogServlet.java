package org.example.gestionchien.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.gestionchien.repository.DogRepo;
import org.example.gestionchien.entity.Dog;


import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "dogServlet", value = "/dog/*")
public class DogServlet extends HttpServlet {

    DogRepo dogRepo = new DogRepo();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        System.out.println(path);
        switch (path) {
            case "/create":
                req.getRequestDispatcher("/WEB-INF/dog-create.jsp").forward(req, resp);
                break;
            case "/list":
                req.setAttribute("dogs", dogRepo.get());
                req.getRequestDispatcher("/WEB-INF/dog-list.jsp").forward(req, resp);
                break;
            case "/detail":
                req.setAttribute("dog", dogRepo.get(Integer.parseInt(req.getParameter("id"))));
                req.getRequestDispatcher("/WEB-INF/dog-detail.jsp").forward(req, resp);
                break;
            default:
                throw new IOException("Path not found");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        if ("/create".equals(path)) {
            String name = req.getParameter("name");
            String breed = req.getParameter("breed");
            LocalDate birthDate = LocalDate.parse(req.getParameter("birthdate"));
            dogRepo.save(Dog.builder().name(name).breed(breed).birthDate(birthDate).build());
            resp.sendRedirect(getServletContext().getContextPath()+"/dog/list");
        }
        if ("/update".equals(path)) {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String breed = req.getParameter("breed");
            LocalDate birthDate = LocalDate.parse(req.getParameter("birthdate"));
            dogRepo.save(Dog.builder().id(id).name(name).breed(breed).birthDate(birthDate).build());
            resp.sendRedirect(getServletContext().getContextPath()+"/dog/list");
        }
        if ("/delete".equals(path)) {
            int id = Integer.parseInt(req.getParameter("id"));
            dogRepo.delete(id);
            resp.sendRedirect(getServletContext().getContextPath()+"/dog/list");
        }

    }
}
