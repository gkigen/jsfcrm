/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tagi
 */
@Entity
@Table(name = "quotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quotes.findAll", query = "SELECT q FROM Quotes q"),
    @NamedQuery(name = "Quotes.findById", query = "SELECT q FROM Quotes q WHERE q.id = :id"),
    @NamedQuery(name = "Quotes.findByName", query = "SELECT q FROM Quotes q WHERE q.name = :name"),
    @NamedQuery(name = "Quotes.findByQuoteno", query = "SELECT q FROM Quotes q WHERE q.quoteno = :quoteno"),
    @NamedQuery(name = "Quotes.findByDescription", query = "SELECT q FROM Quotes q WHERE q.description = :description"),
    @NamedQuery(name = "Quotes.findByApprovalissues", query = "SELECT q FROM Quotes q WHERE q.approvalissues = :approvalissues"),
    @NamedQuery(name = "Quotes.findByValiduntil", query = "SELECT q FROM Quotes q WHERE q.validuntil = :validuntil"),
    @NamedQuery(name = "Quotes.findByQuotestage", query = "SELECT q FROM Quotes q WHERE q.quotestage = :quotestage"),
    @NamedQuery(name = "Quotes.findByInvoicestatus", query = "SELECT q FROM Quotes q WHERE q.invoicestatus = :invoicestatus"),
    @NamedQuery(name = "Quotes.findByStatus", query = "SELECT q FROM Quotes q WHERE q.status = :status"),
    @NamedQuery(name = "Quotes.findByOpportunity", query = "SELECT q FROM Quotes q WHERE q.opportunity = :opportunity"),
    @NamedQuery(name = "Quotes.findByAmmount", query = "SELECT q FROM Quotes q WHERE q.ammount = :ammount")})
public class Quotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 25)
    @Column(name = "name")
    private String name;
    @Column(name = "quoteno")
    private Integer quoteno;
    @Size(max = 30)
    @Column(name = "description")
    private String description;
    @Size(max = 30)
    @Column(name = "approvalissues")
    private String approvalissues;
    @Column(name = "validuntil")
    @Temporal(TemporalType.DATE)
    private Date validuntil;
    @Size(max = 30)
    @Column(name = "quotestage")
    private String quotestage;
    @Size(max = 30)
    @Column(name = "invoicestatus")
    private String invoicestatus;
    @Size(max = 30)
    @Column(name = "status")
    private String status;
    @Size(max = 30)
    @Column(name = "opportunity")
    private String opportunity;
    @Column(name = "ammount")
    private Integer ammount;

    public Quotes() {
    }

    public Quotes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuoteno() {
        return quoteno;
    }

    public void setQuoteno(Integer quoteno) {
        this.quoteno = quoteno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApprovalissues() {
        return approvalissues;
    }

    public void setApprovalissues(String approvalissues) {
        this.approvalissues = approvalissues;
    }

    public Date getValiduntil() {
        return validuntil;
    }

    public void setValiduntil(Date validuntil) {
        this.validuntil = validuntil;
    }

    public String getQuotestage() {
        return quotestage;
    }

    public void setQuotestage(String quotestage) {
        this.quotestage = quotestage;
    }

    public String getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(String opportunity) {
        this.opportunity = opportunity;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quotes)) {
            return false;
        }
        Quotes other = (Quotes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Quotes[ id=" + id + " ]";
    }
    
}
