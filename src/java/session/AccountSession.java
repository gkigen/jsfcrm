/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Accounts;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class AccountSession {

    @PersistenceContext(unitName = "CrmPU")
    private EntityManager em;
    public Accounts addaccount(Accounts accounts) {
        em.persist(accounts);
        return accounts;
    }

    public void editaccount(Accounts accounts) {
        em.merge(accounts);
    }

    public void deleteaccount(int accountid) {
        Accounts a=em.find(Accounts.class, accountid);
        if(a!=null)
        em.remove(a);
    }

    public Accounts getaccount(int bookid) {
        return em.find(Accounts.class, bookid);
    }

   
    public List<Accounts> getallaccounts() {
        return em.createNamedQuery("Accounts.findAll",Accounts.class).getResultList();
    }
}
