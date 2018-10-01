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
public class ComponentBindingTypeChoice implements java.io.Serializable {

    /**
     * Field javaClass.
     */
    private ClassType javaClass;

    /**
     * Field _interface.
     */
    private Interface _interface;

    /**
     * Field member.
     */
    private FieldType member;

    /**
     * Field enumDef.
     */
    private EnumBindingType enumDef;

    /**
     * Field contentMember.
     */
    private ContentMemberType contentMember;

    public ComponentBindingTypeChoice() {
        super();
    }

    /**
     * Returns the value of field 'contentMember'.
     * 
     * @return the value of field 'ContentMember'.
     */
    public ContentMemberType getContentMember() {
        return this.contentMember;
    }

    /**
     * Returns the value of field 'enumDef'.
     * 
     * @return the value of field 'EnumDef'.
     */
    public EnumBindingType getEnumDef() {
        return this.enumDef;
    }

    /**
     * Returns the value of field 'interface'.
     * 
     * @return the value of field 'Interface'.
     */
    public Interface getInterface() {
        return this._interface;
    }

    /**
     * Returns the value of field 'javaClass'.
     * 
     * @return the value of field 'JavaClass'.
     */
    public ClassType getJavaClass() {
        return this.javaClass;
    }

    /**
     * Returns the value of field 'member'.
     * 
     * @return the value of field 'Member'.
     */
    public FieldType getMember() {
        return this.member;
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
     * Sets the value of field 'contentMember'.
     * 
     * @param contentMember the value of field 'contentMember'.
     */
    public void setContentMember(final ContentMemberType contentMember) {
        this.contentMember = contentMember;
    }

    /**
     * Sets the value of field 'enumDef'.
     * 
     * @param enumDef the value of field 'enumDef'.
     */
    public void setEnumDef(final EnumBindingType enumDef) {
        this.enumDef = enumDef;
    }

    /**
     * Sets the value of field 'interface'.
     * 
     * @param _interface
     * @param interface the value of field 'interface'.
     */
    public void setInterface(final Interface _interface) {
        this._interface = _interface;
    }

    /**
     * Sets the value of field 'javaClass'.
     * 
     * @param javaClass the value of field 'javaClass'.
     */
    public void setJavaClass(final ClassType javaClass) {
        this.javaClass = javaClass;
    }

    /**
     * Sets the value of field 'member'.
     * 
     * @param member the value of field 'member'.
     */
    public void setMember(final FieldType member) {
        this.member = member;
    }

    /**
     * Method unmarshalComponentBindingTypeChoice.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice
     */
    public static ComponentBindingTypeChoice unmarshalComponentBindingTypeChoice(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (ComponentBindingTypeChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(ComponentBindingTypeChoice.class, reader);
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
