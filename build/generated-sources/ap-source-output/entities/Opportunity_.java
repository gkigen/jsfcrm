package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-19T09:32:59")
@StaticMetamodel(Opportunity.class)
public class Opportunity_ { 

    public static volatile SingularAttribute<Opportunity, Integer> id;
    public static volatile SingularAttribute<Opportunity, String> description;
    public static volatile SingularAttribute<Opportunity, String> name;
    public static volatile SingularAttribute<Opportunity, Date> closedate;
    public static volatile SingularAttribute<Opportunity, String> leadsource;
    public static volatile SingularAttribute<Opportunity, Integer> ammount;
    public static volatile SingularAttribute<Opportunity, String> account;
    public static volatile SingularAttribute<Opportunity, String> salesstage;
    public static volatile SingularAttribute<Opportunity, String> nextstep;
    public static volatile SingularAttribute<Opportunity, Integer> probability;
    public static volatile SingularAttribute<Opportunity, String> type;

}