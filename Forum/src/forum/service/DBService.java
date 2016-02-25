/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author admin
 */
public class DBService {
    
    
    public void supprimerTout(){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Message").executeUpdate();
        em.createQuery("DELETE FROM Sujet").executeUpdate();
        em.createQuery("DELETE FROM Forum").executeUpdate();
        em.createQuery("DELETE FROM Utilisateur").executeUpdate();
        
        em.getTransaction().commit();
    }
    
}
