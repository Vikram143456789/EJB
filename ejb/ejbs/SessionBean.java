
package ejbs;

import javax.ejb.*;
import java.io.*;
import java.sql.*;

/**
 * Created Aug 31, 2004 4:38:09 PM
 * Code generated by the Sun ONE Studio EJB Builder
 * @author sreeni
 */


public class SessionBean implements javax.ejb.SessionBean {
    private javax.ejb.SessionContext context;
    
    
    /**
     * @see javax.ejb.SessionBean#setSessionContext(javax.ejb.SessionContext)
     */
    public void setSessionContext(javax.ejb.SessionContext aContext) {
        context=aContext;
    }
    
    
    /**
     * @see javax.ejb.SessionBean#ejbActivate()
     */
    public void ejbActivate() {
        
    }
    
    
    /**
     * @see javax.ejb.SessionBean#ejbPassivate()
     */
    public void ejbPassivate() {
        
    }
    
    
    /**
     * @see javax.ejb.SessionBean#ejbRemove()
     */
    public void ejbRemove() {
        
    }
    
    
    /**
     * See section 7.10.3 of the EJB 2.0 specification
     */
    public void ejbCreate() {
        
    }
    
	Statement stmt = null;
    public void business(String s) {
      ResultSet rs = stmt.execute(s);
      String r1 = rs.getString("col1");
    }
    
}
