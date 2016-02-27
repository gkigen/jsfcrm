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
@Table(name = "invoices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoices.findAll", query = "SELECT i FROM Invoices i"),
    @NamedQuery(name = "Invoices.findById", query = "SELECT i FROM Invoices i WHERE i.id = :id"),
    @NamedQuery(name = "Invoices.findByName", query = "SELECT i FROM Invoices i WHERE i.name = :name"),
    @NamedQuery(name = "Invoices.findByInvoiceno", query = "SELECT i FROM Invoices i WHERE i.invoiceno = :invoiceno"),
    @NamedQuery(name = "Invoices.findByDescription", query = "SELECT i FROM Invoices i WHERE i.description = :description"),
    @NamedQuery(name = "Invoices.findByDate", query = "SELECT i FROM Invoices i WHERE i.date = :date"),
    @NamedQuery(name = "Invoices.findByQuoteno", query = "SELECT i FROM Invoices i WHERE i.quoteno = :quoteno"),
    @NamedQuery(name = "Invoices.findByDuedate", query = "SELECT i FROM Invoices i WHERE i.duedate = :duedate"),
    @NamedQuery(name = "Invoices.findByAmmount", query = "SELECT i FROM Invoices i WHERE i.ammount = :ammount")})
public class Invoices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 25)
    @Column(name = "name")
    private String name;
    @Column(name = "invoiceno")
    private Integer invoiceno;
    @Size(max = 30)
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "quoteno")
    private Integer quoteno;
    @Column(name = "duedate")
    @Temporal(TemporalType.DATE)
    private Date duedate;
    @Column(name = "ammount")
    private Integer ammount;

    public Invoices() {
    }

    public Invoices(Integer id) {
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

    public Integer getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(Integer invoiceno) {
        this.invoiceno = invoiceno;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getQuoteno() {
        return quoteno;
    }

    public void setQuoteno(Integer quoteno) {
        this.quoteno = quoteno;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
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
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Invoices[ id=" + id + " ]";
    }
    
}
