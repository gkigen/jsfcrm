package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-19T09:32:59")
@StaticMetamodel(Invoices.class)
public class Invoices_ { 

    public static volatile SingularAttribute<Invoices, Integer> id;
    public static volatile SingularAttribute<Invoices, Integer> invoiceno;
    public static volatile SingularAttribute<Invoices, String> description;
    public static volatile SingularAttribute<Invoices, String> name;
    public static volatile SingularAttribute<Invoices, Date> duedate;
    public static volatile SingularAttribute<Invoices, Integer> ammount;
    public static volatile SingularAttribute<Invoices, Date> date;
    public static volatile SingularAttribute<Invoices, Integer> quoteno;

}