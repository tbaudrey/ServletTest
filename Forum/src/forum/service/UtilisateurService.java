/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.UtilisateurDAO;
import forum.entity.Utilisateur;
import forum.exception.InscriptionException;
import forum.exception.ListeVideException;
import java.util.List;

/**
 *
 * @author admin
 */
public interface UtilisateurService {
    
    public void inscription(Utilisateur u) throws InscriptionException;
    
    public void confirmation(Utilisateur u);
    
    public void seConnecter(String login, String mdp) throws ListeVideException;

    public void ajouter(Utilisateur u);
    
    public void modifier(Utilisateur u);
    
    public void supprimer(Utilisateur u);
    
    public Utilisateur rechercherParId(long id);

    public List<Utilisateur> rechercherParLogin(String login);

    public List<Utilisateur> listerTous();

}
