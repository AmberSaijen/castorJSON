/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * A binding element is defined to express the binding between an
 * XML Schema Component
 *  and Java class OR a java interface or a java member class. The
 * XML Schema component can 
 *  be an element, an attribute, a complexType or a group.
 * Attribute cannot be mapped to 
 *  class, the reader of a binding file will take care that class
 * or interface are not
 *  used for component whose xml-type is attribute.
 *  
 * 
 * @version $Revision$ $Date$
 */
public class ComponentBindingType implements java.io.Serializable {

    /**
     * Field name.
     */
    private String name;

    /**
     * Field componentBindingTypeChoice.
     */
    private org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice componentBindingTypeChoice;

    private java.util.List componentBindingList;

    private java.util.List elementBindingList;

    private java.util.List attributeBindingList;

    private java.util.List complexTypeBindingList;

    private java.util.List groupBindingList;

    private java.util.List enumBindingList;

    private java.util.List simpleTypeBindingList;

    public ComponentBindingType() {
        super();
        this.componentBindingList = new java.util.ArrayList();
        this.elementBindingList = new java.util.ArrayList();
        this.attributeBindingList = new java.util.ArrayList();
        this.complexTypeBindingList = new java.util.ArrayList();
        this.groupBindingList = new java.util.ArrayList();
        this.enumBindingList = new java.util.ArrayList();
        this.simpleTypeBindingList = new java.util.ArrayList();
    }

    /**
     * 
     * 
     * @param vAttributeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttributeBinding(final ComponentBindingType vAttributeBinding) throws IndexOutOfBoundsException {
        this.attributeBindingList.add(vAttributeBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vAttributeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttributeBinding(final int index,final ComponentBindingType vAttributeBinding) throws IndexOutOfBoundsException {
        this.attributeBindingList.add(index, vAttributeBinding);
    }

    /**
     * 
     * 
     * @param vComplexTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComplexTypeBinding(final ComponentBindingType vComplexTypeBinding) throws IndexOutOfBoundsException {
        this.complexTypeBindingList.add(vComplexTypeBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vComplexTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComplexTypeBinding(final int index,final ComponentBindingType vComplexTypeBinding) throws IndexOutOfBoundsException {
        this.complexTypeBindingList.add(index, vComplexTypeBinding);
    }

    /**
     * 
     * 
     * @param vComponentBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComponentBinding(final ComponentBindingType vComponentBinding) throws IndexOutOfBoundsException {
        this.componentBindingList.add(vComponentBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vComponentBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComponentBinding(final int index,final ComponentBindingType vComponentBinding) throws IndexOutOfBoundsException {
        this.componentBindingList.add(index, vComponentBinding);
    }

    /**
     * 
     * 
     * @param vElementBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addElementBinding(final ComponentBindingType vElementBinding) throws IndexOutOfBoundsException {
        this.elementBindingList.add(vElementBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vElementBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addElementBinding(final int index,final ComponentBindingType vElementBinding) throws IndexOutOfBoundsException {
        this.elementBindingList.add(index, vElementBinding);
    }

    /**
     * 
     * 
     * @param vEnumBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnumBinding(final ComponentBindingType vEnumBinding) throws IndexOutOfBoundsException {
        this.enumBindingList.add(vEnumBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vEnumBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnumBinding(final int index,final ComponentBindingType vEnumBinding) throws IndexOutOfBoundsException {
        this.enumBindingList.add(index, vEnumBinding);
    }

    /**
     * 
     * 
     * @param vGroupBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroupBinding(final ComponentBindingType vGroupBinding) throws IndexOutOfBoundsException {
        this.groupBindingList.add(vGroupBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vGroupBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroupBinding(final int index,final ComponentBindingType vGroupBinding) throws IndexOutOfBoundsException {
        this.groupBindingList.add(index, vGroupBinding);
    }

    /**
     * 
     * 
     * @param vSimpleTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSimpleTypeBinding(final ComponentBindingType vSimpleTypeBinding) throws IndexOutOfBoundsException {
        this.simpleTypeBindingList.add(vSimpleTypeBinding);
    }

    /**
     * 
     * 
     * @param index
     * @param vSimpleTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSimpleTypeBinding(final int index,final ComponentBindingType vSimpleTypeBinding) throws IndexOutOfBoundsException {
        this.simpleTypeBindingList.add(index, vSimpleTypeBinding);
    }

    /**
     * Method enumerateAttributeBinding.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateAttributeBinding() {
        return java.util.Collections.enumeration(this.attributeBindingList);
    }

    /**
     * Method enumerateComplexTypeBinding.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateComplexTypeBinding() {
        return java.util.Collections.enumeration(this.complexTypeBindingList);
    }

    /**
     * Method enumerateComponentBinding.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateComponentBinding() {
        return java.util.Collections.enumeration(this.componentBindingList);
    }

    /**
     * Method enumerateElementBinding.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateElementBinding() {
        return java.util.Collections.enumeration(this.elementBindingList);
    }

    /**
     * Method enumerateEnumBinding.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateEnumBinding() {
        return java.util.Collections.enumeration(this.enumBindingList);
    }

    /**
     * Method enumerateGroupBinding.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateGroupBinding() {
        return java.util.Collections.enumeration(this.groupBindingList);
    }

    /**
     * Method enumerateSimpleTypeBinding.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateSimpleTypeBinding() {
        return java.util.Collections.enumeration(this.simpleTypeBindingList);
    }

    /**
     * Method getAttributeBinding.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     * at the given index
     */
    public ComponentBindingType getAttributeBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.attributeBindingList.size()) {
            throw new IndexOutOfBoundsException("getAttributeBinding: Index value '" + index + "' not in range [0.." + (this.attributeBindingList.size() - 1) + "]");
        }

        return (ComponentBindingType) attributeBindingList.get(index);
    }

    /**
     * Method getAttributeBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ComponentBindingType[] getAttributeBinding() {
        ComponentBindingType[] array = new ComponentBindingType[0];
        return 
        (
        ComponentBindingType[]
        ) this.attributeBindingList.toArray(array);
    }

    /**
     * Method getAttributeBindingCount.
     * 
     * @return the size of this collection
     */
    public int getAttributeBindingCount() {
        return this.attributeBindingList.size();
    }

    /**
     * Method getComplexTypeBinding.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     * at the given index
     */
    public ComponentBindingType getComplexTypeBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.complexTypeBindingList.size()) {
            throw new IndexOutOfBoundsException("getComplexTypeBinding: Index value '" + index + "' not in range [0.." + (this.complexTypeBindingList.size() - 1) + "]");
        }

        return (ComponentBindingType) complexTypeBindingList.get(index);
    }

    /**
     * Method getComplexTypeBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ComponentBindingType[] getComplexTypeBinding() {
        ComponentBindingType[] array = new ComponentBindingType[0];
        return 
        (
        ComponentBindingType[]
        ) this.complexTypeBindingList.toArray(array);
    }

    /**
     * Method getComplexTypeBindingCount.
     * 
     * @return the size of this collection
     */
    public int getComplexTypeBindingCount() {
        return this.complexTypeBindingList.size();
    }

    /**
     * Method getComponentBinding.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     * at the given index
     */
    public ComponentBindingType getComponentBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.componentBindingList.size()) {
            throw new IndexOutOfBoundsException("getComponentBinding: Index value '" + index + "' not in range [0.." + (this.componentBindingList.size() - 1) + "]");
        }

        return (ComponentBindingType) componentBindingList.get(index);
    }

    /**
     * Method getComponentBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ComponentBindingType[] getComponentBinding() {
        ComponentBindingType[] array = new ComponentBindingType[0];
        return 
        (
        ComponentBindingType[]
        ) this.componentBindingList.toArray(array);
    }

    /**
     * Method getComponentBindingCount.
     * 
     * @return the size of this collection
     */
    public int getComponentBindingCount() {
        return this.componentBindingList.size();
    }

    /**
     * Returns the value of field 'componentBindingTypeChoice'.
     * 
     * @return the value of field 'ComponentBindingTypeChoice'.
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice getComponentBindingTypeChoice() {
        return this.componentBindingTypeChoice;
    }

    /**
     * Method getElementBinding.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     * at the given index
     */
    public ComponentBindingType getElementBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.elementBindingList.size()) {
            throw new IndexOutOfBoundsException("getElementBinding: Index value '" + index + "' not in range [0.." + (this.elementBindingList.size() - 1) + "]");
        }

        return (ComponentBindingType) elementBindingList.get(index);
    }

    /**
     * Method getElementBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ComponentBindingType[] getElementBinding() {
        ComponentBindingType[] array = new ComponentBindingType[0];
        return 
        (
        ComponentBindingType[]
        ) this.elementBindingList.toArray(array);
    }

    /**
     * Method getElementBindingCount.
     * 
     * @return the size of this collection
     */
    public int getElementBindingCount() {
        return this.elementBindingList.size();
    }

    /**
     * Method getEnumBinding.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     * at the given index
     */
    public ComponentBindingType getEnumBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.enumBindingList.size()) {
            throw new IndexOutOfBoundsException("getEnumBinding: Index value '" + index + "' not in range [0.." + (this.enumBindingList.size() - 1) + "]");
        }

        return (ComponentBindingType) enumBindingList.get(index);
    }

    /**
     * Method getEnumBinding.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ComponentBindingType[] getEnumBinding() {
        ComponentBindingType[] array = new ComponentBindingType[0];
        return 
        (
        ComponentBindingType[]
        ) this.enumBindingList.toArray(array);
    }

    /**
     * Method getEnumBindingCount.
     * 
     * @return the size of this collection
     */
    public int getEnumBindingCount() {
        return this.enumBindingList.size();
    }

    /**
     * Method getGroupBinding.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     * at the given index
     */
    public ComponentBindingType getGroupBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.groupBindingList.size()) {
            throw new IndexOutOfBoundsException("getGroupBinding: Index value '" + index + "' not in range [0.." + (this.groupBindingList.size() - 1) + "]");
        }

        return (ComponentBindingType) groupBindingList.get(index);
    }

    /**
     * Method getGroupBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ComponentBindingType[] getGroupBinding() {
        ComponentBindingType[] array = new ComponentBindingType[0];
        return 
        (
        ComponentBindingType[]
        ) this.groupBindingList.toArray(array);
    }

    /**
     * Method getGroupBindingCount.
     * 
     * @return the size of this collection
     */
    public int getGroupBindingCount() {
        return this.groupBindingList.size();
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
     * Method getSimpleTypeBinding.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     * at the given index
     */
    public ComponentBindingType getSimpleTypeBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.simpleTypeBindingList.size()) {
            throw new IndexOutOfBoundsException("getSimpleTypeBinding: Index value '" + index + "' not in range [0.." + (this.simpleTypeBindingList.size() - 1) + "]");
        }

        return (ComponentBindingType) simpleTypeBindingList.get(index);
    }

    /**
     * Method getSimpleTypeBinding.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ComponentBindingType[] getSimpleTypeBinding() {
        ComponentBindingType[] array = new ComponentBindingType[0];
        return 
        (
        ComponentBindingType[]
        ) this.simpleTypeBindingList.toArray(array);
    }

    /**
     * Method getSimpleTypeBindingCount.
     * 
     * @return the size of this collection
     */
    public int getSimpleTypeBindingCount() {
        return this.simpleTypeBindingList.size();
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
     * Method iterateAttributeBinding.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateAttributeBinding() {
        return this.attributeBindingList.iterator();
    }

    /**
     * Method iterateComplexTypeBinding.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateComplexTypeBinding() {
        return this.complexTypeBindingList.iterator();
    }

    /**
     * Method iterateComponentBinding.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateComponentBinding() {
        return this.componentBindingList.iterator();
    }

    /**
     * Method iterateElementBinding.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateElementBinding() {
        return this.elementBindingList.iterator();
    }

    /**
     * Method iterateEnumBinding.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateEnumBinding() {
        return this.enumBindingList.iterator();
    }

    /**
     * Method iterateGroupBinding.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateGroupBinding() {
        return this.groupBindingList.iterator();
    }

    /**
     * Method iterateSimpleTypeBinding.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateSimpleTypeBinding() {
        return this.simpleTypeBindingList.iterator();
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
    public void removeAllAttributeBinding() {
        this.attributeBindingList.clear();
    }

    /**
     */
    public void removeAllComplexTypeBinding() {
        this.complexTypeBindingList.clear();
    }

    /**
     */
    public void removeAllComponentBinding() {
        this.componentBindingList.clear();
    }

    /**
     */
    public void removeAllElementBinding() {
        this.elementBindingList.clear();
    }

    /**
     */
    public void removeAllEnumBinding() {
        this.enumBindingList.clear();
    }

    /**
     */
    public void removeAllGroupBinding() {
        this.groupBindingList.clear();
    }

    /**
     */
    public void removeAllSimpleTypeBinding() {
        this.simpleTypeBindingList.clear();
    }

    /**
     * Method removeAttributeBinding.
     * 
     * @param vAttributeBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeAttributeBinding(final ComponentBindingType vAttributeBinding) {
        boolean removed = attributeBindingList.remove(vAttributeBinding);
        return removed;
    }

    /**
     * Method removeAttributeBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ComponentBindingType removeAttributeBindingAt(final int index) {
        Object obj = this.attributeBindingList.remove(index);
        return (ComponentBindingType) obj;
    }

    /**
     * Method removeComplexTypeBinding.
     * 
     * @param vComplexTypeBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeComplexTypeBinding(final ComponentBindingType vComplexTypeBinding) {
        boolean removed = complexTypeBindingList.remove(vComplexTypeBinding);
        return removed;
    }

    /**
     * Method removeComplexTypeBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ComponentBindingType removeComplexTypeBindingAt(final int index) {
        Object obj = this.complexTypeBindingList.remove(index);
        return (ComponentBindingType) obj;
    }

    /**
     * Method removeComponentBinding.
     * 
     * @param vComponentBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeComponentBinding(final ComponentBindingType vComponentBinding) {
        boolean removed = componentBindingList.remove(vComponentBinding);
        return removed;
    }

    /**
     * Method removeComponentBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ComponentBindingType removeComponentBindingAt(final int index) {
        Object obj = this.componentBindingList.remove(index);
        return (ComponentBindingType) obj;
    }

    /**
     * Method removeElementBinding.
     * 
     * @param vElementBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeElementBinding(final ComponentBindingType vElementBinding) {
        boolean removed = elementBindingList.remove(vElementBinding);
        return removed;
    }

    /**
     * Method removeElementBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ComponentBindingType removeElementBindingAt(final int index) {
        Object obj = this.elementBindingList.remove(index);
        return (ComponentBindingType) obj;
    }

    /**
     * Method removeEnumBinding.
     * 
     * @param vEnumBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeEnumBinding(final ComponentBindingType vEnumBinding) {
        boolean removed = enumBindingList.remove(vEnumBinding);
        return removed;
    }

    /**
     * Method removeEnumBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ComponentBindingType removeEnumBindingAt(final int index) {
        Object obj = this.enumBindingList.remove(index);
        return (ComponentBindingType) obj;
    }

    /**
     * Method removeGroupBinding.
     * 
     * @param vGroupBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeGroupBinding(final ComponentBindingType vGroupBinding) {
        boolean removed = groupBindingList.remove(vGroupBinding);
        return removed;
    }

    /**
     * Method removeGroupBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ComponentBindingType removeGroupBindingAt(final int index) {
        Object obj = this.groupBindingList.remove(index);
        return (ComponentBindingType) obj;
    }

    /**
     * Method removeSimpleTypeBinding.
     * 
     * @param vSimpleTypeBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeSimpleTypeBinding(final ComponentBindingType vSimpleTypeBinding) {
        boolean removed = simpleTypeBindingList.remove(vSimpleTypeBinding);
        return removed;
    }

    /**
     * Method removeSimpleTypeBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ComponentBindingType removeSimpleTypeBindingAt(final int index) {
        Object obj = this.simpleTypeBindingList.remove(index);
        return (ComponentBindingType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAttributeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttributeBinding(final int index,final ComponentBindingType vAttributeBinding) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.attributeBindingList.size()) {
            throw new IndexOutOfBoundsException("setAttributeBinding: Index value '" + index + "' not in range [0.." + (this.attributeBindingList.size() - 1) + "]");
        }

        this.attributeBindingList.set(index, vAttributeBinding);
    }

    /**
     * 
     * 
     * @param vAttributeBindingArray
     */
    public void setAttributeBinding(final ComponentBindingType[] vAttributeBindingArray) {
        //-- copy array
        attributeBindingList.clear();

        for (int i = 0; i < vAttributeBindingArray.length; i++) {
                this.attributeBindingList.add(vAttributeBindingArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vComplexTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setComplexTypeBinding(final int index,final ComponentBindingType vComplexTypeBinding) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.complexTypeBindingList.size()) {
            throw new IndexOutOfBoundsException("setComplexTypeBinding: Index value '" + index + "' not in range [0.." + (this.complexTypeBindingList.size() - 1) + "]");
        }

        this.complexTypeBindingList.set(index, vComplexTypeBinding);
    }

    /**
     * 
     * 
     * @param vComplexTypeBindingArray
     */
    public void setComplexTypeBinding(final ComponentBindingType[] vComplexTypeBindingArray) {
        //-- copy array
        complexTypeBindingList.clear();

        for (int i = 0; i < vComplexTypeBindingArray.length; i++) {
                this.complexTypeBindingList.add(vComplexTypeBindingArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vComponentBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setComponentBinding(final int index,final ComponentBindingType vComponentBinding) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.componentBindingList.size()) {
            throw new IndexOutOfBoundsException("setComponentBinding: Index value '" + index + "' not in range [0.." + (this.componentBindingList.size() - 1) + "]");
        }

        this.componentBindingList.set(index, vComponentBinding);
    }

    /**
     * 
     * 
     * @param vComponentBindingArray
     */
    public void setComponentBinding(final ComponentBindingType[] vComponentBindingArray) {
        //-- copy array
        componentBindingList.clear();

        for (int i = 0; i < vComponentBindingArray.length; i++) {
                this.componentBindingList.add(vComponentBindingArray[i]);
        }
    }

    /**
     * Sets the value of field 'componentBindingTypeChoice'.
     * 
     * @param componentBindingTypeChoice the value of field
     * 'componentBindingTypeChoice'.
     */
    public void setComponentBindingTypeChoice(final org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice componentBindingTypeChoice) {
        this.componentBindingTypeChoice = componentBindingTypeChoice;
    }

    /**
     * 
     * 
     * @param index
     * @param vElementBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setElementBinding(final int index,final ComponentBindingType vElementBinding) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.elementBindingList.size()) {
            throw new IndexOutOfBoundsException("setElementBinding: Index value '" + index + "' not in range [0.." + (this.elementBindingList.size() - 1) + "]");
        }

        this.elementBindingList.set(index, vElementBinding);
    }

    /**
     * 
     * 
     * @param vElementBindingArray
     */
    public void setElementBinding(final ComponentBindingType[] vElementBindingArray) {
        //-- copy array
        elementBindingList.clear();

        for (int i = 0; i < vElementBindingArray.length; i++) {
                this.elementBindingList.add(vElementBindingArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vEnumBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEnumBinding(final int index,final ComponentBindingType vEnumBinding) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.enumBindingList.size()) {
            throw new IndexOutOfBoundsException("setEnumBinding: Index value '" + index + "' not in range [0.." + (this.enumBindingList.size() - 1) + "]");
        }

        this.enumBindingList.set(index, vEnumBinding);
    }

    /**
     * 
     * 
     * @param vEnumBindingArray
     */
    public void setEnumBinding(final ComponentBindingType[] vEnumBindingArray) {
        //-- copy array
        enumBindingList.clear();

        for (int i = 0; i < vEnumBindingArray.length; i++) {
                this.enumBindingList.add(vEnumBindingArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vGroupBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGroupBinding(final int index,final ComponentBindingType vGroupBinding) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.groupBindingList.size()) {
            throw new IndexOutOfBoundsException("setGroupBinding: Index value '" + index + "' not in range [0.." + (this.groupBindingList.size() - 1) + "]");
        }

        this.groupBindingList.set(index, vGroupBinding);
    }

    /**
     * 
     * 
     * @param vGroupBindingArray
     */
    public void setGroupBinding(final ComponentBindingType[] vGroupBindingArray) {
        //-- copy array
        groupBindingList.clear();

        for (int i = 0; i < vGroupBindingArray.length; i++) {
                this.groupBindingList.add(vGroupBindingArray[i]);
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
     * 
     * 
     * @param index
     * @param vSimpleTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSimpleTypeBinding(final int index,final ComponentBindingType vSimpleTypeBinding) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.simpleTypeBindingList.size()) {
            throw new IndexOutOfBoundsException("setSimpleTypeBinding: Index value '" + index + "' not in range [0.." + (this.simpleTypeBindingList.size() - 1) + "]");
        }

        this.simpleTypeBindingList.set(index, vSimpleTypeBinding);
    }

    /**
     * 
     * 
     * @param vSimpleTypeBindingArray
     */
    public void setSimpleTypeBinding(final ComponentBindingType[] vSimpleTypeBindingArray) {
        //-- copy array
        simpleTypeBindingList.clear();

        for (int i = 0; i < vSimpleTypeBindingArray.length; i++) {
                this.simpleTypeBindingList.add(vSimpleTypeBindingArray[i]);
        }
    }

    /**
     * Method unmarshalComponentBindingType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.ComponentBindingType
     */
    public static ComponentBindingType unmarshalComponentBindingType(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (ComponentBindingType) org.exolab.castor.xml.Unmarshaller.unmarshal(ComponentBindingType.class, reader);
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
