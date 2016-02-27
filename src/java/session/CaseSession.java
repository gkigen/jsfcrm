/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Cases;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class CaseSession {
@PersistenceContext(unitName = "CrmPU")
    private EntityManager em;
    public Cases addcase(Cases cases) {
        em.persist(cases);
        return cases;
    }

    public void editcase(Cases cases) {
        em.merge(cases);
    }

    public void deletecase(int caseid) {
        Cases c=em.find(Cases.class, caseid);
        if(c!=null)
        em.remove(c);
    }

    public Cases getcase(int caseid) {
        return em.find(Cases.class, caseid);
    }

   
    public List<Cases> getallcases() {
        return em.createNamedQuery("Cases.findAll",Cases.class).getResultList();
    }
}
