package org.example.demo_routing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "MultiRouteServlet", value = {"/multi-routes", "/multi", "/multi/*"})
public class MultiRouteServlet extends HttpServlet {
    private List<String> prenoms;
    @Override
    public void init() throws ServletException {
        prenoms = new ArrayList<>();
        prenoms.add("Pierre");
        prenoms.add("Paul");
        prenoms.add("Jacques");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = (req.getPathInfo() != null & !req.getPathInfo().isEmpty()) ? req.getPathInfo() : "";
        String searchName = "";

        if (!pathInfo.isEmpty()) {
            System.out.println("pathInfo: " + pathInfo);
            System.out.println("pathInfo sans le '/': " + pathInfo.substring(1));
            System.out.println("pathInfo en intégral a partir d'un string : " + Integer.parseInt(pathInfo.substring(1)));
            if (Integer.parseInt(pathInfo.substring(1)) < 0 || Integer.parseInt(pathInfo.substring(1)) >= prenoms.size()) {
                searchName = "Aucun prénom trouvé";
            }else {
                searchName = prenoms.get(Integer.parseInt(pathInfo.substring(1)));
            }

        }
        req.setAttribute("prenom", searchName);
        req.setAttribute("pathInfo", pathInfo);
        req.getRequestDispatcher("/multi.jsp").forward(req, resp);
    }
}
