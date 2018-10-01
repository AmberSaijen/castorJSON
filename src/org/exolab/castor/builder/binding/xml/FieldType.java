/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * This type represents the binding for class member. It allows the
 * definition
 *  of its name and java type as well as an implementation of
 * FieldHandler 
 *  to help the Marshalling framework in handling that member.
 * Defining a validator is also
 *  possible. The names given for the validator and the
 * fieldHandler must be fully qualified
 *  
 * 
 * @version $Revision$ $Date$
 */
public class FieldType implements java.io.Serializable {

    /**
     * Field name.
     */
    private String name;

    /**
     * Field javaType.
     */
    private String javaType;

    /**
     * Field wrapper.
     */
    private boolean wrapper;

    /**
     * Keeps track of whether primitive field wrapper has been set
     * already.
     */
    private boolean _haswrapper;

    /**
     * Field handler.
     */
    private String handler;

    /**
     * Field collection.
     */
    private org.exolab.castor.builder.binding.xml.types.FieldTypeCollectionType collection;

    /**
     * Field visibility.
     */
    private org.exolab.castor.builder.binding.xml.types.FieldTypeVisibilityType visibility;

    /**
     * Field validator.
     */
    private String validator;

    public FieldType() {
        super();
    }

    /**
     */
    public void deleteWrapper() {
        this._haswrapper= false;
    }

    /**
     * Returns the value of field 'collection'.
     * 
     * @return the value of field 'Collection'.
     */
    public org.exolab.castor.builder.binding.xml.types.FieldTypeCollectionType getCollection() {
        return this.collection;
    }

    /**
     * Returns the value of field 'handler'.
     * 
     * @return the value of field 'Handler'.
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * Returns the value of field 'javaType'.
     * 
     * @return the value of field 'JavaType'.
     */
    public String getJavaType() {
        return this.javaType;
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
     * Returns the value of field 'validator'.
     * 
     * @return the value of field 'Validator'.
     */
    public String getValidator() {
        return this.validator;
    }

    /**
     * Returns the value of field 'visibility'.
     * 
     * @return the value of field 'Visibility'.
     */
    public org.exolab.castor.builder.binding.xml.types.FieldTypeVisibilityType getVisibility() {
        return this.visibility;
    }

    /**
     * Returns the value of field 'wrapper'.
     * 
     * @return the value of field 'Wrapper'.
     */
    public boolean getWrapper() {
        return this.wrapper;
    }

    /**
     * Method hasWrapper.
     * 
     * @return true if at least one Wrapper has been added
     */
    public boolean hasWrapper() {
        return this._haswrapper;
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
     * Returns the value of field 'wrapper'.
     * 
     * @return the value of field 'Wrapper'.
     */
    public boolean isWrapper() {
        return this.wrapper;
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
     * Sets the value of field 'collection'.
     * 
     * @param collection the value of field 'collection'.
     */
    public void setCollection(final org.exolab.castor.builder.binding.xml.types.FieldTypeCollectionType collection) {
        this.collection = collection;
    }

    /**
     * Sets the value of field 'handler'.
     * 
     * @param handler the value of field 'handler'.
     */
    public void setHandler(final String handler) {
        this.handler = handler;
    }

    /**
     * Sets the value of field 'javaType'.
     * 
     * @param javaType the value of field 'javaType'.
     */
    public void setJavaType(final String javaType) {
        this.javaType = javaType;
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
     * Sets the value of field 'validator'.
     * 
     * @param validator the value of field 'validator'.
     */
    public void setValidator(final String validator) {
        this.validator = validator;
    }

    /**
     * Sets the value of field 'visibility'.
     * 
     * @param visibility the value of field 'visibility'.
     */
    public void setVisibility(final org.exolab.castor.builder.binding.xml.types.FieldTypeVisibilityType visibility) {
        this.visibility = visibility;
    }

    /**
     * Sets the value of field 'wrapper'.
     * 
     * @param wrapper the value of field 'wrapper'.
     */
    public void setWrapper(final boolean wrapper) {
        this.wrapper = wrapper;
        this._haswrapper = true;
    }

    /**
     * Method unmarshalFieldType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.FieldType
     */
    public static FieldType unmarshalFieldType(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (FieldType) org.exolab.castor.xml.Unmarshaller.unmarshal(FieldType.class, reader);
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
