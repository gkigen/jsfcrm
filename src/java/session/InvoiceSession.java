/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Invoices;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class InvoiceSession {

    @PersistenceContext(unitName = "CrmPU")
    private EntityManager em;

    public Invoices addinvoice(Invoices invoice) {
        em.persist(invoice);
        return invoice;
    }

    public void editinvoice(Invoices invoice) {
        em.merge(invoice);
    }

    public void deleteinvoice(int invoiceid) {
        Invoices a = em.find(Invoices.class, invoiceid);
        if (a != null) {
            em.remove(a);
        }
    }

    public Invoices getinvoice(int invoiceid) {
        return em.find(Invoices.class, invoiceid);
    }

    public List<Invoices> getallinvoices() {
        return em.createNamedQuery("Invoices.findAll", Invoices.class).getResultList();
    }
}
