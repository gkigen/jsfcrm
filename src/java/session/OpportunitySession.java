/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Opportunity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class OpportunitySession {

  @PersistenceContext(unitName = "CrmPU")
    private EntityManager em;
    public Opportunity addopportunity(Opportunity opportunity) {
        em.persist(opportunity);
        return opportunity;
    }

    public void editopportunity(Opportunity opportunity) {
        em.merge(opportunity);
    }

    public void deleteopportunity(int opportunityid) {
       Opportunity a=em.find(Opportunity.class, opportunityid);
        if(a!=null)
        em.remove(a);
    }

    public Opportunity getopportunity(int opportunityid) {
        return em.find(Opportunity.class, opportunityid);
    }

   
    public List<Opportunity> getallopportunity() {
        return em.createNamedQuery("Opportunity.findAll",Opportunity.class).getResultList();
    }
}
