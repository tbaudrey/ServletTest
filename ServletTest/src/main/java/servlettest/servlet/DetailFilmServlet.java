/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "DetailFilmServlet", urlPatterns = {"/detail_film"})
public class DetailFilmServlet extends HttpServlet {
    
    private FilmServicesMockImpl filmServicesMockImpl = new FilmServicesMockImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Film> l = new ArrayList<>();
        Film f = new Film();
        l=filmServicesMockImpl.listerTous();
        
        f=filmServicesMockImpl.findById(Long.parseLong(req.getParameter("id")),l);
        req.setAttribute("film", f);
        req.getRequestDispatcher("detail_film.jsp").forward(req, resp);
    }

}
