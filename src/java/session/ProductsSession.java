/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Products;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tagi
 */
@Stateless
public class ProductsSession {

    @PersistenceContext(unitName = "CrmPU")
    private EntityManager em;
    public Products addproduct(Products products) {
        em.persist(products);
        return products;
    }

    public void editproduct(Products products) {
        em.merge(products);
    }

    public void deleteproduct(int productid) {
        Products c=em.find(Products.class, productid);
        if(c!=null)
        em.remove(c);
    }

    public Products getproduct(int productid) {
        return em.find(Products.class, productid);
    }

   
    public List<Products> getallproducts() {
        return em.createNamedQuery("Products.findAll",Products.class).getResultList();
    }
}
