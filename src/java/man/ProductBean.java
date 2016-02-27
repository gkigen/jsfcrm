/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

import entities.Products;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import session.ProductsSession;

/**
 *
 * @author tagi
 */
@ManagedBean
@ViewScoped
public class ProductBean {
private List<Products> productlist;
    @EJB
    private ProductsSession productejb;

    private Products selectedproduct= new Products();

    @PostConstruct
    public void init() {
        productlist = productejb.getallproducts();
    }

    public List<Products> getProductlist() {
        return productlist;
    }

    public void setProductlist(List<Products> productlist) {
        this.productlist = productlist;
    }

    

    public Products getSelectedproduct() {
        return selectedproduct;
    }

    public void setSelectedproduct(Products selectedproduct) {
        this.selectedproduct = selectedproduct;
    }

    
     public String removeproduct(int productid){
         productejb.deleteproduct(productid);
        return null;
     }
     public String selectformodification(Products a){
         selectedproduct= a;
        return null;  
     }
     public String modifyproduct(){
         productejb.editproduct(selectedproduct);
         productlist=productejb.getallproducts();
         selectedproduct=null;
        return null;
         
     }
     public String addNew() {
        selectedproduct = productejb.addproduct(selectedproduct);
       productlist = productejb.getallproducts();
        return "product.xhtml";
    }
}
