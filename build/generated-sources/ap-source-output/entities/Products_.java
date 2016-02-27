package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-19T09:32:59")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, Integer> id;
    public static volatile SingularAttribute<Products, String> category;
    public static volatile SingularAttribute<Products, Integer> assetnumber;
    public static volatile SingularAttribute<Products, Date> purchasedate;
    public static volatile SingularAttribute<Products, String> status;
    public static volatile SingularAttribute<Products, String> name;
    public static volatile SingularAttribute<Products, Integer> listprice;
    public static volatile SingularAttribute<Products, String> account;
    public static volatile SingularAttribute<Products, Integer> quantity;
    public static volatile SingularAttribute<Products, Integer> discount;

}