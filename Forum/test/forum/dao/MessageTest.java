package forum.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\forum\\Forum\\springXMLConfigForumNew.xml")
public class MessageTest {

    @Test
    public void testMessage(){
        System.out.println("Coucou");
    }

}
