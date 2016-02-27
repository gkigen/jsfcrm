/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Invoices;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.InvoiceSession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class InvoiceBean {

    private List<Invoices> invoicelist;
    @EJB
    private InvoiceSession invoiceejb;

    private Invoices selectedinvoice= new Invoices();

    @PostConstruct
    public void init() {
        invoicelist = invoiceejb.getallinvoices();
    }

    public List<Invoices> getInvoicelist() {
        return invoicelist;
    }

    public Invoices getSelectedinvoice() {
        return selectedinvoice;
    }

    public void setSelectedinvoice(Invoices selectedinvoice) {
        this.selectedinvoice = selectedinvoice;
    }

    public void setInvoiceslist(List<Invoices> invoicelist) {
        this.invoicelist = invoicelist;
    }
     public String removeinvoice(int invoiceid){
         invoiceejb.deleteinvoice(invoiceid);
        return null;
     }
     public String selectformodification(Invoices a){
         selectedinvoice= a;
        return null;  
     }
     public String modifyinvoice(){
         invoiceejb.editinvoice(selectedinvoice);
         invoicelist=invoiceejb.getallinvoices();
         selectedinvoice=null;
        return null;
         
     }
     public String addNew() {
        selectedinvoice = invoiceejb.addinvoice(selectedinvoice);
       invoicelist = invoiceejb.getallinvoices();
        return "invoice.xhtml";
    }
}
