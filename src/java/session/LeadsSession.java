/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Accounts;
import entities.Leads;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class LeadsSession {

    @PersistenceContext(unitName = "CrmPU")
    private EntityManager em;
    public Leads addleads(Leads leads) {
        em.persist(leads);
        return leads;
    }

    public void editleads(Leads leads) {
        em.merge(leads);
    }

    public void deleteleads(int leadsid) {
        Leads a=em.find(Leads.class, leadsid);
        if(a!=null)
        em.remove(a);
    }

    public Leads getleads(int leadsid) {
        return em.find(Leads.class, leadsid);
    }

   
    public List<Leads> getallleads() {
        return em.createNamedQuery("Leads.findAll",Leads.class).getResultList();
    }
}
