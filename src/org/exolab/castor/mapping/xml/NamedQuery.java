/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml;

/**
 * Class NamedQuery.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class NamedQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private String _name;

    /**
     * Field _query.
     */
    private String _query;

    /**
     * Field _queryHintList.
     */
    private java.util.List<QueryHint> _queryHintList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NamedQuery() {
        super();
        this._queryHintList = new java.util.ArrayList<QueryHint>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vQueryHint
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQueryHint(
            final QueryHint vQueryHint)
    throws IndexOutOfBoundsException {
        this._queryHintList.add(vQueryHint);
    }

    /**
     * 
     * 
     * @param index
     * @param vQueryHint
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQueryHint(
            final int index,
            final QueryHint vQueryHint)
    throws IndexOutOfBoundsException {
        this._queryHintList.add(index, vQueryHint);
    }

    /**
     * Method enumerateQueryHint.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends QueryHint> enumerateQueryHint(
    ) {
        return java.util.Collections.enumeration(this._queryHintList);
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
     * Returns the value of field 'query'.
     * 
     * @return the value of field 'Query'.
     */
    public String getQuery(
    ) {
        return this._query;
    }

    /**
     * Method getQueryHint.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.mapping.xml.QueryHint at the given index
     */
    public QueryHint getQueryHint(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._queryHintList.size()) {
            throw new IndexOutOfBoundsException("getQueryHint: Index value '" + index + "' not in range [0.." + (this._queryHintList.size() - 1) + "]");
        }

        return (QueryHint) _queryHintList.get(index);
    }

    /**
     * Method getQueryHint.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public QueryHint[] getQueryHint(
    ) {
        QueryHint[] array = new QueryHint[0];
        return (QueryHint[]) this._queryHintList.toArray(array);
    }

    /**
     * Method getQueryHintCount.
     * 
     * @return the size of this collection
     */
    public int getQueryHintCount(
    ) {
        return this._queryHintList.size();
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
     * Method iterateQueryHint.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends QueryHint> iterateQueryHint(
    ) {
        return this._queryHintList.iterator();
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
    public void removeAllQueryHint(
    ) {
        this._queryHintList.clear();
    }

    /**
     * Method removeQueryHint.
     * 
     * @param vQueryHint
     * @return true if the object was removed from the collection.
     */
    public boolean removeQueryHint(
            final QueryHint vQueryHint) {
        boolean removed = _queryHintList.remove(vQueryHint);
        return removed;
    }

    /**
     * Method removeQueryHintAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public QueryHint removeQueryHintAt(
            final int index) {
        Object obj = this._queryHintList.remove(index);
        return (QueryHint) obj;
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
     * Sets the value of field 'query'.
     * 
     * @param query the value of field 'query'.
     */
    public void setQuery(
            final String query) {
        this._query = query;
    }

    /**
     * 
     * 
     * @param index
     * @param vQueryHint
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setQueryHint(
            final int index,
            final QueryHint vQueryHint)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._queryHintList.size()) {
            throw new IndexOutOfBoundsException("setQueryHint: Index value '" + index + "' not in range [0.." + (this._queryHintList.size() - 1) + "]");
        }

        this._queryHintList.set(index, vQueryHint);
    }

    /**
     * 
     * 
     * @param vQueryHintArray
     */
    public void setQueryHint(
            final QueryHint[] vQueryHintArray) {
        //-- copy array
        _queryHintList.clear();

        for (int i = 0; i < vQueryHintArray.length; i++) {
                this._queryHintList.add(vQueryHintArray[i]);
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
     * org.exolab.castor.mapping.xml.NamedQuery
     */
    public static NamedQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (NamedQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(NamedQuery.class, reader);
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
