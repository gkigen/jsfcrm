/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Opportunity;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.OpportunitySession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class OpportunityBean {
 private List<Opportunity> opportlist;
    @EJB
    private OpportunitySession opportejb;

    private Opportunity selectedopport= new Opportunity();

    @PostConstruct
    public void init() {
        opportlist = opportejb.getallopportunity();
    }

    public List<Opportunity> getOpportlist() {
        return opportlist;
    }

    public Opportunity getSelectedopport() {
        return selectedopport;
    }

    public void setSelectedopport(Opportunity selectedopport) {
        this.selectedopport = selectedopport;
    }

    public void setOpportunitylist(List<Opportunity> opportlist) {
        this.opportlist = opportlist;
    }
     public String removeopport(int opportid){
         opportejb.deleteopportunity(opportid);
        return null;
     }
     public String selectformodification(Opportunity a){
         selectedopport= a;
        return null;  
     }
     public String modifyopport(){
         opportejb.editopportunity(selectedopport);
         opportlist=opportejb.getallopportunity();
         selectedopport=null;
        return null;
         
     }
     public String addNew() {
        selectedopport = opportejb.addopportunity(selectedopport);
       opportlist = opportejb.getallopportunity();
        return "opportunity.xhtml";
    }
}
