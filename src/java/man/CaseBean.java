/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Cases;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.CaseSession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class CaseBean {
private List<Cases> caselist;
    @EJB
    private CaseSession casejb;

    private Cases selectedcase= new Cases();

    @PostConstruct
    public void init() {
        caselist = casejb.getallcases();
    }

    public List<Cases> getCaselist() {
        return caselist;
    }

    public Cases getSelectedcase() {
        return selectedcase;
    }

    public void setSelectedcase(Cases selectedcase) {
        this.selectedcase = selectedcase;
    }

    

    public void setCaselist(List<Cases> caselist) {
        this.caselist = caselist;
    }
     public String removecase(int caseid){
       casejb.deletecase(caseid);
        return null;
     }
     public String selectformodification(Cases a){
        selectedcase= a;
        return null;  
     }
     public String modifycase(){
        casejb.editcase(selectedcase);
         caselist=casejb.getallcases();
         selectedcase=null;
        return null;
         
     }
     public String addNew() {
        selectedcase = casejb.addcase(selectedcase);
       caselist = casejb.getallcases();
        return "case.xhtml";
    }
    
}
