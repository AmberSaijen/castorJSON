/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.xml.schema.annotations.jdo;

/**
 * Element 'column' is used to specify the column where the
 *  property of an object will be saved.
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Column extends org.exolab.castor.xml.schema.annotations.jdo.ReadonlyDirtyType 
implements java.io.Serializable
{

    /**
     * Attribute 'name' is used to specify the
     *  name of the column.
     *  
     */
    private String name;

    /**
     * Attribute 'type' is used to specify the
     *  JDO-type of the column.
     *  
     */
    private String type;

    /**
     * Specifies if this field accepts NULL
     *  values or not.
     *  
     */
    private boolean acceptNull = true;

    /**
     * Keeps track of whether primitive field acceptNull has been
     * set already.
     */
    private boolean _hasacceptNull;

    public Column() {
        super();
    }

    /**
     */
    public void deleteAcceptNull() {
        this._hasacceptNull= false;
    }

    /**
     * Returns the value of field 'acceptNull'. The field
     * 'acceptNull' has the following description: Specifies if
     * this field accepts NULL
     *  values or not.
     *  
     * 
     * @return the value of field 'AcceptNull'.
     */
    public boolean getAcceptNull() {
        return this.acceptNull;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Attribute 'name' is used to specify
     * the
     *  name of the column.
     *  
     * 
     * @return the value of field 'Name'.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Attribute 'type' is used to specify
     * the
     *  JDO-type of the column.
     *  
     * 
     * @return the value of field 'Type'.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Method hasAcceptNull.
     * 
     * @return true if at least one AcceptNull has been added
     */
    public boolean hasAcceptNull() {
        return this._hasacceptNull;
    }

    /**
     * Returns the value of field 'acceptNull'. The field
     * 'acceptNull' has the following description: Specifies if
     * this field accepts NULL
     *  values or not.
     *  
     * 
     * @return the value of field 'AcceptNull'.
     */
    public boolean isAcceptNull() {
        return this.acceptNull;
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
     * Sets the value of field 'acceptNull'. The field 'acceptNull'
     * has the following description: Specifies if this field
     * accepts NULL
     *  values or not.
     *  
     * 
     * @param acceptNull the value of field 'acceptNull'.
     */
    public void setAcceptNull(final boolean acceptNull) {
        this.acceptNull = acceptNull;
        this._hasacceptNull = true;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Attribute 'name' is used to specify
     * the
     *  name of the column.
     *  
     * 
     * @param name the value of field 'name'.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Attribute 'type' is used to specify
     * the
     *  JDO-type of the column.
     *  
     * 
     * @param type the value of field 'type'.
     */
    public void setType(final String type) {
        this.type = type;
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
     * org.exolab.castor.xml.schema.annotations.jdo.Column
     */
    public static Column unmarshal(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (Column) org.exolab.castor.xml.Unmarshaller.unmarshal(Column.class, reader);
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
