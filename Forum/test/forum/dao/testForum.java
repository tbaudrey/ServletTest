/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.service.ForumService;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author admin
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\forum\\Forum\\springXMLConfigForumNew.xml")
public class testForum {
    
    @Autowired
    private ForumDAO dao;
    
    @Autowired
    private ForumService service;
    
    @Test
    public void testForumOK(){
        System.out.println(service.listerTous());
    }
   
}
