/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.MessageDAO;
import java.util.List;
import forum.dao.MessageDAOJpaImpl;
import forum.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class MessageServiceImpl implements MessageService{
    
    @Autowired
    private MessageDAO dao;
    
    
    @Override
    public void ajouter(Message m){
        dao.ajouter(m);
    }
    
    @Override
    public void modifier(Message m){
        dao.modifier(m);
    }
    
    @Override
    public void supprimer(Message m){
        dao.supprimer(m);
    }
    
    @Override
    public Message rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    @Override
    public List<Message> listerTous(){
        return dao.listerTous();
    }
}
