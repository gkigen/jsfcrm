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
@Table(name = "opportunity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Opportunity.findAll", query = "SELECT o FROM Opportunity o"),
    @NamedQuery(name = "Opportunity.findById", query = "SELECT o FROM Opportunity o WHERE o.id = :id"),
    @NamedQuery(name = "Opportunity.findByName", query = "SELECT o FROM Opportunity o WHERE o.name = :name"),
    @NamedQuery(name = "Opportunity.findByAccount", query = "SELECT o FROM Opportunity o WHERE o.account = :account"),
    @NamedQuery(name = "Opportunity.findByClosedate", query = "SELECT o FROM Opportunity o WHERE o.closedate = :closedate"),
    @NamedQuery(name = "Opportunity.findByType", query = "SELECT o FROM Opportunity o WHERE o.type = :type"),
    @NamedQuery(name = "Opportunity.findBySalesstage", query = "SELECT o FROM Opportunity o WHERE o.salesstage = :salesstage"),
    @NamedQuery(name = "Opportunity.findByLeadsource", query = "SELECT o FROM Opportunity o WHERE o.leadsource = :leadsource"),
    @NamedQuery(name = "Opportunity.findByProbability", query = "SELECT o FROM Opportunity o WHERE o.probability = :probability"),
    @NamedQuery(name = "Opportunity.findByNextstep", query = "SELECT o FROM Opportunity o WHERE o.nextstep = :nextstep"),
    @NamedQuery(name = "Opportunity.findByDescription", query = "SELECT o FROM Opportunity o WHERE o.description = :description"),
    @NamedQuery(name = "Opportunity.findByAmmount", query = "SELECT o FROM Opportunity o WHERE o.ammount = :ammount")})
public class Opportunity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 25)
    @Column(name = "name")
    private String name;
    @Size(max = 25)
    @Column(name = "account")
    private String account;
    @Column(name = "closedate")
    @Temporal(TemporalType.DATE)
    private Date closedate;
    @Size(max = 25)
    @Column(name = "type")
    private String type;
    @Size(max = 25)
    @Column(name = "salesstage")
    private String salesstage;
    @Size(max = 25)
    @Column(name = "leadsource")
    private String leadsource;
    @Column(name = "probability")
    private Integer probability;
    @Size(max = 25)
    @Column(name = "nextstep")
    private String nextstep;
    @Size(max = 40)
    @Column(name = "description")
    private String description;
    @Column(name = "ammount")
    private Integer ammount;

    public Opportunity() {
    }

    public Opportunity(Integer id) {
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Date getClosedate() {
        return closedate;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSalesstage() {
        return salesstage;
    }

    public void setSalesstage(String salesstage) {
        this.salesstage = salesstage;
    }

    public String getLeadsource() {
        return leadsource;
    }

    public void setLeadsource(String leadsource) {
        this.leadsource = leadsource;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public String getNextstep() {
        return nextstep;
    }

    public void setNextstep(String nextstep) {
        this.nextstep = nextstep;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Opportunity)) {
            return false;
        }
        Opportunity other = (Opportunity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Opportunity[ id=" + id + " ]";
    }
    
}
