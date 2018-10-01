/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * Mappings between a namespace and a java package can directly 
 *  be defined in the binding file. This element allows also the
 * mapping
 *  between a package and a schemaLocation.
 *  
 * 
 * @version $Revision$ $Date$
 */
public class PackageType implements java.io.Serializable {

    /**
     * Field name.
     */
    private String name;

    /**
     * Field packageTypeChoice.
     */
    private org.exolab.castor.builder.binding.xml.PackageTypeChoice packageTypeChoice;

    public PackageType() {
        super();
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the value of field 'packageTypeChoice'.
     * 
     * @return the value of field 'PackageTypeChoice'.
     */
    public org.exolab.castor.builder.binding.xml.PackageTypeChoice getPackageTypeChoice() {
        return this.packageTypeChoice;
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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Sets the value of field 'packageTypeChoice'.
     * 
     * @param packageTypeChoice the value of field
     * 'packageTypeChoice'.
     */
    public void setPackageTypeChoice(final org.exolab.castor.builder.binding.xml.PackageTypeChoice packageTypeChoice) {
        this.packageTypeChoice = packageTypeChoice;
    }

    /**
     * Method unmarshalPackageType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.PackageType
     */
    public static PackageType unmarshalPackageType(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (PackageType) org.exolab.castor.xml.Unmarshaller.unmarshal(PackageType.class, reader);
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
