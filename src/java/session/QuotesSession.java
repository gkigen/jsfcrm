/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Quotes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class QuotesSession {
@PersistenceContext(unitName = "CrmPU")
    private EntityManager em;
    public Quotes addquote(Quotes quotes) {
        em.persist(quotes);
        return quotes;
    }

    public void editquote(Quotes quote) {
        em.merge(quote);
    }

    public void deletequote(int quoteid) {
        Quotes c=em.find(Quotes.class, quoteid);
        if(c!=null)
        em.remove(c);
    }

    public Quotes getquote(int quoteid) {
        return em.find(Quotes.class, quoteid);
    }

   
    public List<Quotes> getallcases() {
        return em.createNamedQuery("Quotes.findAll",Quotes.class).getResultList();
    }
}
