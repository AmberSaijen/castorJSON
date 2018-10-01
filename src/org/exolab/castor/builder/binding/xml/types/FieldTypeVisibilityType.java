/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml.types;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
public class FieldTypeVisibilityType implements java.io.Serializable {

    /**
     * The public type
     */
    public static final int PUBLIC_TYPE = 0;

    /**
     * The instance of the public type
     */
    public static final FieldTypeVisibilityType PUBLIC = new FieldTypeVisibilityType(PUBLIC_TYPE, "public");

    /**
     * The protected type
     */
    public static final int PROTECTED_TYPE = 1;

    /**
     * The instance of the protected type
     */
    public static final FieldTypeVisibilityType PROTECTED = new FieldTypeVisibilityType(PROTECTED_TYPE, "protected");

    /**
     * The private type
     */
    public static final int PRIVATE_TYPE = 2;

    /**
     * The instance of the private type
     */
    public static final FieldTypeVisibilityType PRIVATE = new FieldTypeVisibilityType(PRIVATE_TYPE, "private");

    /**
     * Field _memberTable.
     */
    private static java.util.Hashtable _memberTable = init();

    /**
     * Field type.
     */
    private final int type;

    /**
     * Field stringValue.
     */
    private String stringValue = null;

    private FieldTypeVisibilityType(final int type, final String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of FieldTypeVisibilityType
     * 
     * @return an Enumeration over all possible instances of
     * FieldTypeVisibilityType
     */
    public static java.util.Enumeration enumerate() {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * FieldTypeVisibilityType
     * 
     * @return the type of this FieldTypeVisibilityType
     */
    public int getType() {
        return this.type;
    }

    /**
     * Method init.
     * 
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable init() {
        java.util.Hashtable members = new java.util.Hashtable();
        members.put("public", PUBLIC);
        members.put("protected", PROTECTED);
        members.put("private", PRIVATE);
        return members;
    }

    /**
     * Method readResolve. will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance.
     * 
     * @return this deserialized object
     */
    private Object readResolve() {
        return valueOf(this.stringValue);
    }

    /**
     * Method toString.Returns the String representation of this
     * FieldTypeVisibilityType
     * 
     * @return the String representation of this
     * FieldTypeVisibilityType
     */
    public String toString() {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new FieldTypeVisibilityType based
     * on the given String value.
     * 
     * @param string
     * @return the FieldTypeVisibilityType value of parameter
     * 'string'
     */
    public static FieldTypeVisibilityType valueOf(final String string) {
        Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid FieldTypeVisibilityType";
            throw new IllegalArgumentException(err);
        }
        return (FieldTypeVisibilityType) obj;
    }

}
