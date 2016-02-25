/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.List;
import forum.dao.UtilisateurDAO;
import forum.entity.Utilisateur;
import forum.exception.InscriptionException;
import forum.exception.ListeVideException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
    private UtilisateurDAO dao= new UtilisateurDAO();
    
    public void inscription(Utilisateur u) throws InscriptionException{
        List<Utilisateur> listeUtilisateur=rechercherParLogin(u.getLogin());
        
//        if(u.getInscrit()==true || listeUtilisateur.size()!=0)
        if(listeUtilisateur.size()!=0)
            
            throw new InscriptionException();
        
//        u.setInscritTmp(true);
        MailService m = new MailService();
        
        m.mail(u.getLogin(),u.getEmail(),"Confirmation inscription", "Cliquez sur le lien suivant pour confirmer votre inscription");
        
    }
    
    public void confirmation(Utilisateur u){
        
        u.setInscrit(true);
        ajouter(u);
        System.out.println("Inscription bien confirmée");
    }
    
    public void seConnecter(String login, String mdp) throws ListeVideException{
        List<Utilisateur> listeUtilisateur=rechercherParLogin(login);
        if( listeUtilisateur.size()==0 )
            throw new ListeVideException();
        Utilisateur u = listeUtilisateur.get(0);
        if (mdp==u.getMdp()){
            System.out.println("Bonjour " + login +" vous etes connecté !");
            u.setConnected(true);
            modifier(u);
        }
        else {
            System.out.println("wrong Password or Login");
        }

    }
    
    
    public void ajouter(Utilisateur u){
        dao.ajouter(u);
    }
    
    public void modifier(Utilisateur u){
        dao.modifier(u);
    }
    
    public void supprimer(Utilisateur u){
        dao.supprimer(u);
    }
    
    public Utilisateur rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    public List<Utilisateur> rechercherParLogin(String login){
        return dao.rechercherParLogin(login);
    }
    
    public List<Utilisateur> listerTous(){
        return dao.listerTous();
    }
}
