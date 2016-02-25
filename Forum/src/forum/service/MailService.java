/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

/**
 *
 * @author admin
 */
public class MailService {
    
    public void mail(String dest, String email, String titre, String msg){
        System.out.println("Destinataire : " + dest + "Email : " + email + "Titre : " + titre + "Msg : " + msg);
    }
    
}
