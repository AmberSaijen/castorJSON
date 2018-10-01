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
public class AutomaticNamingType implements java.io.Serializable {

    /**
     * Field forces.
     */
    private Forces forces;

    /**
     * Field excludes.
     */
    private Excludes excludes;

    public AutomaticNamingType() {
        super();
    }

    /**
     * Returns the value of field 'excludes'.
     * 
     * @return the value of field 'Excludes'.
     */
    public Excludes getExcludes() {
        return this.excludes;
    }

    /**
     * Returns the value of field 'forces'.
     * 
     * @return the value of field 'Forces'.
     */
    public Forces getForces() {
        return this.forces;
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
     * Sets the value of field 'excludes'.
     * 
     * @param excludes the value of field 'excludes'.
     */
    public void setExcludes(final Excludes excludes) {
        this.excludes = excludes;
    }

    /**
     * Sets the value of field 'forces'.
     * 
     * @param forces the value of field 'forces'.
     */
    public void setForces(final Forces forces) {
        this.forces = forces;
    }

    /**
     * Method unmarshalAutomaticNamingType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.AutomaticNamingType
     */
    public static AutomaticNamingType unmarshalAutomaticNamingType(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (AutomaticNamingType) org.exolab.castor.xml.Unmarshaller.unmarshal(AutomaticNamingType.class, reader);
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
