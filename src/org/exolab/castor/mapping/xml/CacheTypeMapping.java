/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml;

/**
 * Class CacheTypeMapping.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CacheTypeMapping implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type.
     */
    private String _type = "count-limited";

    /**
     * Field _debug.
     */
    private boolean _debug = false;

    /**
     * keeps track of state for field: _debug
     */
    private boolean _has_debug;

    /**
     * Field _capacity.
     */
    private long _capacity;

    /**
     * keeps track of state for field: _capacity
     */
    private boolean _has_capacity;

    /**
     * Field _paramList.
     */
    private java.util.List<Param> _paramList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CacheTypeMapping() {
        super();
        setType("count-limited");
        this._paramList = new java.util.ArrayList<Param>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParam
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParam(
            final Param vParam)
    throws IndexOutOfBoundsException {
        this._paramList.add(vParam);
    }

    /**
     * 
     * 
     * @param index
     * @param vParam
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParam(
            final int index,
            final Param vParam)
    throws IndexOutOfBoundsException {
        this._paramList.add(index, vParam);
    }

    /**
     */
    public void deleteCapacity(
    ) {
        this._has_capacity= false;
    }

    /**
     */
    public void deleteDebug(
    ) {
        this._has_debug= false;
    }

    /**
     * Method enumerateParam.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Param> enumerateParam(
    ) {
        return java.util.Collections.enumeration(this._paramList);
    }

    /**
     * Returns the value of field 'capacity'.
     * 
     * @return the value of field 'Capacity'.
     */
    public long getCapacity(
    ) {
        return this._capacity;
    }

    /**
     * Returns the value of field 'debug'.
     * 
     * @return the value of field 'Debug'.
     */
    public boolean getDebug(
    ) {
        return this._debug;
    }

    /**
     * Method getParam.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.exolab.castor.mapping.xml.Param
     * at the given index
     */
    public Param getParam(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._paramList.size()) {
            throw new IndexOutOfBoundsException("getParam: Index value '" + index + "' not in range [0.." + (this._paramList.size() - 1) + "]");
        }

        return (Param) _paramList.get(index);
    }

    /**
     * Method getParam.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Param[] getParam(
    ) {
        Param[] array = new Param[0];
        return (Param[]) this._paramList.toArray(array);
    }

    /**
     * Method getParamCount.
     * 
     * @return the size of this collection
     */
    public int getParamCount(
    ) {
        return this._paramList.size();
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
     * Method hasCapacity.
     * 
     * @return true if at least one Capacity has been added
     */
    public boolean hasCapacity(
    ) {
        return this._has_capacity;
    }

    /**
     * Method hasDebug.
     * 
     * @return true if at least one Debug has been added
     */
    public boolean hasDebug(
    ) {
        return this._has_debug;
    }

    /**
     * Returns the value of field 'debug'.
     * 
     * @return the value of field 'Debug'.
     */
    public boolean isDebug(
    ) {
        return this._debug;
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
     * Method iterateParam.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Param> iterateParam(
    ) {
        return this._paramList.iterator();
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
     */
    public void removeAllParam(
    ) {
        this._paramList.clear();
    }

    /**
     * Method removeParam.
     * 
     * @param vParam
     * @return true if the object was removed from the collection.
     */
    public boolean removeParam(
            final Param vParam) {
        boolean removed = _paramList.remove(vParam);
        return removed;
    }

    /**
     * Method removeParamAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Param removeParamAt(
            final int index) {
        Object obj = this._paramList.remove(index);
        return (Param) obj;
    }

    /**
     * Sets the value of field 'capacity'.
     * 
     * @param capacity the value of field 'capacity'.
     */
    public void setCapacity(
            final long capacity) {
        this._capacity = capacity;
        this._has_capacity = true;
    }

    /**
     * Sets the value of field 'debug'.
     * 
     * @param debug the value of field 'debug'.
     */
    public void setDebug(
            final boolean debug) {
        this._debug = debug;
        this._has_debug = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vParam
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParam(
            final int index,
            final Param vParam)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._paramList.size()) {
            throw new IndexOutOfBoundsException("setParam: Index value '" + index + "' not in range [0.." + (this._paramList.size() - 1) + "]");
        }

        this._paramList.set(index, vParam);
    }

    /**
     * 
     * 
     * @param vParamArray
     */
    public void setParam(
            final Param[] vParamArray) {
        //-- copy array
        _paramList.clear();

        for (int i = 0; i < vParamArray.length; i++) {
                this._paramList.add(vParamArray[i]);
        }
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
     * org.exolab.castor.mapping.xml.CacheTypeMapping
     */
    public static CacheTypeMapping unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (CacheTypeMapping) org.exolab.castor.xml.Unmarshaller.unmarshal(CacheTypeMapping.class, reader);
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
