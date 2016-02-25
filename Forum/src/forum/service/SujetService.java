/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.List;
import forum.dao.SujetDAO;
import forum.entity.Sujet;

/**
 *
 * @author admin
 */
public class SujetService {
    
    private SujetDAO dao= new SujetDAO();
    
    
    public void ajouter(Sujet s){
        dao.ajouter(s);
    }
    
    public void modifier(Sujet s){
        dao.modifier(s);
    }
    
    public void supprimer(Sujet s){
        dao.supprimer(s);
    }
    
    public Sujet rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    public List<Sujet> listerTous(){
        return dao.listerTous();
    }
}
