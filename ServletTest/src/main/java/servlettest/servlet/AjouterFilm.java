/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlettest.entity.Film;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterFilm", urlPatterns = {"/ajouter_film"})
public class AjouterFilm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AjouterFilmGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("AjouterFilmPost");
        
        Film f = new Film();
        f.setTitre(req.getParameter("titre"));
        System.out.println(f.getTitre());
        
    }
    

    
    
}
