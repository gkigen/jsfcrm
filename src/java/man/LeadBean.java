/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Accounts;
import entities.Leads;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.LeadsSession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class LeadBean {
 private List<Leads> leadlist;
    @EJB
    private LeadsSession leadejb;

    private Leads selectedlead= new Leads();

    @PostConstruct
    public void init() {
        leadlist = leadejb.getallleads();
    }

    public List<Leads> getLeadlist() {
        return leadlist;
    }

    public Leads getSelectedlead() {
        return selectedlead;
    }

    public void setSelectedlead(Leads selectedlead) {
        this.selectedlead = selectedlead;
    }

    

    public void setLeadlist(List<Leads> leadlist) {
        this.leadlist = leadlist;
    }
     public String removelead(int leadid){
         leadejb.deleteleads(leadid);
        return null;
     }
     public String selectformodification(Leads a){
         selectedlead= a;
        return null;  
     }
     public String modifylead(){
         leadejb.editleads(selectedlead);
         leadlist=leadejb.getallleads();
         selectedlead=null;
        return null;
         
     }
     public String addNew() {
        selectedlead = leadejb.addleads(selectedlead);
       leadlist = leadejb.getallleads();
        return "lead.xhtml";
    }
}
