/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.List;
import forum.dao.SujetDAO;
import forum.entity.Sujet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class SujetServiceImpl implements SujetService{
    @Autowired
    private SujetDAO sujetDAO;
    
    public void ajouter(Sujet s){
        sujetDAO.ajouter(s);
    }
    
    public void modifier(Sujet s){
        sujetDAO.modifier(s);
    }
    
    public void supprimer(Sujet s){
        sujetDAO.supprimer(s);
    }
    
    public Sujet rechercherParId(long id){
        return sujetDAO.rechercherParId(id);
    }
    
    public List<Sujet> listerTous(){
        return sujetDAO.listerTous();
    }
}
