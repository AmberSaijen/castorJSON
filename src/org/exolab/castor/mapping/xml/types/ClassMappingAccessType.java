/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml.types;

/**
 * Class ClassMappingAccessType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ClassMappingAccessType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The read-only type
     */
    public static final int READ_ONLY_TYPE = 0;

    /**
     * The instance of the read-only type
     */
    public static final ClassMappingAccessType READ_ONLY = new ClassMappingAccessType(READ_ONLY_TYPE, "read-only");

    /**
     * The shared type
     */
    public static final int SHARED_TYPE = 1;

    /**
     * The instance of the shared type
     */
    public static final ClassMappingAccessType SHARED = new ClassMappingAccessType(SHARED_TYPE, "shared");

    /**
     * The exclusive type
     */
    public static final int EXCLUSIVE_TYPE = 2;

    /**
     * The instance of the exclusive type
     */
    public static final ClassMappingAccessType EXCLUSIVE = new ClassMappingAccessType(EXCLUSIVE_TYPE, "exclusive");

    /**
     * The db-locked type
     */
    public static final int DB_LOCKED_TYPE = 3;

    /**
     * The instance of the db-locked type
     */
    public static final ClassMappingAccessType DB_LOCKED = new ClassMappingAccessType(DB_LOCKED_TYPE, "db-locked");

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

    private ClassMappingAccessType(final int type, final String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of ClassMappingAccessType
     * 
     * @return an Enumeration over all possible instances of
     * ClassMappingAccessType
     */
    public static java.util.Enumeration<? extends Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * ClassMappingAccessType
     * 
     * @return the type of this ClassMappingAccessType
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
        members.put("read-only", READ_ONLY);
        members.put("shared", SHARED);
        members.put("exclusive", EXCLUSIVE);
        members.put("db-locked", DB_LOCKED);
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
     * ClassMappingAccessType
     * 
     * @return the String representation of this
     * ClassMappingAccessType
     */
    public String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new ClassMappingAccessType based on
     * the given String value.
     * 
     * @param string
     * @return the ClassMappingAccessType value of parameter 'string
     */
    public static ClassMappingAccessType valueOf(
            final String string) {
        Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid ClassMappingAccessType";
            throw new IllegalArgumentException(err);
        }
        return (ClassMappingAccessType) obj;
    }

}
