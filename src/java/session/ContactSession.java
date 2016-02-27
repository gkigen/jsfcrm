/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Contacts;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class ContactSession {
@PersistenceContext(unitName = "CrmPU")    
private EntityManager em;
    public Contacts addcontact(Contacts contacts) {
        em.persist(contacts);
        return  contacts;
    }

    public void editcontact(Contacts contacts) {
        em.merge( contacts);
    }

    public void deletecontact(int contactid) {
        Contacts c=em.find(Contacts.class, contactid);
        if(c!=null)
        em.remove(c);
    }

    public Contacts getcontact(int contactid) {
        return em.find(Contacts.class, contactid);
    }

   
    public List<Contacts> getallcontacts() {
        return em.createNamedQuery("Contacts.findAll",Contacts.class).getResultList();
    }
}
