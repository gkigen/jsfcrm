/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Quotes;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.QuotesSession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class QuotesBean {

   private List<Quotes> quotelist;
    @EJB
    private QuotesSession quoteejb;

    private Quotes selectedquote= new Quotes();

    @PostConstruct
    public void init() {
        quotelist = quoteejb.getallcases();
    }

    public List<Quotes> getQuoteslist() {
        return quotelist;
    }

    public Quotes getSelectedquote() {
        return selectedquote;
    }

    public void setSelectedquote(Quotes selectedquote) {
        this.selectedquote = selectedquote;
    }

    public void setQuoteslist(List<Quotes> quotelist) {
        this.quotelist = quotelist;
    }
     public String removequote(int quoteid){
         quoteejb.deletequote(quoteid);
        return null;
     }
     public String selectformodification(Quotes a){
         selectedquote= a;
        return null;  
     }
     public String modifyquote(){
         quoteejb.editquote(selectedquote);
         quotelist=quoteejb.getallcases();
         selectedquote=null;
        return null;
         
     }
     public String addNew() {
        selectedquote = quoteejb.addquote(selectedquote);
       quotelist = quoteejb.getallcases();
        return "quote.xhtml";
    }
}
