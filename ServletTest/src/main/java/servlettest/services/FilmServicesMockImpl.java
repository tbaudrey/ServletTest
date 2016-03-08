/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.services;

import java.util.ArrayList;
import java.util.List;
import servlettest.entity.Film;

/**
 *
 * @author admin
 */
public class FilmServicesMockImpl {
    
    public List<Film> listerTous(){
        
        List<Film> l = new ArrayList();
        Film f1= new Film();
        f1.setTitre("film111111");
        f1.setId(1L);
        Film f2= new Film();
        f2.setTitre("film222222");
        f2.setId(2L);
        l.add(f1);
        l.add(f2);
        return l;
    }
    
    public Film findById(Long id, List<Film> l){
        Film f= new Film();
        for(Integer i=0; i<l.size();i++){
            if(l.get(i).getId()==id){
                return l.get(i);
            }
        }
        return f;
    }
    
    
}
