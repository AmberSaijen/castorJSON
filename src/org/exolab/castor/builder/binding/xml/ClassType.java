/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * This type gathers the needed information to generate a Java
 * Class
 *  from a binding file. Options such as generating the equals
 * method,
 *  using wrapper classes for primitives or using bound properties
 * can
 *  be defined via that element. When defined locally the options
 * override
 *  the values defined in the castor.properties file.
 *  
 * 
 * @version $Revision$ $Date$
 */
public class ClassType implements java.io.Serializable {

    /**
     * Field _package.
     */
    private String _package;

    /**
     * Field name.
     */
    private String name;

    /**
     * Field _final.
     */
    private boolean _final;

    /**
     * Keeps track of whether primitive field _final has been set
     * already.
     */
    private boolean _has_final;

    /**
     * Field _abstract.
     */
    private boolean _abstract;

    /**
     * Keeps track of whether primitive field _abstract has been
     * set already.
     */
    private boolean _has_abstract;

    /**
     * Field equals.
     */
    private boolean equals;

    /**
     * Keeps track of whether primitive field equals has been set
     * already.
     */
    private boolean _hasequals;

    /**
     * Field bound.
     */
    private boolean bound;

    /**
     * Keeps track of whether primitive field bound has been set
     * already.
     */
    private boolean _hasbound;

    private java.util.List _implementsList;

    /**
     * Field _extends.
     */
    private String _extends;

    public ClassType() {
        super();
        this._implementsList = new java.util.ArrayList();
    }

    /**
     * 
     * 
     * @param vImplements
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImplements(final String vImplements) throws IndexOutOfBoundsException {
        this._implementsList.add(vImplements);
    }

    /**
     * 
     * 
     * @param index
     * @param vImplements
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImplements(final int index,final String vImplements) throws IndexOutOfBoundsException {
        this._implementsList.add(index, vImplements);
    }

    /**
     */
    public void deleteAbstract() {
        this._has_abstract= false;
    }

    /**
     */
    public void deleteBound() {
        this._hasbound= false;
    }

    /**
     */
    public void deleteEquals() {
        this._hasequals= false;
    }

    /**
     */
    public void deleteFinal() {
        this._has_final= false;
    }

    /**
     * Method enumerateImplements.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateImplements() {
        return java.util.Collections.enumeration(this._implementsList);
    }

    /**
     * Returns the value of field 'abstract'.
     * 
     * @return the value of field 'Abstract'.
     */
    public boolean getAbstract() {
        return this._abstract;
    }

    /**
     * Returns the value of field 'bound'.
     * 
     * @return the value of field 'Bound'.
     */
    public boolean getBound() {
        return this.bound;
    }

    /**
     * Returns the value of field 'equals'.
     * 
     * @return the value of field 'Equals'.
     */
    public boolean getEquals() {
        return this.equals;
    }

    /**
     * Returns the value of field 'extends'.
     * 
     * @return the value of field 'Extends'.
     */
    public String getExtends() {
        return this._extends;
    }

    /**
     * Returns the value of field 'final'.
     * 
     * @return the value of field 'Final'.
     */
    public boolean getFinal() {
        return this._final;
    }

    /**
     * Method getImplements.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getImplements(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._implementsList.size()) {
            throw new IndexOutOfBoundsException("getImplements: Index value '" + index + "' not in range [0.." + (this._implementsList.size() - 1) + "]");
        }

        return (String) _implementsList.get(index);
    }

    /**
     * Method getImplements.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getImplements() {
        String[] array = new String[0];
        return 
        (
        String[]
        ) this._implementsList.toArray(array);
    }

    /**
     * Method getImplementsCount.
     * 
     * @return the size of this collection
     */
    public int getImplementsCount() {
        return this._implementsList.size();
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
     * Returns the value of field 'package'.
     * 
     * @return the value of field 'Package'.
     */
    public String getPackage() {
        return this._package;
    }

    /**
     * Method hasAbstract.
     * 
     * @return true if at least one Abstract has been added
     */
    public boolean hasAbstract() {
        return this._has_abstract;
    }

    /**
     * Method hasBound.
     * 
     * @return true if at least one Bound has been added
     */
    public boolean hasBound() {
        return this._hasbound;
    }

    /**
     * Method hasEquals.
     * 
     * @return true if at least one Equals has been added
     */
    public boolean hasEquals() {
        return this._hasequals;
    }

    /**
     * Method hasFinal.
     * 
     * @return true if at least one Final has been added
     */
    public boolean hasFinal() {
        return this._has_final;
    }

    /**
     * Returns the value of field 'abstract'.
     * 
     * @return the value of field 'Abstract'.
     */
    public boolean isAbstract() {
        return this._abstract;
    }

    /**
     * Returns the value of field 'bound'.
     * 
     * @return the value of field 'Bound'.
     */
    public boolean isBound() {
        return this.bound;
    }

    /**
     * Returns the value of field 'equals'.
     * 
     * @return the value of field 'Equals'.
     */
    public boolean isEquals() {
        return this.equals;
    }

    /**
     * Returns the value of field 'final'.
     * 
     * @return the value of field 'Final'.
     */
    public boolean isFinal() {
        return this._final;
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
     * Method iterateImplements.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateImplements() {
        return this._implementsList.iterator();
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
    public void removeAllImplements() {
        this._implementsList.clear();
    }

    /**
     * Method removeImplements.
     * 
     * @param vImplements
     * @return true if the object was removed from the collection.
     */
    public boolean removeImplements(final String vImplements) {
        boolean removed = _implementsList.remove(vImplements);
        return removed;
    }

    /**
     * Method removeImplementsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeImplementsAt(final int index) {
        Object obj = this._implementsList.remove(index);
        return (String) obj;
    }

    /**
     * Sets the value of field 'abstract'.
     * 
     * @param _abstract
     * @param abstract the value of field 'abstract'.
     */
    public void setAbstract(final boolean _abstract) {
        this._abstract = _abstract;
        this._has_abstract = true;
    }

    /**
     * Sets the value of field 'bound'.
     * 
     * @param bound the value of field 'bound'.
     */
    public void setBound(final boolean bound) {
        this.bound = bound;
        this._hasbound = true;
    }

    /**
     * Sets the value of field 'equals'.
     * 
     * @param equals the value of field 'equals'.
     */
    public void setEquals(final boolean equals) {
        this.equals = equals;
        this._hasequals = true;
    }

    /**
     * Sets the value of field 'extends'.
     * 
     * @param _extends
     * @param extends the value of field 'extends'.
     */
    public void setExtends(final String _extends) {
        this._extends = _extends;
    }

    /**
     * Sets the value of field 'final'.
     * 
     * @param _final
     * @param final the value of field 'final'.
     */
    public void setFinal(final boolean _final) {
        this._final = _final;
        this._has_final = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vImplements
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setImplements(final int index,final String vImplements) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._implementsList.size()) {
            throw new IndexOutOfBoundsException("setImplements: Index value '" + index + "' not in range [0.." + (this._implementsList.size() - 1) + "]");
        }

        this._implementsList.set(index, vImplements);
    }

    /**
     * 
     * 
     * @param vImplementsArray
     */
    public void setImplements(final String[] vImplementsArray) {
        //-- copy array
        _implementsList.clear();

        for (int i = 0; i < vImplementsArray.length; i++) {
                this._implementsList.add(vImplementsArray[i]);
        }
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
     * Sets the value of field 'package'.
     * 
     * @param _package
     * @param package the value of field 'package'.
     */
    public void setPackage(final String _package) {
        this._package = _package;
    }

    /**
     * Method unmarshalClassType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.ClassType
     */
    public static ClassType unmarshalClassType(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (ClassType) org.exolab.castor.xml.Unmarshaller.unmarshal(ClassType.class, reader);
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
