/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.ForumDAO;
import java.util.List;
import forum.dao.ForumDAOJpaImpl;
import forum.entity.Forum;
import forum.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */

@Repository
public class ForumServiceImpl implements ForumService{
    
    @Autowired
    private ForumDAO dao;
    
    Utilisateur u = new Utilisateur();

    @Override
    public void ajouter(Forum f){
        dao.ajouter(f);
    }
    
    @Override
    public void modifier(Forum f){
        dao.modifier(f);
    }
    
    @Override
    public void supprimer(Forum f){
        dao.supprimer(f);
    }
    
    @Override
    public Forum rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    @Override
    public List<Forum> listerTous(){
        return dao.listerTous();
    }
}
