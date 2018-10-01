/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml.types;

/**
 * Class BindXmlAutoNamingType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class BindXmlAutoNamingType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The deriveByClass type
     */
    public static final int DERIVEBYCLASS_TYPE = 0;

    /**
     * The instance of the deriveByClass type
     */
    public static final BindXmlAutoNamingType DERIVEBYCLASS = new BindXmlAutoNamingType(DERIVEBYCLASS_TYPE, "deriveByClass");

    /**
     * The deriveByField type
     */
    public static final int DERIVEBYFIELD_TYPE = 1;

    /**
     * The instance of the deriveByField type
     */
    public static final BindXmlAutoNamingType DERIVEBYFIELD = new BindXmlAutoNamingType(DERIVEBYFIELD_TYPE, "deriveByField");

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

    private BindXmlAutoNamingType(final int type, final String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of BindXmlAutoNamingType
     * 
     * @return an Enumeration over all possible instances of
     * BindXmlAutoNamingType
     */
    public static java.util.Enumeration<? extends Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * BindXmlAutoNamingType
     * 
     * @return the type of this BindXmlAutoNamingType
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
        members.put("deriveByClass", DERIVEBYCLASS);
        members.put("deriveByField", DERIVEBYFIELD);
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
     * BindXmlAutoNamingType
     * 
     * @return the String representation of this
     * BindXmlAutoNamingType
     */
    public String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new BindXmlAutoNamingType based on
     * the given String value.
     * 
     * @param string
     * @return the BindXmlAutoNamingType value of parameter 'string'
     */
    public static BindXmlAutoNamingType valueOf(
            final String string) {
        Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid BindXmlAutoNamingType";
            throw new IllegalArgumentException(err);
        }
        return (BindXmlAutoNamingType) obj;
    }

}
