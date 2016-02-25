/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 *
 * @author admin
 */
@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String login;
    private String mdp;
    private String email;
    private TypeUtilisateur tu;
    private Boolean inscrit=false;
    private Boolean connected = false;
    
    @OneToOne
    @JoinColumn(name = "INSEE_ID")
    private Insee insee;
    
    @OneToMany(mappedBy = "createur", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Forum> forumsCrees = new ArrayList<>();
    
    @OneToMany(mappedBy = "posterPar", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Sujet> sujetsCrees = new ArrayList<>();
    
    @OneToMany(mappedBy = "posterPar", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @CascadeOnDelete
    private List<Message> messagesCrees = new ArrayList<>();
    
    public List<Forum> getForumsCrees() {
        return forumsCrees;
    }

    public void setForumsCrees(List<Forum> forumsCrees) {
        this.forumsCrees = forumsCrees;
    }

    public List<Sujet> getSujetsCrees() {
        return sujetsCrees;
    }

    public void setSujetsCrees(List<Sujet> sujetsCrees) {
        this.sujetsCrees = sujetsCrees;
    }

    public List<Message> getMessagesCrees() {
        return messagesCrees;
    }

    public void setMessagesCrees(List<Message> messagesCrees) {
        this.messagesCrees = messagesCrees;
    }
    
    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }



    public Utilisateur(String login, String mdp, String email, TypeUtilisateur tu) {
        this.login = login;
        this.mdp = mdp;
        this.email = email;
        this.tu = tu;
    }

    public Boolean getInscrit() {
        return inscrit;
    }

    public void setInscrit(Boolean inscrit) {
        this.inscrit = inscrit;
    }
    

    public Utilisateur() {
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeUtilisateur getTu() {
        return tu;
    }

    public void setTu(TypeUtilisateur tu) {
        this.tu = tu;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Utilisateur[ id=" + id + " ]";
    }
    
}
