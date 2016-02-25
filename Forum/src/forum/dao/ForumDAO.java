/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Forum;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
public interface ForumDAO {
    public void ajouter(Forum f);
    
    public void modifier(Forum f);
    
    public void supprimer(Forum f);
    
    public List<Forum> listerTous();
    
    public Forum rechercherParId(long id);
}
