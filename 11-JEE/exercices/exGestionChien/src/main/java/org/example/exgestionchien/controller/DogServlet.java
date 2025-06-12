package org.example.exgestionchien.controller;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exgestionchien.dao.DogDao;
import org.example.exgestionchien.entity.Dog;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "dogServlet", value = "/dog")
public class DogServlet extends HttpServlet {
    DogDao dogDao = new DogDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        System.out.println(path);
        System.out.println("yhhhdhdhd");
        req.getRequestDispatcher("/WEB-INF/dog-create.jsp").forward(req, resp);
        switch (path) {
            case "/create":
                req.getRequestDispatcher("/WEB-INF/dog-create.jsp").forward(req, resp);
                break;
            case "/list":
                req.getRequestDispatcher("/WEB-INF/dog-list.jsp").forward(req, resp);
                break;
            case "/detail":
                req.getRequestDispatcher("/WEB-INF/dog-detail.jsp").forward(req, resp);
                break;
            default:
                throw new IOException("Path not found");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birthDate"));
        dogDao.save(Dog.builder().name(name).breed(breed).birthDate(birthDate).build());
        resp.sendRedirect("/dog/list");
    }
}
