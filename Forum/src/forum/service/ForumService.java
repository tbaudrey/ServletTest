/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.List;
import forum.dao.ForumDAO;
import forum.entity.Forum;
import forum.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class ForumService {
    
    private ForumDAO dao= new ForumDAO();
    Utilisateur u = new Utilisateur();

    
    
    
    public void ajouter(Forum f){
        dao.ajouter(f);
    }
    
    public void modifier(Forum f){
        dao.modifier(f);
    }
    
    public void supprimer(Forum f){
        dao.supprimer(f);
    }
    
    public Forum rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    public List<Forum> listerTous(){
        return dao.listerTous();
    }
}
