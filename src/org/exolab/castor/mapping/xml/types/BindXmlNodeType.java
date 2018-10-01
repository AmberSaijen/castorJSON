/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml.types;

/**
 * Class BindXmlNodeType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class BindXmlNodeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The attribute type
     */
    public static final int ATTRIBUTE_TYPE = 0;

    /**
     * The instance of the attribute type
     */
    public static final BindXmlNodeType ATTRIBUTE = new BindXmlNodeType(ATTRIBUTE_TYPE, "attribute");

    /**
     * The element type
     */
    public static final int ELEMENT_TYPE = 1;

    /**
     * The instance of the element type
     */
    public static final BindXmlNodeType ELEMENT = new BindXmlNodeType(ELEMENT_TYPE, "element");

    /**
     * The namespace type
     */
    public static final int NAMESPACE_TYPE = 2;

    /**
     * The instance of the namespace type
     */
    public static final BindXmlNodeType NAMESPACE = new BindXmlNodeType(NAMESPACE_TYPE, "namespace");

    /**
     * The text type
     */
    public static final int TEXT_TYPE = 3;

    /**
     * The instance of the text type
     */
    public static final BindXmlNodeType TEXT = new BindXmlNodeType(TEXT_TYPE, "text");

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

    private BindXmlNodeType(final int type, final String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of BindXmlNodeType
     * 
     * @return an Enumeration over all possible instances of
     * BindXmlNodeType
     */
    public static java.util.Enumeration<? extends Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this BindXmlNodeType
     * 
     * @return the type of this BindXmlNodeType
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
        members.put("attribute", ATTRIBUTE);
        members.put("element", ELEMENT);
        members.put("namespace", NAMESPACE);
        members.put("text", TEXT);
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
     * BindXmlNodeType
     * 
     * @return the String representation of this BindXmlNodeType
     */
    public String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new BindXmlNodeType based on the
     * given String value.
     * 
     * @param string
     * @return the BindXmlNodeType value of parameter 'string'
     */
    public static BindXmlNodeType valueOf(
            final String string) {
        Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid BindXmlNodeType";
            throw new IllegalArgumentException(err);
        }
        return (BindXmlNodeType) obj;
    }

}
