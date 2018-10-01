/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * This element allows to define naming convention when naming a
 * complexType, element or
 *  modelGroup. Indeed the user can decide of a prefix to add to
 * each class name as well
 *  as a suffix. This naming style won't affect the names entered
 * in the binding file but only 
 *  the XML Names.
 *  
 * 
 * @version $Revision$ $Date$
 */
public class NamingXMLType implements java.io.Serializable {

    /**
     * Field elementName.
     */
    private NamingType elementName;

    /**
     * Field complexTypeName.
     */
    private NamingType complexTypeName;

    /**
     * Field modelGroupName.
     */
    private NamingType modelGroupName;

    public NamingXMLType() {
        super();
    }

    /**
     * Returns the value of field 'complexTypeName'.
     * 
     * @return the value of field 'ComplexTypeName'.
     */
    public NamingType getComplexTypeName() {
        return this.complexTypeName;
    }

    /**
     * Returns the value of field 'elementName'.
     * 
     * @return the value of field 'ElementName'.
     */
    public NamingType getElementName() {
        return this.elementName;
    }

    /**
     * Returns the value of field 'modelGroupName'.
     * 
     * @return the value of field 'ModelGroupName'.
     */
    public NamingType getModelGroupName() {
        return this.modelGroupName;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(final java.io.Writer out) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(final org.xml.sax.ContentHandler handler) throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'complexTypeName'.
     * 
     * @param complexTypeName the value of field 'complexTypeName'.
     */
    public void setComplexTypeName(final NamingType complexTypeName) {
        this.complexTypeName = complexTypeName;
    }

    /**
     * Sets the value of field 'elementName'.
     * 
     * @param elementName the value of field 'elementName'.
     */
    public void setElementName(final NamingType elementName) {
        this.elementName = elementName;
    }

    /**
     * Sets the value of field 'modelGroupName'.
     * 
     * @param modelGroupName the value of field 'modelGroupName'.
     */
    public void setModelGroupName(final NamingType modelGroupName) {
        this.modelGroupName = modelGroupName;
    }

    /**
     * Method unmarshalNamingXMLType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.NamingXMLType
     */
    public static NamingXMLType unmarshalNamingXMLType(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (NamingXMLType) org.exolab.castor.xml.Unmarshaller.unmarshal(NamingXMLType.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate() throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
