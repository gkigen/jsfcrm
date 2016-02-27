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
@Table(name = "cases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cases.findAll", query = "SELECT c FROM Cases c"),
    @NamedQuery(name = "Cases.findById", query = "SELECT c FROM Cases c WHERE c.id = :id"),
    @NamedQuery(name = "Cases.findByCompany", query = "SELECT c FROM Cases c WHERE c.company = :company"),
    @NamedQuery(name = "Cases.findByState", query = "SELECT c FROM Cases c WHERE c.state = :state"),
    @NamedQuery(name = "Cases.findByStatus", query = "SELECT c FROM Cases c WHERE c.status = :status"),
    @NamedQuery(name = "Cases.findByHandledby", query = "SELECT c FROM Cases c WHERE c.handledby = :handledby"),
    @NamedQuery(name = "Cases.findByStartdate", query = "SELECT c FROM Cases c WHERE c.startdate = :startdate"),
    @NamedQuery(name = "Cases.findByEnddate", query = "SELECT c FROM Cases c WHERE c.enddate = :enddate")})
public class Cases implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 25)
    @Column(name = "company")
    private String company;
    @Size(max = 25)
    @Column(name = "state")
    private String state;
    @Size(max = 25)
    @Column(name = "status")
    private String status;
    @Size(max = 25)
    @Column(name = "handledby")
    private String handledby;
    @Column(name = "startdate")
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @Column(name = "enddate")
    @Temporal(TemporalType.DATE)
    private Date enddate;

    public Cases() {
    }

    public Cases(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHandledby() {
        return handledby;
    }

    public void setHandledby(String handledby) {
        this.handledby = handledby;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
        if (!(object instanceof Cases)) {
            return false;
        }
        Cases other = (Cases) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cases[ id=" + id + " ]";
    }
    
}
