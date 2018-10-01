/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml.types;

/**
 * Class SqlDirtyType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SqlDirtyType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The check type
     */
    public static final int CHECK_TYPE = 0;

    /**
     * The instance of the check type
     */
    public static final SqlDirtyType CHECK = new SqlDirtyType(CHECK_TYPE, "check");

    /**
     * The ignore type
     */
    public static final int IGNORE_TYPE = 1;

    /**
     * The instance of the ignore type
     */
    public static final SqlDirtyType IGNORE = new SqlDirtyType(IGNORE_TYPE, "ignore");

    /**
     * Field _memberTable.
     */
    private static java.util.Hashtable<Object,Object> _memberTable = init();

    /**
     * Field type.
     */
    private final int type;

    /**
     * Field stringValue.
     */
    private String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private SqlDirtyType(final int type, final String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of SqlDirtyType
     * 
     * @return an Enumeration over all possible instances of
     * SqlDirtyType
     */
    public static java.util.Enumeration<? extends Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this SqlDirtyType
     * 
     * @return the type of this SqlDirtyType
     */
    public int getType(
    ) {
        return this.type;
    }

    /**
     * Method init.
     * 
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable<Object,Object> init(
    ) {
        java.util.Hashtable<Object, Object> members = new java.util.Hashtable<Object, Object>();
        members.put("check", CHECK);
        members.put("ignore", IGNORE);
        return members;
    }

    /**
     * Method readResolve. will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance.
     * 
     * @return this deserialized object
     */
    private Object readResolve(
    ) {
        return valueOf(this.stringValue);
    }

    /**
     * Method toString.Returns the String representation of this
     * SqlDirtyType
     * 
     * @return the String representation of this SqlDirtyType
     */
    public String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new SqlDirtyType based on the given
     * String value.
     * 
     * @param string
     * @return the SqlDirtyType value of parameter 'string'
     */
    public static SqlDirtyType valueOf(
            final String string) {
        Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid SqlDirtyType";
            throw new IllegalArgumentException(err);
        }
        return (SqlDirtyType) obj;
    }

}
