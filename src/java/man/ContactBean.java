/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Contacts;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.ContactSession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class ContactBean {
private List<Contacts> contactlist;
    @EJB
    private ContactSession contactejb;

    private Contacts selectedcontact= new Contacts();

    @PostConstruct
    public void init() {
        contactlist = contactejb.getallcontacts();
    }

    public List<Contacts> getContactslist() {
        return contactlist;
    }

    public Contacts getSelectedcontact() {
        return selectedcontact;
    }

    public void setSelectedcontact(Contacts selectedcontact) {
        this.selectedcontact = selectedcontact;
    }

    

    public void setContactslist(List<Contacts> selectedcontact) {
        this.contactlist = selectedcontact;
    }
     public String removecontact(int contactid){
         contactejb.deletecontact(contactid);
        return null;
     }
     public String selectformodification(Contacts a){
         selectedcontact= a;
        return null;  
     }
     public String modifyaccount(){
         contactejb.editcontact(selectedcontact);
         contactlist=contactejb.getallcontacts();
         selectedcontact=null;
        return null;
         
     }
     public String addNew() {
        selectedcontact = contactejb.addcontact(selectedcontact);
       contactlist = contactejb.getallcontacts();
        return "contact.xhtml";
    }
}
