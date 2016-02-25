/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {
    
    public void ajouter(Utilisateur u){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        
    }
    
    public void modifier(Utilisateur u){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(u);
        em.getTransaction().commit();
    }
    
    public void supprimer(Utilisateur u){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Utilisateur u WHERE u.id="+u.getId()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public List<Utilisateur> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        
        return em.createQuery("SELECT u FROM Utilisateur u").getResultList();
    }
    
    public Utilisateur rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        
        return em.find(Utilisateur.class, id);
    }
    
    
    public List<Utilisateur> rechercherParLogin(String login){
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.login='"+ login +"'").getResultList();
        
    }
}
