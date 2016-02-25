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
public interface UtilisateurDAO {
    
    public void ajouter(Utilisateur u);
    
    public void modifier(Utilisateur u);
    
    public void supprimer(Utilisateur u);
    
    public List<Utilisateur> listerTous();
    
    public Utilisateur rechercherParId(long id);
    
    public List<Utilisateur> rechercherParLogin(String login);
    
}
