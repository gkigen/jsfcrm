package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-19T09:32:59")
@StaticMetamodel(Quotes.class)
public class Quotes_ { 

    public static volatile SingularAttribute<Quotes, Integer> id;
    public static volatile SingularAttribute<Quotes, String> invoicestatus;
    public static volatile SingularAttribute<Quotes, String> approvalissues;
    public static volatile SingularAttribute<Quotes, String> quotestage;
    public static volatile SingularAttribute<Quotes, String> opportunity;
    public static volatile SingularAttribute<Quotes, String> status;
    public static volatile SingularAttribute<Quotes, String> description;
    public static volatile SingularAttribute<Quotes, String> name;
    public static volatile SingularAttribute<Quotes, Integer> ammount;
    public static volatile SingularAttribute<Quotes, Date> validuntil;
    public static volatile SingularAttribute<Quotes, Integer> quoteno;

}