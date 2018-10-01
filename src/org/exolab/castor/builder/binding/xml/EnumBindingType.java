/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * This type allows the mapping between an XML schema enumeration
 *  and a java class that follows the type-safe enumeration
 * paradigm.
 *  Additionally, it allows the specify the name of the Java
 * constant
 *  definition for a given enumeraton value.
 *  
 * 
 * @version $Revision$ $Date$
 */
public class EnumBindingType implements java.io.Serializable {

    /**
     * Field enumClassName.
     */
    private EnumClassName enumClassName;

    private java.util.List enumMemberList;

    public EnumBindingType() {
        super();
        this.enumMemberList = new java.util.ArrayList();
    }

    /**
     * 
     * 
     * @param vEnumMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnumMember(final EnumMember vEnumMember) throws IndexOutOfBoundsException {
        this.enumMemberList.add(vEnumMember);
    }

    /**
     * 
     * 
     * @param index
     * @param vEnumMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnumMember(final int index,final EnumMember vEnumMember) throws IndexOutOfBoundsException {
        this.enumMemberList.add(index, vEnumMember);
    }

    /**
     * Method enumerateEnumMember.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateEnumMember() {
        return java.util.Collections.enumeration(this.enumMemberList);
    }

    /**
     * Returns the value of field 'enumClassName'.
     * 
     * @return the value of field 'EnumClassName'.
     */
    public EnumClassName getEnumClassName() {
        return this.enumClassName;
    }

    /**
     * Method getEnumMember.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.EnumMember at the
     * given index
     */
    public EnumMember getEnumMember(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.enumMemberList.size()) {
            throw new IndexOutOfBoundsException("getEnumMember: Index value '" + index + "' not in range [0.." + (this.enumMemberList.size() - 1) + "]");
        }

        return (EnumMember) enumMemberList.get(index);
    }

    /**
     * Method getEnumMember.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public EnumMember[] getEnumMember() {
        EnumMember[] array = new EnumMember[0];
        return 
        (
        EnumMember[]
        ) this.enumMemberList.toArray(array);
    }

    /**
     * Method getEnumMemberCount.
     * 
     * @return the size of this collection
     */
    public int getEnumMemberCount() {
        return this.enumMemberList.size();
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
     * Method iterateEnumMember.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateEnumMember() {
        return this.enumMemberList.iterator();
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
     */
    public void removeAllEnumMember() {
        this.enumMemberList.clear();
    }

    /**
     * Method removeEnumMember.
     * 
     * @param vEnumMember
     * @return true if the object was removed from the collection.
     */
    public boolean removeEnumMember(final EnumMember vEnumMember) {
        boolean removed = enumMemberList.remove(vEnumMember);
        return removed;
    }

    /**
     * Method removeEnumMemberAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public EnumMember removeEnumMemberAt(final int index) {
        Object obj = this.enumMemberList.remove(index);
        return (EnumMember) obj;
    }

    /**
     * Sets the value of field 'enumClassName'.
     * 
     * @param enumClassName the value of field 'enumClassName'.
     */
    public void setEnumClassName(final EnumClassName enumClassName) {
        this.enumClassName = enumClassName;
    }

    /**
     * 
     * 
     * @param index
     * @param vEnumMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEnumMember(final int index,final EnumMember vEnumMember) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.enumMemberList.size()) {
            throw new IndexOutOfBoundsException("setEnumMember: Index value '" + index + "' not in range [0.." + (this.enumMemberList.size() - 1) + "]");
        }

        this.enumMemberList.set(index, vEnumMember);
    }

    /**
     * 
     * 
     * @param vEnumMemberArray
     */
    public void setEnumMember(final EnumMember[] vEnumMemberArray) {
        //-- copy array
        enumMemberList.clear();

        for (int i = 0; i < vEnumMemberArray.length; i++) {
                this.enumMemberList.add(vEnumMemberArray[i]);
        }
    }

    /**
     * Method unmarshalEnumBindingType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.EnumBindingType
     */
    public static EnumBindingType unmarshalEnumBindingType(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (EnumBindingType) org.exolab.castor.xml.Unmarshaller.unmarshal(EnumBindingType.class, reader);
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
