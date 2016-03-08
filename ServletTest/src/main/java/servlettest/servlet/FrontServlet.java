/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlettest.entity.Film;
import servlettest.services.FilmServicesMockImpl;

/**
 *
 * @author admin
 */
@WebServlet(name = "FrontServlet", urlPatterns = {"/Front"})
public class FrontServlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("_CSS.jsp").include(req, resp);
        req.getRequestDispatcher("_TITRE.jsp").include(req, resp);
        req.getRequestDispatcher("_MENU.jsp").include(req, resp);
        
        String titre = "BLABLABLA";
        req.setAttribute("titre", titre);
        
        FilmControlleur filmServlet = new FilmControlleur();
        filmServlet.listerFilms(req, resp);
        
        req.getRequestDispatcher("_PIED.jsp").include(req, resp);
    }
    

}
