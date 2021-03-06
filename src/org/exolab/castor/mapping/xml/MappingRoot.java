/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml;

/**
 * Class MappingRoot.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MappingRoot implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _description.
     */
    private String _description;

    /**
     * Field _includeList.
     */
    private java.util.List<Include> _includeList;

    /**
     * The 'class' element is used to store information about
     * mapping of a class.
     *  
     */
    private java.util.List<org.exolab.castor.mapping.xml.ClassMapping> _classMappingList;

    /**
     * Field _keyGeneratorDefList.
     */
    private java.util.List<org.exolab.castor.mapping.xml.KeyGeneratorDef> _keyGeneratorDefList;

    /**
     * Field _fieldHandlerDefList.
     */
    private java.util.List<org.exolab.castor.mapping.xml.FieldHandlerDef> _fieldHandlerDefList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MappingRoot() {
        super();
        this._includeList = new java.util.ArrayList<Include>();
        this._classMappingList = new java.util.ArrayList<org.exolab.castor.mapping.xml.ClassMapping>();
        this._keyGeneratorDefList = new java.util.ArrayList<org.exolab.castor.mapping.xml.KeyGeneratorDef>();
        this._fieldHandlerDefList = new java.util.ArrayList<org.exolab.castor.mapping.xml.FieldHandlerDef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vClassMapping
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addClassMapping(
            final org.exolab.castor.mapping.xml.ClassMapping vClassMapping)
    throws IndexOutOfBoundsException {
        this._classMappingList.add(vClassMapping);
    }

    /**
     * 
     * 
     * @param index
     * @param vClassMapping
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addClassMapping(
            final int index,
            final org.exolab.castor.mapping.xml.ClassMapping vClassMapping)
    throws IndexOutOfBoundsException {
        this._classMappingList.add(index, vClassMapping);
    }

    /**
     * 
     * 
     * @param vFieldHandlerDef
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFieldHandlerDef(
            final org.exolab.castor.mapping.xml.FieldHandlerDef vFieldHandlerDef)
    throws IndexOutOfBoundsException {
        this._fieldHandlerDefList.add(vFieldHandlerDef);
    }

    /**
     * 
     * 
     * @param index
     * @param vFieldHandlerDef
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFieldHandlerDef(
            final int index,
            final org.exolab.castor.mapping.xml.FieldHandlerDef vFieldHandlerDef)
    throws IndexOutOfBoundsException {
        this._fieldHandlerDefList.add(index, vFieldHandlerDef);
    }

    /**
     * 
     * 
     * @param vInclude
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInclude(
            final Include vInclude)
    throws IndexOutOfBoundsException {
        this._includeList.add(vInclude);
    }

    /**
     * 
     * 
     * @param index
     * @param vInclude
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInclude(
            final int index,
            final Include vInclude)
    throws IndexOutOfBoundsException {
        this._includeList.add(index, vInclude);
    }

    /**
     * 
     * 
     * @param vKeyGeneratorDef
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyGeneratorDef(
            final org.exolab.castor.mapping.xml.KeyGeneratorDef vKeyGeneratorDef)
    throws IndexOutOfBoundsException {
        this._keyGeneratorDefList.add(vKeyGeneratorDef);
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyGeneratorDef
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyGeneratorDef(
            final int index,
            final org.exolab.castor.mapping.xml.KeyGeneratorDef vKeyGeneratorDef)
    throws IndexOutOfBoundsException {
        this._keyGeneratorDefList.add(index, vKeyGeneratorDef);
    }

    /**
     * Method enumerateClassMapping.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.exolab.castor.mapping.xml.ClassMapping> enumerateClassMapping(
    ) {
        return java.util.Collections.enumeration(this._classMappingList);
    }

    /**
     * Method enumerateFieldHandlerDef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.exolab.castor.mapping.xml.FieldHandlerDef> enumerateFieldHandlerDef(
    ) {
        return java.util.Collections.enumeration(this._fieldHandlerDefList);
    }

    /**
     * Method enumerateInclude.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Include> enumerateInclude(
    ) {
        return java.util.Collections.enumeration(this._includeList);
    }

    /**
     * Method enumerateKeyGeneratorDef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.exolab.castor.mapping.xml.KeyGeneratorDef> enumerateKeyGeneratorDef(
    ) {
        return java.util.Collections.enumeration(this._keyGeneratorDefList);
    }

    /**
     * Method getClassMapping.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.mapping.xml.ClassMapping at the given index
     */
    public org.exolab.castor.mapping.xml.ClassMapping getClassMapping(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._classMappingList.size()) {
            throw new IndexOutOfBoundsException("getClassMapping: Index value '" + index + "' not in range [0.." + (this._classMappingList.size() - 1) + "]");
        }

        return (org.exolab.castor.mapping.xml.ClassMapping) _classMappingList.get(index);
    }

    /**
     * Method getClassMapping.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.exolab.castor.mapping.xml.ClassMapping[] getClassMapping(
    ) {
        org.exolab.castor.mapping.xml.ClassMapping[] array = new org.exolab.castor.mapping.xml.ClassMapping[0];
        return (org.exolab.castor.mapping.xml.ClassMapping[]) this._classMappingList.toArray(array);
    }

    /**
     * Method getClassMappingCount.
     * 
     * @return the size of this collection
     */
    public int getClassMappingCount(
    ) {
        return this._classMappingList.size();
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
     * Method getFieldHandlerDef.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.mapping.xml.FieldHandlerDef at the given
     * index
     */
    public org.exolab.castor.mapping.xml.FieldHandlerDef getFieldHandlerDef(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fieldHandlerDefList.size()) {
            throw new IndexOutOfBoundsException("getFieldHandlerDef: Index value '" + index + "' not in range [0.." + (this._fieldHandlerDefList.size() - 1) + "]");
        }

        return (org.exolab.castor.mapping.xml.FieldHandlerDef) _fieldHandlerDefList.get(index);
    }

    /**
     * Method getFieldHandlerDef.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.exolab.castor.mapping.xml.FieldHandlerDef[] getFieldHandlerDef(
    ) {
        org.exolab.castor.mapping.xml.FieldHandlerDef[] array = new org.exolab.castor.mapping.xml.FieldHandlerDef[0];
        return (org.exolab.castor.mapping.xml.FieldHandlerDef[]) this._fieldHandlerDefList.toArray(array);
    }

    /**
     * Method getFieldHandlerDefCount.
     * 
     * @return the size of this collection
     */
    public int getFieldHandlerDefCount(
    ) {
        return this._fieldHandlerDefList.size();
    }

    /**
     * Method getInclude.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.mapping.xml.Include at the given index
     */
    public Include getInclude(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeList.size()) {
            throw new IndexOutOfBoundsException("getInclude: Index value '" + index + "' not in range [0.." + (this._includeList.size() - 1) + "]");
        }

        return (Include) _includeList.get(index);
    }

    /**
     * Method getInclude.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Include[] getInclude(
    ) {
        Include[] array = new Include[0];
        return (Include[]) this._includeList.toArray(array);
    }

    /**
     * Method getIncludeCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeCount(
    ) {
        return this._includeList.size();
    }

    /**
     * Method getKeyGeneratorDef.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.mapping.xml.KeyGeneratorDef at the given
     * index
     */
    public org.exolab.castor.mapping.xml.KeyGeneratorDef getKeyGeneratorDef(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keyGeneratorDefList.size()) {
            throw new IndexOutOfBoundsException("getKeyGeneratorDef: Index value '" + index + "' not in range [0.." + (this._keyGeneratorDefList.size() - 1) + "]");
        }

        return (org.exolab.castor.mapping.xml.KeyGeneratorDef) _keyGeneratorDefList.get(index);
    }

    /**
     * Method getKeyGeneratorDef.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.exolab.castor.mapping.xml.KeyGeneratorDef[] getKeyGeneratorDef(
    ) {
        org.exolab.castor.mapping.xml.KeyGeneratorDef[] array = new org.exolab.castor.mapping.xml.KeyGeneratorDef[0];
        return (org.exolab.castor.mapping.xml.KeyGeneratorDef[]) this._keyGeneratorDefList.toArray(array);
    }

    /**
     * Method getKeyGeneratorDefCount.
     * 
     * @return the size of this collection
     */
    public int getKeyGeneratorDefCount(
    ) {
        return this._keyGeneratorDefList.size();
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
     * Method iterateClassMapping.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.exolab.castor.mapping.xml.ClassMapping> iterateClassMapping(
    ) {
        return this._classMappingList.iterator();
    }

    /**
     * Method iterateFieldHandlerDef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.exolab.castor.mapping.xml.FieldHandlerDef> iterateFieldHandlerDef(
    ) {
        return this._fieldHandlerDefList.iterator();
    }

    /**
     * Method iterateInclude.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Include> iterateInclude(
    ) {
        return this._includeList.iterator();
    }

    /**
     * Method iterateKeyGeneratorDef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.exolab.castor.mapping.xml.KeyGeneratorDef> iterateKeyGeneratorDef(
    ) {
        return this._keyGeneratorDefList.iterator();
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
    public void removeAllClassMapping(
    ) {
        this._classMappingList.clear();
    }

    /**
     */
    public void removeAllFieldHandlerDef(
    ) {
        this._fieldHandlerDefList.clear();
    }

    /**
     */
    public void removeAllInclude(
    ) {
        this._includeList.clear();
    }

    /**
     */
    public void removeAllKeyGeneratorDef(
    ) {
        this._keyGeneratorDefList.clear();
    }

    /**
     * Method removeClassMapping.
     * 
     * @param vClassMapping
     * @return true if the object was removed from the collection.
     */
    public boolean removeClassMapping(
            final org.exolab.castor.mapping.xml.ClassMapping vClassMapping) {
        boolean removed = _classMappingList.remove(vClassMapping);
        return removed;
    }

    /**
     * Method removeClassMappingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.mapping.xml.ClassMapping removeClassMappingAt(
            final int index) {
        Object obj = this._classMappingList.remove(index);
        return (org.exolab.castor.mapping.xml.ClassMapping) obj;
    }

    /**
     * Method removeFieldHandlerDef.
     * 
     * @param vFieldHandlerDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeFieldHandlerDef(
            final org.exolab.castor.mapping.xml.FieldHandlerDef vFieldHandlerDef) {
        boolean removed = _fieldHandlerDefList.remove(vFieldHandlerDef);
        return removed;
    }

    /**
     * Method removeFieldHandlerDefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.mapping.xml.FieldHandlerDef removeFieldHandlerDefAt(
            final int index) {
        Object obj = this._fieldHandlerDefList.remove(index);
        return (org.exolab.castor.mapping.xml.FieldHandlerDef) obj;
    }

    /**
     * Method removeInclude.
     * 
     * @param vInclude
     * @return true if the object was removed from the collection.
     */
    public boolean removeInclude(
            final Include vInclude) {
        boolean removed = _includeList.remove(vInclude);
        return removed;
    }

    /**
     * Method removeIncludeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Include removeIncludeAt(
            final int index) {
        Object obj = this._includeList.remove(index);
        return (Include) obj;
    }

    /**
     * Method removeKeyGeneratorDef.
     * 
     * @param vKeyGeneratorDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeKeyGeneratorDef(
            final org.exolab.castor.mapping.xml.KeyGeneratorDef vKeyGeneratorDef) {
        boolean removed = _keyGeneratorDefList.remove(vKeyGeneratorDef);
        return removed;
    }

    /**
     * Method removeKeyGeneratorDefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.mapping.xml.KeyGeneratorDef removeKeyGeneratorDefAt(
            final int index) {
        Object obj = this._keyGeneratorDefList.remove(index);
        return (org.exolab.castor.mapping.xml.KeyGeneratorDef) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vClassMapping
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setClassMapping(
            final int index,
            final org.exolab.castor.mapping.xml.ClassMapping vClassMapping)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._classMappingList.size()) {
            throw new IndexOutOfBoundsException("setClassMapping: Index value '" + index + "' not in range [0.." + (this._classMappingList.size() - 1) + "]");
        }

        this._classMappingList.set(index, vClassMapping);
    }

    /**
     * 
     * 
     * @param vClassMappingArray
     */
    public void setClassMapping(
            final org.exolab.castor.mapping.xml.ClassMapping[] vClassMappingArray) {
        //-- copy array
        _classMappingList.clear();

        for (int i = 0; i < vClassMappingArray.length; i++) {
                this._classMappingList.add(vClassMappingArray[i]);
        }
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
     * 
     * 
     * @param index
     * @param vFieldHandlerDef
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFieldHandlerDef(
            final int index,
            final org.exolab.castor.mapping.xml.FieldHandlerDef vFieldHandlerDef)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._fieldHandlerDefList.size()) {
            throw new IndexOutOfBoundsException("setFieldHandlerDef: Index value '" + index + "' not in range [0.." + (this._fieldHandlerDefList.size() - 1) + "]");
        }

        this._fieldHandlerDefList.set(index, vFieldHandlerDef);
    }

    /**
     * 
     * 
     * @param vFieldHandlerDefArray
     */
    public void setFieldHandlerDef(
            final org.exolab.castor.mapping.xml.FieldHandlerDef[] vFieldHandlerDefArray) {
        //-- copy array
        _fieldHandlerDefList.clear();

        for (int i = 0; i < vFieldHandlerDefArray.length; i++) {
                this._fieldHandlerDefList.add(vFieldHandlerDefArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vInclude
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInclude(
            final int index,
            final Include vInclude)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeList.size()) {
            throw new IndexOutOfBoundsException("setInclude: Index value '" + index + "' not in range [0.." + (this._includeList.size() - 1) + "]");
        }

        this._includeList.set(index, vInclude);
    }

    /**
     * 
     * 
     * @param vIncludeArray
     */
    public void setInclude(
            final Include[] vIncludeArray) {
        //-- copy array
        _includeList.clear();

        for (int i = 0; i < vIncludeArray.length; i++) {
                this._includeList.add(vIncludeArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyGeneratorDef
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKeyGeneratorDef(
            final int index,
            final org.exolab.castor.mapping.xml.KeyGeneratorDef vKeyGeneratorDef)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keyGeneratorDefList.size()) {
            throw new IndexOutOfBoundsException("setKeyGeneratorDef: Index value '" + index + "' not in range [0.." + (this._keyGeneratorDefList.size() - 1) + "]");
        }

        this._keyGeneratorDefList.set(index, vKeyGeneratorDef);
    }

    /**
     * 
     * 
     * @param vKeyGeneratorDefArray
     */
    public void setKeyGeneratorDef(
            final org.exolab.castor.mapping.xml.KeyGeneratorDef[] vKeyGeneratorDefArray) {
        //-- copy array
        _keyGeneratorDefList.clear();

        for (int i = 0; i < vKeyGeneratorDefArray.length; i++) {
                this._keyGeneratorDefList.add(vKeyGeneratorDefArray[i]);
        }
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
     * org.exolab.castor.mapping.xml.MappingRoot
     */
    public static MappingRoot unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (MappingRoot) org.exolab.castor.xml.Unmarshaller.unmarshal(MappingRoot.class, reader);
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
