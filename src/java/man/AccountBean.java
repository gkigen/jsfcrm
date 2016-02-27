/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Accounts;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.AccountSession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class AccountBean {

    private List<Accounts> accountlist;
    @EJB
    private AccountSession accountejb;

    private Accounts selectedaccount = new Accounts();

    @PostConstruct
    public void init() {
        accountlist = accountejb.getallaccounts();

    }
     

    public List<Accounts> getAccountlist() {
        return accountlist;
    }

    public Accounts getSelectedaccount() {
        return selectedaccount;
    }

    public void setSelectedaccount(Accounts selectedaccount) {
        this.selectedaccount = selectedaccount;
    }

    public void setAccountlist(List<Accounts> accountlist) {
        this.accountlist = accountlist;
    }

    public String removeaccount(int accountid) {
        accountejb.deleteaccount(accountid);
        return null;
    }

    public String selectformodification(Accounts a) {
        selectedaccount = a;
        return null;
    }

    public String modifyaccount() {
        accountejb.editaccount(selectedaccount);
        accountlist = accountejb.getallaccounts();
        selectedaccount = null;
        return null;

    }

    public String addNew() {
        selectedaccount = accountejb.addaccount(selectedaccount);
        accountlist = accountejb.getallaccounts();
        return "account.xhtml";
    }

    
}
