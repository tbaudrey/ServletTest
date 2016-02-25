/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.service.SujetService;
import forum.service.UtilisateurService;
import org.junit.Test;
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
public class TestInterface {
    
    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private SujetService sujetService;
    
    @Test
    public void TestUtilisateur() {
        System.out.println(utilisateurService.listerTous());
//        Utilisateur u = new Utilisateur();
//        utilisateurService.ajouter(u);
    }
//    @Test
    public void TestSujet() {
        System.out.println(sujetService.listerTous());
//        Utilisateur u = new Utilisateur();
//        utilisateurService.ajouter(u);
    }

}
