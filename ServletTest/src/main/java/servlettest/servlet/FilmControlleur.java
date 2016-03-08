/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
public class FilmControlleur {
    
    private FilmServicesMockImpl filmServicesMockImpl = new FilmServicesMockImpl();
    
    public void listerFilms(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
        List<Film> f = filmServicesMockImpl.listerTous();
        
        String page = req.getParameter("page");
        
        if(page.equals("lister_films")){
            if(f.isEmpty()==false){
                req.setAttribute("mesFilms", f);
                req.getRequestDispatcher("lister_films.jsp").include(req, resp);
            }
        }
    
    }
}
