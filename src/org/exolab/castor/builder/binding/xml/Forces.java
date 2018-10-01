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
public class Forces implements java.io.Serializable {

    private java.util.List forceList;

    public Forces() {
        super();
        this.forceList = new java.util.ArrayList();
    }

    /**
     * 
     * 
     * @param vForce
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addForce(final String vForce) throws IndexOutOfBoundsException {
        this.forceList.add(vForce);
    }

    /**
     * 
     * 
     * @param index
     * @param vForce
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addForce(final int index,final String vForce) throws IndexOutOfBoundsException {
        this.forceList.add(index, vForce);
    }

    /**
     * Method enumerateForce.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateForce() {
        return java.util.Collections.enumeration(this.forceList);
    }

    /**
     * Method getForce.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getForce(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.forceList.size()) {
            throw new IndexOutOfBoundsException("getForce: Index value '" + index + "' not in range [0.." + (this.forceList.size() - 1) + "]");
        }

        return (String) forceList.get(index);
    }

    /**
     * Method getForce.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getForce() {
        String[] array = new String[0];
        return 
        (
        String[]
        ) this.forceList.toArray(array);
    }

    /**
     * Method getForceCount.
     * 
     * @return the size of this collection
     */
    public int getForceCount() {
        return this.forceList.size();
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
     * Method iterateForce.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateForce() {
        return this.forceList.iterator();
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
    public void removeAllForce() {
        this.forceList.clear();
    }

    /**
     * Method removeForce.
     * 
     * @param vForce
     * @return true if the object was removed from the collection.
     */
    public boolean removeForce(final String vForce) {
        boolean removed = forceList.remove(vForce);
        return removed;
    }

    /**
     * Method removeForceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeForceAt(final int index) {
        Object obj = this.forceList.remove(index);
        return (String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vForce
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setForce(final int index,final String vForce) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.forceList.size()) {
            throw new IndexOutOfBoundsException("setForce: Index value '" + index + "' not in range [0.." + (this.forceList.size() - 1) + "]");
        }

        this.forceList.set(index, vForce);
    }

    /**
     * 
     * 
     * @param vForceArray
     */
    public void setForce(final String[] vForceArray) {
        //-- copy array
        forceList.clear();

        for (int i = 0; i < vForceArray.length; i++) {
                this.forceList.add(vForceArray[i]);
        }
    }

    /**
     * Method unmarshalForces.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.Forces
     */
    public static Forces unmarshalForces(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (Forces) org.exolab.castor.xml.Unmarshaller.unmarshal(Forces.class, reader);
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
