/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml;

/**
 * The 'class' element is used to store information about mapping
 * of a class.
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ClassMapping implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Specifies the fully qualified package name of the Java
     * object needed to be mapped.
     *  
     */
    private String _name;

    /**
     * An optional attribute to specify the extension realtionship 
     *  between objects. Used only if mapping of the another object
     * 
     *  is provided.
     *  
     */
    private Object _extends;

    /**
     * An optional attribute to specify that one object depends on 
     *  another object.
     *  
     */
    private Object _depends;

    /**
     * An optional attribute for specifying the unique
     * identificator 
     *  of the object within the persistence storage. 
     *  
     */
    private java.util.List<String> _identity;

    /**
     * Field _access.
     */
    private org.exolab.castor.mapping.xml.types.ClassMappingAccessType _access = org.exolab.castor.mapping.xml.types.ClassMappingAccessType.valueOf("shared");

    /**
     * Field _keyGenerator.
     */
    private String _keyGenerator;

    /**
     * Field _autoComplete.
     */
    private boolean _autoComplete = false;

    /**
     * keeps track of state for field: _autoComplete
     */
    private boolean _has_autoComplete;

    /**
     * Field _verifyConstructable.
     */
    private boolean _verifyConstructable = true;

    /**
     * keeps track of state for field: _verifyConstructable
     */
    private boolean _has_verifyConstructable;

    /**
     * Field _version.
     */
    private String _version;

    /**
     * Field _description.
     */
    private String _description;

    /**
     * Field _cacheTypeMapping.
     */
    private org.exolab.castor.mapping.xml.CacheTypeMapping _cacheTypeMapping;

    /**
     * The 'map-to' element is used for specifying the name of the
     * item 
     *  that should be associated with the given Java object.
     *  
     */
    private MapTo _mapTo;

    /**
     * Field _namedQueryList.
     */
    private java.util.List<NamedQuery> _namedQueryList;

    /**
     * Field _namedNativeQueryList.
     */
    private java.util.List<org.exolab.castor.mapping.xml.NamedNativeQuery> _namedNativeQueryList;

    /**
     * Field _classChoice.
     */
    private ClassChoice _classChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public ClassMapping() {
        super();
        this._identity = new java.util.ArrayList<String>();
        setAccess(org.exolab.castor.mapping.xml.types.ClassMappingAccessType.valueOf("shared"));
        this._namedQueryList = new java.util.ArrayList<NamedQuery>();
        this._namedNativeQueryList = new java.util.ArrayList<org.exolab.castor.mapping.xml.NamedNativeQuery>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIdentity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIdentity(
            final String vIdentity)
    throws IndexOutOfBoundsException {
        this._identity.add(vIdentity);
    }

    /**
     * 
     * 
     * @param index
     * @param vIdentity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIdentity(
            final int index,
            final String vIdentity)
    throws IndexOutOfBoundsException {
        this._identity.add(index, vIdentity);
    }

    /**
     * 
     * 
     * @param vNamedNativeQuery
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNamedNativeQuery(
            final org.exolab.castor.mapping.xml.NamedNativeQuery vNamedNativeQuery)
    throws IndexOutOfBoundsException {
        this._namedNativeQueryList.add(vNamedNativeQuery);
    }

    /**
     * 
     * 
     * @param index
     * @param vNamedNativeQuery
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNamedNativeQuery(
            final int index,
            final org.exolab.castor.mapping.xml.NamedNativeQuery vNamedNativeQuery)
    throws IndexOutOfBoundsException {
        this._namedNativeQueryList.add(index, vNamedNativeQuery);
    }

    /**
     * 
     * 
     * @param vNamedQuery
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNamedQuery(
            final NamedQuery vNamedQuery)
    throws IndexOutOfBoundsException {
        this._namedQueryList.add(vNamedQuery);
    }

    /**
     * 
     * 
     * @param index
     * @param vNamedQuery
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNamedQuery(
            final int index,
            final NamedQuery vNamedQuery)
    throws IndexOutOfBoundsException {
        this._namedQueryList.add(index, vNamedQuery);
    }

    /**
     */
    public void deleteAutoComplete(
    ) {
        this._has_autoComplete= false;
    }

    /**
     */
    public void deleteVerifyConstructable(
    ) {
        this._has_verifyConstructable= false;
    }

    /**
     * Method enumerateIdentity.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateIdentity(
    ) {
        return java.util.Collections.enumeration(this._identity);
    }

    /**
     * Method enumerateNamedNativeQuery.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.exolab.castor.mapping.xml.NamedNativeQuery> enumerateNamedNativeQuery(
    ) {
        return java.util.Collections.enumeration(this._namedNativeQueryList);
    }

    /**
     * Method enumerateNamedQuery.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends NamedQuery> enumerateNamedQuery(
    ) {
        return java.util.Collections.enumeration(this._namedQueryList);
    }

    /**
     * Returns the value of field 'access'.
     * 
     * @return the value of field 'Access'.
     */
    public org.exolab.castor.mapping.xml.types.ClassMappingAccessType getAccess(
    ) {
        return this._access;
    }

    /**
     * Returns the value of field 'autoComplete'.
     * 
     * @return the value of field 'AutoComplete'.
     */
    public boolean getAutoComplete(
    ) {
        return this._autoComplete;
    }

    /**
     * Returns the value of field 'cacheTypeMapping'.
     * 
     * @return the value of field 'CacheTypeMapping'.
     */
    public org.exolab.castor.mapping.xml.CacheTypeMapping getCacheTypeMapping(
    ) {
        return this._cacheTypeMapping;
    }

    /**
     * Returns the value of field 'classChoice'.
     * 
     * @return the value of field 'ClassChoice'.
     */
    public ClassChoice getClassChoice(
    ) {
        return this._classChoice;
    }

    /**
     * Returns the value of field 'depends'. The field 'depends'
     * has the following description: An optional attribute to
     * specify that one object depends on 
     *  another object.
     *  
     * 
     * @return the value of field 'Depends'.
     */
    public Object getDepends(
    ) {
        return this._depends;
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
     * Returns the value of field 'extends'. The field 'extends'
     * has the following description: An optional attribute to
     * specify the extension realtionship 
     *  between objects. Used only if mapping of the another object
     * 
     *  is provided.
     *  
     * 
     * @return the value of field 'Extends'.
     */
    public Object getExtends(
    ) {
        return this._extends;
    }

    /**
     * Method getIdentity.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getIdentity(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._identity.size()) {
            throw new IndexOutOfBoundsException("getIdentity: Index value '" + index + "' not in range [0.." + (this._identity.size() - 1) + "]");
        }

        return (String) _identity.get(index);
    }

    /**
     * Method getIdentity.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getIdentity(
    ) {
        String[] array = new String[0];
        return (String[]) this._identity.toArray(array);
    }

    /**
     * Method getIdentityCount.
     * 
     * @return the size of this collection
     */
    public int getIdentityCount(
    ) {
        return this._identity.size();
    }

    /**
     * Returns the value of field 'keyGenerator'.
     * 
     * @return the value of field 'KeyGenerator'.
     */
    public String getKeyGenerator(
    ) {
        return this._keyGenerator;
    }

    /**
     * Returns the value of field 'mapTo'. The field 'mapTo' has
     * the following description: The 'map-to' element is used for
     * specifying the name of the item 
     *  that should be associated with the given Java object.
     *  
     * 
     * @return the value of field 'MapTo'.
     */
    public MapTo getMapTo(
    ) {
        return this._mapTo;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Specifies the fully qualified package
     * name of the Java object needed to be mapped.
     *  
     * 
     * @return the value of field 'Name'.
     */
    public String getName(
    ) {
        return this._name;
    }

    /**
     * Method getNamedNativeQuery.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.mapping.xml.NamedNativeQuery at the given
     * index
     */
    public org.exolab.castor.mapping.xml.NamedNativeQuery getNamedNativeQuery(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._namedNativeQueryList.size()) {
            throw new IndexOutOfBoundsException("getNamedNativeQuery: Index value '" + index + "' not in range [0.." + (this._namedNativeQueryList.size() - 1) + "]");
        }

        return (org.exolab.castor.mapping.xml.NamedNativeQuery) _namedNativeQueryList.get(index);
    }

    /**
     * Method getNamedNativeQuery.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.exolab.castor.mapping.xml.NamedNativeQuery[] getNamedNativeQuery(
    ) {
        org.exolab.castor.mapping.xml.NamedNativeQuery[] array = new org.exolab.castor.mapping.xml.NamedNativeQuery[0];
        return (org.exolab.castor.mapping.xml.NamedNativeQuery[]) this._namedNativeQueryList.toArray(array);
    }

    /**
     * Method getNamedNativeQueryCount.
     * 
     * @return the size of this collection
     */
    public int getNamedNativeQueryCount(
    ) {
        return this._namedNativeQueryList.size();
    }

    /**
     * Method getNamedQuery.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.mapping.xml.NamedQuery at the given index
     */
    public NamedQuery getNamedQuery(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._namedQueryList.size()) {
            throw new IndexOutOfBoundsException("getNamedQuery: Index value '" + index + "' not in range [0.." + (this._namedQueryList.size() - 1) + "]");
        }

        return (NamedQuery) _namedQueryList.get(index);
    }

    /**
     * Method getNamedQuery.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public NamedQuery[] getNamedQuery(
    ) {
        NamedQuery[] array = new NamedQuery[0];
        return (NamedQuery[]) this._namedQueryList.toArray(array);
    }

    /**
     * Method getNamedQueryCount.
     * 
     * @return the size of this collection
     */
    public int getNamedQueryCount(
    ) {
        return this._namedQueryList.size();
    }

    /**
     * Returns the value of field 'verifyConstructable'.
     * 
     * @return the value of field 'VerifyConstructable'.
     */
    public boolean getVerifyConstructable(
    ) {
        return this._verifyConstructable;
    }

    /**
     * Returns the value of field 'version'.
     * 
     * @return the value of field 'Version'.
     */
    public String getVersion(
    ) {
        return this._version;
    }

    /**
     * Method hasAutoComplete.
     * 
     * @return true if at least one AutoComplete has been added
     */
    public boolean hasAutoComplete(
    ) {
        return this._has_autoComplete;
    }

    /**
     * Method hasVerifyConstructable.
     * 
     * @return true if at least one VerifyConstructable has been
     * added
     */
    public boolean hasVerifyConstructable(
    ) {
        return this._has_verifyConstructable;
    }

    /**
     * Returns the value of field 'autoComplete'.
     * 
     * @return the value of field 'AutoComplete'.
     */
    public boolean isAutoComplete(
    ) {
        return this._autoComplete;
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
     * Returns the value of field 'verifyConstructable'.
     * 
     * @return the value of field 'VerifyConstructable'.
     */
    public boolean isVerifyConstructable(
    ) {
        return this._verifyConstructable;
    }

    /**
     * Method iterateIdentity.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateIdentity(
    ) {
        return this._identity.iterator();
    }

    /**
     * Method iterateNamedNativeQuery.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.exolab.castor.mapping.xml.NamedNativeQuery> iterateNamedNativeQuery(
    ) {
        return this._namedNativeQueryList.iterator();
    }

    /**
     * Method iterateNamedQuery.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends NamedQuery> iterateNamedQuery(
    ) {
        return this._namedQueryList.iterator();
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
    public void removeAllIdentity(
    ) {
        this._identity.clear();
    }

    /**
     */
    public void removeAllNamedNativeQuery(
    ) {
        this._namedNativeQueryList.clear();
    }

    /**
     */
    public void removeAllNamedQuery(
    ) {
        this._namedQueryList.clear();
    }

    /**
     * Method removeIdentity.
     * 
     * @param vIdentity
     * @return true if the object was removed from the collection.
     */
    public boolean removeIdentity(
            final String vIdentity) {
        boolean removed = _identity.remove(vIdentity);
        return removed;
    }

    /**
     * Method removeIdentityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeIdentityAt(
            final int index) {
        Object obj = this._identity.remove(index);
        return (String) obj;
    }

    /**
     * Method removeNamedNativeQuery.
     * 
     * @param vNamedNativeQuery
     * @return true if the object was removed from the collection.
     */
    public boolean removeNamedNativeQuery(
            final org.exolab.castor.mapping.xml.NamedNativeQuery vNamedNativeQuery) {
        boolean removed = _namedNativeQueryList.remove(vNamedNativeQuery);
        return removed;
    }

    /**
     * Method removeNamedNativeQueryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.mapping.xml.NamedNativeQuery removeNamedNativeQueryAt(
            final int index) {
        Object obj = this._namedNativeQueryList.remove(index);
        return (org.exolab.castor.mapping.xml.NamedNativeQuery) obj;
    }

    /**
     * Method removeNamedQuery.
     * 
     * @param vNamedQuery
     * @return true if the object was removed from the collection.
     */
    public boolean removeNamedQuery(
            final NamedQuery vNamedQuery) {
        boolean removed = _namedQueryList.remove(vNamedQuery);
        return removed;
    }

    /**
     * Method removeNamedQueryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public NamedQuery removeNamedQueryAt(
            final int index) {
        Object obj = this._namedQueryList.remove(index);
        return (NamedQuery) obj;
    }

    /**
     * Sets the value of field 'access'.
     * 
     * @param access the value of field 'access'.
     */
    public void setAccess(
            final org.exolab.castor.mapping.xml.types.ClassMappingAccessType access) {
        this._access = access;
    }

    /**
     * Sets the value of field 'autoComplete'.
     * 
     * @param autoComplete the value of field 'autoComplete'.
     */
    public void setAutoComplete(
            final boolean autoComplete) {
        this._autoComplete = autoComplete;
        this._has_autoComplete = true;
    }

    /**
     * Sets the value of field 'cacheTypeMapping'.
     * 
     * @param cacheTypeMapping the value of field 'cacheTypeMapping'
     */
    public void setCacheTypeMapping(
            final org.exolab.castor.mapping.xml.CacheTypeMapping cacheTypeMapping) {
        this._cacheTypeMapping = cacheTypeMapping;
    }

    /**
     * Sets the value of field 'classChoice'.
     * 
     * @param classChoice the value of field 'classChoice'.
     */
    public void setClassChoice(
            final ClassChoice classChoice) {
        this._classChoice = classChoice;
    }

    /**
     * Sets the value of field 'depends'. The field 'depends' has
     * the following description: An optional attribute to specify
     * that one object depends on 
     *  another object.
     *  
     * 
     * @param depends the value of field 'depends'.
     */
    public void setDepends(
            final Object depends) {
        this._depends = depends;
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
     * Sets the value of field 'extends'. The field 'extends' has
     * the following description: An optional attribute to specify
     * the extension realtionship 
     *  between objects. Used only if mapping of the another object
     * 
     *  is provided.
     *  
     * 
     * @param _extends
     * @param extends the value of field 'extends'.
     */
    public void setExtends(
            final Object _extends) {
        this._extends = _extends;
    }

    /**
     * 
     * 
     * @param index
     * @param vIdentity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIdentity(
            final int index,
            final String vIdentity)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._identity.size()) {
            throw new IndexOutOfBoundsException("setIdentity: Index value '" + index + "' not in range [0.." + (this._identity.size() - 1) + "]");
        }

        this._identity.set(index, vIdentity);
    }

    /**
     * 
     * 
     * @param vIdentityArray
     */
    public void setIdentity(
            final String[] vIdentityArray) {
        //-- copy array
        _identity.clear();

        for (int i = 0; i < vIdentityArray.length; i++) {
                this._identity.add(vIdentityArray[i]);
        }
    }

    /**
     * Sets the value of field 'keyGenerator'.
     * 
     * @param keyGenerator the value of field 'keyGenerator'.
     */
    public void setKeyGenerator(
            final String keyGenerator) {
        this._keyGenerator = keyGenerator;
    }

    /**
     * Sets the value of field 'mapTo'. The field 'mapTo' has the
     * following description: The 'map-to' element is used for
     * specifying the name of the item 
     *  that should be associated with the given Java object.
     *  
     * 
     * @param mapTo the value of field 'mapTo'.
     */
    public void setMapTo(
            final MapTo mapTo) {
        this._mapTo = mapTo;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Specifies the fully qualified package
     * name of the Java object needed to be mapped.
     *  
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final String name) {
        this._name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vNamedNativeQuery
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNamedNativeQuery(
            final int index,
            final org.exolab.castor.mapping.xml.NamedNativeQuery vNamedNativeQuery)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._namedNativeQueryList.size()) {
            throw new IndexOutOfBoundsException("setNamedNativeQuery: Index value '" + index + "' not in range [0.." + (this._namedNativeQueryList.size() - 1) + "]");
        }

        this._namedNativeQueryList.set(index, vNamedNativeQuery);
    }

    /**
     * 
     * 
     * @param vNamedNativeQueryArray
     */
    public void setNamedNativeQuery(
            final org.exolab.castor.mapping.xml.NamedNativeQuery[] vNamedNativeQueryArray) {
        //-- copy array
        _namedNativeQueryList.clear();

        for (int i = 0; i < vNamedNativeQueryArray.length; i++) {
                this._namedNativeQueryList.add(vNamedNativeQueryArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vNamedQuery
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNamedQuery(
            final int index,
            final NamedQuery vNamedQuery)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._namedQueryList.size()) {
            throw new IndexOutOfBoundsException("setNamedQuery: Index value '" + index + "' not in range [0.." + (this._namedQueryList.size() - 1) + "]");
        }

        this._namedQueryList.set(index, vNamedQuery);
    }

    /**
     * 
     * 
     * @param vNamedQueryArray
     */
    public void setNamedQuery(
            final NamedQuery[] vNamedQueryArray) {
        //-- copy array
        _namedQueryList.clear();

        for (int i = 0; i < vNamedQueryArray.length; i++) {
                this._namedQueryList.add(vNamedQueryArray[i]);
        }
    }

    /**
     * Sets the value of field 'verifyConstructable'.
     * 
     * @param verifyConstructable the value of field
     * 'verifyConstructable'.
     */
    public void setVerifyConstructable(
            final boolean verifyConstructable) {
        this._verifyConstructable = verifyConstructable;
        this._has_verifyConstructable = true;
    }

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(
            final String version) {
        this._version = version;
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
     * org.exolab.castor.mapping.xml.ClassMapping
     */
    public static ClassMapping unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (ClassMapping) org.exolab.castor.xml.Unmarshaller.unmarshal(ClassMapping.class, reader);
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
