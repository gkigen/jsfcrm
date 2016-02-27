package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-19T09:32:59")
@StaticMetamodel(Cases.class)
public class Cases_ { 

    public static volatile SingularAttribute<Cases, Integer> id;
    public static volatile SingularAttribute<Cases, Date> startdate;
    public static volatile SingularAttribute<Cases, String> status;
    public static volatile SingularAttribute<Cases, String> company;
    public static volatile SingularAttribute<Cases, String> state;
    public static volatile SingularAttribute<Cases, Date> enddate;
    public static volatile SingularAttribute<Cases, String> handledby;

}