/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
public class PackageTypeChoice implements java.io.Serializable {

    /**
     * Field namespace.
     */
    private String namespace;

    /**
     * Field schemaLocation.
     */
    private String schemaLocation;

    public PackageTypeChoice() {
        super();
    }

    /**
     * Returns the value of field 'namespace'.
     * 
     * @return the value of field 'Namespace'.
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Returns the value of field 'schemaLocation'.
     * 
     * @return the value of field 'SchemaLocation'.
     */
    public String getSchemaLocation() {
        return this.schemaLocation;
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
     * Sets the value of field 'namespace'.
     * 
     * @param namespace the value of field 'namespace'.
     */
    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    /**
     * Sets the value of field 'schemaLocation'.
     * 
     * @param schemaLocation the value of field 'schemaLocation'.
     */
    public void setSchemaLocation(final String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Method unmarshalPackageTypeChoice.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.PackageTypeChoice
     */
    public static PackageTypeChoice unmarshalPackageTypeChoice(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (PackageTypeChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(PackageTypeChoice.class, reader);
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
