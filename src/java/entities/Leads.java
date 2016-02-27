/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tagi
 */
@Entity
@Table(name = "leads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Leads.findAll", query = "SELECT l FROM Leads l"),
    @NamedQuery(name = "Leads.findById", query = "SELECT l FROM Leads l WHERE l.id = :id"),
    @NamedQuery(name = "Leads.findByCompany", query = "SELECT l FROM Leads l WHERE l.company = :company"),
    @NamedQuery(name = "Leads.findByMobile", query = "SELECT l FROM Leads l WHERE l.mobile = :mobile"),
    @NamedQuery(name = "Leads.findByAddress", query = "SELECT l FROM Leads l WHERE l.address = :address"),
    @NamedQuery(name = "Leads.findByEmail", query = "SELECT l FROM Leads l WHERE l.email = :email"),
    @NamedQuery(name = "Leads.findByStreet", query = "SELECT l FROM Leads l WHERE l.street = :street"),
    @NamedQuery(name = "Leads.findByCounty", query = "SELECT l FROM Leads l WHERE l.county = :county"),
    @NamedQuery(name = "Leads.findByLeadsource", query = "SELECT l FROM Leads l WHERE l.leadsource = :leadsource"),
    @NamedQuery(name = "Leads.findByConverted", query = "SELECT l FROM Leads l WHERE l.converted = :converted")})
public class Leads implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 30)
    @Column(name = "company")
    private String company;
    @Column(name = "mobile")
    private Integer mobile;
    @Size(max = 30)
    @Column(name = "address")
    private String address;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 30)
    @Column(name = "email")
    private String email;
    @Size(max = 30)
    @Column(name = "street")
    private String street;
    @Size(max = 30)
    @Column(name = "county")
    private String county;
    @Size(max = 30)
    @Column(name = "leadsource")
    private String leadsource;
    @Size(max = 10)
    @Column(name = "converted")
    private String converted;

    public Leads() {
    }

    public Leads(Integer id) {
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

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLeadsource() {
        return leadsource;
    }

    public void setLeadsource(String leadsource) {
        this.leadsource = leadsource;
    }

    public String getConverted() {
        return converted;
    }

    public void setConverted(String converted) {
        this.converted = converted;
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
        if (!(object instanceof Leads)) {
            return false;
        }
        Leads other = (Leads) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Leads[ id=" + id + " ]";
    }
    
}
