/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml;

/**
 * Class Container.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Container implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private String _name;

    /**
     * Field _type.
     */
    private String _type;

    /**
     * Field _required.
     */
    private boolean _required = false;

    /**
     * keeps track of state for field: _required
     */
    private boolean _has_required;

    /**
     * Field _direct.
     */
    private boolean _direct = false;

    /**
     * keeps track of state for field: _direct
     */
    private boolean _has_direct;

    /**
     * Field _getMethod.
     */
    private String _getMethod;

    /**
     * Field _setMethod.
     */
    private String _setMethod;

    /**
     * Field _createMethod.
     */
    private String _createMethod;

    /**
     * Field _description.
     */
    private String _description;

    /**
     * The 'field' element is used to describe the property of a
     * Java object.
     *  
     */
    private org.exolab.castor.mapping.xml.FieldMapping _fieldMapping;


      //----------------/
     //- Constructors -/
    //----------------/

    public Container() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDirect(
    ) {
        this._has_direct= false;
    }

    /**
     */
    public void deleteRequired(
    ) {
        this._has_required= false;
    }

    /**
     * Returns the value of field 'createMethod'.
     * 
     * @return the value of field 'CreateMethod'.
     */
    public String getCreateMethod(
    ) {
        return this._createMethod;
    }

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'Description'.
     */
    public String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'direct'.
     * 
     * @return the value of field 'Direct'.
     */
    public boolean getDirect(
    ) {
        return this._direct;
    }

    /**
     * Returns the value of field 'fieldMapping'. The field
     * 'fieldMapping' has the following description: The 'field'
     * element is used to describe the property of a Java object.
     *  
     * 
     * @return the value of field 'FieldMapping'.
     */
    public org.exolab.castor.mapping.xml.FieldMapping getFieldMapping(
    ) {
        return this._fieldMapping;
    }

    /**
     * Returns the value of field 'getMethod'.
     * 
     * @return the value of field 'GetMethod'.
     */
    public String getGetMethod(
    ) {
        return this._getMethod;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'required'.
     * 
     * @return the value of field 'Required'.
     */
    public boolean getRequired(
    ) {
        return this._required;
    }

    /**
     * Returns the value of field 'setMethod'.
     * 
     * @return the value of field 'SetMethod'.
     */
    public String getSetMethod(
    ) {
        return this._setMethod;
    }

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public String getType(
    ) {
        return this._type;
    }

    /**
     * Method hasDirect.
     * 
     * @return true if at least one Direct has been added
     */
    public boolean hasDirect(
    ) {
        return this._has_direct;
    }

    /**
     * Method hasRequired.
     * 
     * @return true if at least one Required has been added
     */
    public boolean hasRequired(
    ) {
        return this._has_required;
    }

    /**
     * Returns the value of field 'direct'.
     * 
     * @return the value of field 'Direct'.
     */
    public boolean isDirect(
    ) {
        return this._direct;
    }

    /**
     * Returns the value of field 'required'.
     * 
     * @return the value of field 'Required'.
     */
    public boolean isRequired(
    ) {
        return this._required;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
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
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
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
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'createMethod'.
     * 
     * @param createMethod the value of field 'createMethod'.
     */
    public void setCreateMethod(
            final String createMethod) {
        this._createMethod = createMethod;
    }

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'direct'.
     * 
     * @param direct the value of field 'direct'.
     */
    public void setDirect(
            final boolean direct) {
        this._direct = direct;
        this._has_direct = true;
    }

    /**
     * Sets the value of field 'fieldMapping'. The field
     * 'fieldMapping' has the following description: The 'field'
     * element is used to describe the property of a Java object.
     *  
     * 
     * @param fieldMapping the value of field 'fieldMapping'.
     */
    public void setFieldMapping(
            final org.exolab.castor.mapping.xml.FieldMapping fieldMapping) {
        this._fieldMapping = fieldMapping;
    }

    /**
     * Sets the value of field 'getMethod'.
     * 
     * @param getMethod the value of field 'getMethod'.
     */
    public void setGetMethod(
            final String getMethod) {
        this._getMethod = getMethod;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'required'.
     * 
     * @param required the value of field 'required'.
     */
    public void setRequired(
            final boolean required) {
        this._required = required;
        this._has_required = true;
    }

    /**
     * Sets the value of field 'setMethod'.
     * 
     * @param setMethod the value of field 'setMethod'.
     */
    public void setSetMethod(
            final String setMethod) {
        this._setMethod = setMethod;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final String type) {
        this._type = type;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.mapping.xml.Container
     */
    public static Container unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (Container) org.exolab.castor.xml.Unmarshaller.unmarshal(Container.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
