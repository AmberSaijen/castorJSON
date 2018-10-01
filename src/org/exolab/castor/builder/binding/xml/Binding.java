/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml;

/**
 * The root element that contains the different binding elements.
 *  The binding file is written from a schema point of view and
 * follows the
 *  structure of an XML Schema.
 *  The root element can also be used to configure the default
 * binding type. 
 *  
 * 
 * @version $Revision$ $Date$
 */
public class Binding implements java.io.Serializable {

    /**
     * Field defaultBindingType.
     */
    private org.exolab.castor.builder.binding.xml.types.BindingType defaultBindingType = org.exolab.castor.builder.binding.xml.types.BindingType.valueOf("element");

    private java.util.List includeList;

    private java.util.List _packageList;

    /**
     * Field namingXML.
     */
    private org.exolab.castor.builder.binding.xml.NamingXMLType namingXML;

    /**
     * Field automaticNaming.
     */
    private org.exolab.castor.builder.binding.xml.AutomaticNamingType automaticNaming;

    private java.util.List componentBindingList;

    private java.util.List elementBindingList;

    private java.util.List attributeBindingList;

    private java.util.List complexTypeBindingList;

    private java.util.List groupBindingList;

    private java.util.List enumBindingList;

    private java.util.List simpleTypeBindingList;

    public Binding() {
        super();
        setDefaultBindingType(org.exolab.castor.builder.binding.xml.types.BindingType.valueOf("element"));
        this.includeList = new java.util.ArrayList();
        this._packageList = new java.util.ArrayList();
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
    public void addAttributeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vAttributeBinding) throws IndexOutOfBoundsException {
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
    public void addAttributeBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vAttributeBinding) throws IndexOutOfBoundsException {
        this.attributeBindingList.add(index, vAttributeBinding);
    }

    /**
     * 
     * 
     * @param vComplexTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComplexTypeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vComplexTypeBinding) throws IndexOutOfBoundsException {
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
    public void addComplexTypeBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vComplexTypeBinding) throws IndexOutOfBoundsException {
        this.complexTypeBindingList.add(index, vComplexTypeBinding);
    }

    /**
     * 
     * 
     * @param vComponentBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComponentBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vComponentBinding) throws IndexOutOfBoundsException {
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
    public void addComponentBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vComponentBinding) throws IndexOutOfBoundsException {
        this.componentBindingList.add(index, vComponentBinding);
    }

    /**
     * 
     * 
     * @param vElementBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addElementBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vElementBinding) throws IndexOutOfBoundsException {
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
    public void addElementBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vElementBinding) throws IndexOutOfBoundsException {
        this.elementBindingList.add(index, vElementBinding);
    }

    /**
     * 
     * 
     * @param vEnumBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnumBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vEnumBinding) throws IndexOutOfBoundsException {
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
    public void addEnumBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vEnumBinding) throws IndexOutOfBoundsException {
        this.enumBindingList.add(index, vEnumBinding);
    }

    /**
     * 
     * 
     * @param vGroupBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroupBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vGroupBinding) throws IndexOutOfBoundsException {
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
    public void addGroupBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vGroupBinding) throws IndexOutOfBoundsException {
        this.groupBindingList.add(index, vGroupBinding);
    }

    /**
     * 
     * 
     * @param vInclude
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInclude(final org.exolab.castor.builder.binding.xml.IncludeType vInclude) throws IndexOutOfBoundsException {
        this.includeList.add(vInclude);
    }

    /**
     * 
     * 
     * @param index
     * @param vInclude
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInclude(final int index,final org.exolab.castor.builder.binding.xml.IncludeType vInclude) throws IndexOutOfBoundsException {
        this.includeList.add(index, vInclude);
    }

    /**
     * 
     * 
     * @param vPackage
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(final org.exolab.castor.builder.binding.xml.PackageType vPackage) throws IndexOutOfBoundsException {
        this._packageList.add(vPackage);
    }

    /**
     * 
     * 
     * @param index
     * @param vPackage
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(final int index,final org.exolab.castor.builder.binding.xml.PackageType vPackage) throws IndexOutOfBoundsException {
        this._packageList.add(index, vPackage);
    }

    /**
     * 
     * 
     * @param vSimpleTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSimpleTypeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vSimpleTypeBinding) throws IndexOutOfBoundsException {
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
    public void addSimpleTypeBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vSimpleTypeBinding) throws IndexOutOfBoundsException {
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
     * Method enumerateInclude.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumerateInclude() {
        return java.util.Collections.enumeration(this.includeList);
    }

    /**
     * Method enumeratePackage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration enumeratePackage() {
        return java.util.Collections.enumeration(this._packageList);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType getAttributeBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.attributeBindingList.size()) {
            throw new IndexOutOfBoundsException("getAttributeBinding: Index value '" + index + "' not in range [0.." + (this.attributeBindingList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) attributeBindingList.get(index);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType[] getAttributeBinding() {
        org.exolab.castor.builder.binding.xml.ComponentBindingType[] array = new org.exolab.castor.builder.binding.xml.ComponentBindingType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.ComponentBindingType[]
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
     * Returns the value of field 'automaticNaming'.
     * 
     * @return the value of field 'AutomaticNaming'.
     */
    public org.exolab.castor.builder.binding.xml.AutomaticNamingType getAutomaticNaming() {
        return this.automaticNaming;
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType getComplexTypeBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.complexTypeBindingList.size()) {
            throw new IndexOutOfBoundsException("getComplexTypeBinding: Index value '" + index + "' not in range [0.." + (this.complexTypeBindingList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) complexTypeBindingList.get(index);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType[] getComplexTypeBinding() {
        org.exolab.castor.builder.binding.xml.ComponentBindingType[] array = new org.exolab.castor.builder.binding.xml.ComponentBindingType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.ComponentBindingType[]
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType getComponentBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.componentBindingList.size()) {
            throw new IndexOutOfBoundsException("getComponentBinding: Index value '" + index + "' not in range [0.." + (this.componentBindingList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) componentBindingList.get(index);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType[] getComponentBinding() {
        org.exolab.castor.builder.binding.xml.ComponentBindingType[] array = new org.exolab.castor.builder.binding.xml.ComponentBindingType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.ComponentBindingType[]
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
     * Returns the value of field 'defaultBindingType'.
     * 
     * @return the value of field 'DefaultBindingType'.
     */
    public org.exolab.castor.builder.binding.xml.types.BindingType getDefaultBindingType() {
        return this.defaultBindingType;
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType getElementBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.elementBindingList.size()) {
            throw new IndexOutOfBoundsException("getElementBinding: Index value '" + index + "' not in range [0.." + (this.elementBindingList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) elementBindingList.get(index);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType[] getElementBinding() {
        org.exolab.castor.builder.binding.xml.ComponentBindingType[] array = new org.exolab.castor.builder.binding.xml.ComponentBindingType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.ComponentBindingType[]
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType getEnumBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.enumBindingList.size()) {
            throw new IndexOutOfBoundsException("getEnumBinding: Index value '" + index + "' not in range [0.." + (this.enumBindingList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) enumBindingList.get(index);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType[] getEnumBinding() {
        org.exolab.castor.builder.binding.xml.ComponentBindingType[] array = new org.exolab.castor.builder.binding.xml.ComponentBindingType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.ComponentBindingType[]
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType getGroupBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.groupBindingList.size()) {
            throw new IndexOutOfBoundsException("getGroupBinding: Index value '" + index + "' not in range [0.." + (this.groupBindingList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) groupBindingList.get(index);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType[] getGroupBinding() {
        org.exolab.castor.builder.binding.xml.ComponentBindingType[] array = new org.exolab.castor.builder.binding.xml.ComponentBindingType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.ComponentBindingType[]
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
     * Method getInclude.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.IncludeType at the
     * given index
     */
    public org.exolab.castor.builder.binding.xml.IncludeType getInclude(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.includeList.size()) {
            throw new IndexOutOfBoundsException("getInclude: Index value '" + index + "' not in range [0.." + (this.includeList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.IncludeType) includeList.get(index);
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
    public org.exolab.castor.builder.binding.xml.IncludeType[] getInclude() {
        org.exolab.castor.builder.binding.xml.IncludeType[] array = new org.exolab.castor.builder.binding.xml.IncludeType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.IncludeType[]
        ) this.includeList.toArray(array);
    }

    /**
     * Method getIncludeCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeCount() {
        return this.includeList.size();
    }

    /**
     * Returns the value of field 'namingXML'.
     * 
     * @return the value of field 'NamingXML'.
     */
    public org.exolab.castor.builder.binding.xml.NamingXMLType getNamingXML() {
        return this.namingXML;
    }

    /**
     * Method getPackage.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.exolab.castor.builder.binding.xml.PackageType at the
     * given index
     */
    public org.exolab.castor.builder.binding.xml.PackageType getPackage(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("getPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.PackageType) _packageList.get(index);
    }

    /**
     * Method getPackage.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.exolab.castor.builder.binding.xml.PackageType[] getPackage() {
        org.exolab.castor.builder.binding.xml.PackageType[] array = new org.exolab.castor.builder.binding.xml.PackageType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.PackageType[]
        ) this._packageList.toArray(array);
    }

    /**
     * Method getPackageCount.
     * 
     * @return the size of this collection
     */
    public int getPackageCount() {
        return this._packageList.size();
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType getSimpleTypeBinding(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.simpleTypeBindingList.size()) {
            throw new IndexOutOfBoundsException("getSimpleTypeBinding: Index value '" + index + "' not in range [0.." + (this.simpleTypeBindingList.size() - 1) + "]");
        }

        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) simpleTypeBindingList.get(index);
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
    public org.exolab.castor.builder.binding.xml.ComponentBindingType[] getSimpleTypeBinding() {
        org.exolab.castor.builder.binding.xml.ComponentBindingType[] array = new org.exolab.castor.builder.binding.xml.ComponentBindingType[0];
        return 
        (
        org.exolab.castor.builder.binding.xml.ComponentBindingType[]
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
     * Method iterateInclude.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iterateInclude() {
        return this.includeList.iterator();
    }

    /**
     * Method iteratePackage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator iteratePackage() {
        return this._packageList.iterator();
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
    public void removeAllInclude() {
        this.includeList.clear();
    }

    /**
     */
    public void removeAllPackage() {
        this._packageList.clear();
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
    public boolean removeAttributeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vAttributeBinding) {
        boolean removed = attributeBindingList.remove(vAttributeBinding);
        return removed;
    }

    /**
     * Method removeAttributeBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingType removeAttributeBindingAt(final int index) {
        Object obj = this.attributeBindingList.remove(index);
        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) obj;
    }

    /**
     * Method removeComplexTypeBinding.
     * 
     * @param vComplexTypeBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeComplexTypeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vComplexTypeBinding) {
        boolean removed = complexTypeBindingList.remove(vComplexTypeBinding);
        return removed;
    }

    /**
     * Method removeComplexTypeBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingType removeComplexTypeBindingAt(final int index) {
        Object obj = this.complexTypeBindingList.remove(index);
        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) obj;
    }

    /**
     * Method removeComponentBinding.
     * 
     * @param vComponentBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeComponentBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vComponentBinding) {
        boolean removed = componentBindingList.remove(vComponentBinding);
        return removed;
    }

    /**
     * Method removeComponentBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingType removeComponentBindingAt(final int index) {
        Object obj = this.componentBindingList.remove(index);
        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) obj;
    }

    /**
     * Method removeElementBinding.
     * 
     * @param vElementBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeElementBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vElementBinding) {
        boolean removed = elementBindingList.remove(vElementBinding);
        return removed;
    }

    /**
     * Method removeElementBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingType removeElementBindingAt(final int index) {
        Object obj = this.elementBindingList.remove(index);
        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) obj;
    }

    /**
     * Method removeEnumBinding.
     * 
     * @param vEnumBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeEnumBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vEnumBinding) {
        boolean removed = enumBindingList.remove(vEnumBinding);
        return removed;
    }

    /**
     * Method removeEnumBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingType removeEnumBindingAt(final int index) {
        Object obj = this.enumBindingList.remove(index);
        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) obj;
    }

    /**
     * Method removeGroupBinding.
     * 
     * @param vGroupBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeGroupBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vGroupBinding) {
        boolean removed = groupBindingList.remove(vGroupBinding);
        return removed;
    }

    /**
     * Method removeGroupBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingType removeGroupBindingAt(final int index) {
        Object obj = this.groupBindingList.remove(index);
        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) obj;
    }

    /**
     * Method removeInclude.
     * 
     * @param vInclude
     * @return true if the object was removed from the collection.
     */
    public boolean removeInclude(final org.exolab.castor.builder.binding.xml.IncludeType vInclude) {
        boolean removed = includeList.remove(vInclude);
        return removed;
    }

    /**
     * Method removeIncludeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.IncludeType removeIncludeAt(final int index) {
        Object obj = this.includeList.remove(index);
        return (org.exolab.castor.builder.binding.xml.IncludeType) obj;
    }

    /**
     * Method removePackage.
     * 
     * @param vPackage
     * @return true if the object was removed from the collection.
     */
    public boolean removePackage(final org.exolab.castor.builder.binding.xml.PackageType vPackage) {
        boolean removed = _packageList.remove(vPackage);
        return removed;
    }

    /**
     * Method removePackageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.PackageType removePackageAt(final int index) {
        Object obj = this._packageList.remove(index);
        return (org.exolab.castor.builder.binding.xml.PackageType) obj;
    }

    /**
     * Method removeSimpleTypeBinding.
     * 
     * @param vSimpleTypeBinding
     * @return true if the object was removed from the collection.
     */
    public boolean removeSimpleTypeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType vSimpleTypeBinding) {
        boolean removed = simpleTypeBindingList.remove(vSimpleTypeBinding);
        return removed;
    }

    /**
     * Method removeSimpleTypeBindingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.exolab.castor.builder.binding.xml.ComponentBindingType removeSimpleTypeBindingAt(final int index) {
        Object obj = this.simpleTypeBindingList.remove(index);
        return (org.exolab.castor.builder.binding.xml.ComponentBindingType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAttributeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttributeBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vAttributeBinding) throws IndexOutOfBoundsException {
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
    public void setAttributeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType[] vAttributeBindingArray) {
        //-- copy array
        attributeBindingList.clear();

        for (int i = 0; i < vAttributeBindingArray.length; i++) {
                this.attributeBindingList.add(vAttributeBindingArray[i]);
        }
    }

    /**
     * Sets the value of field 'automaticNaming'.
     * 
     * @param automaticNaming the value of field 'automaticNaming'.
     */
    public void setAutomaticNaming(final org.exolab.castor.builder.binding.xml.AutomaticNamingType automaticNaming) {
        this.automaticNaming = automaticNaming;
    }

    /**
     * 
     * 
     * @param index
     * @param vComplexTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setComplexTypeBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vComplexTypeBinding) throws IndexOutOfBoundsException {
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
    public void setComplexTypeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType[] vComplexTypeBindingArray) {
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
    public void setComponentBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vComponentBinding) throws IndexOutOfBoundsException {
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
    public void setComponentBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType[] vComponentBindingArray) {
        //-- copy array
        componentBindingList.clear();

        for (int i = 0; i < vComponentBindingArray.length; i++) {
                this.componentBindingList.add(vComponentBindingArray[i]);
        }
    }

    /**
     * Sets the value of field 'defaultBindingType'.
     * 
     * @param defaultBindingType the value of field
     * 'defaultBindingType'.
     */
    public void setDefaultBindingType(final org.exolab.castor.builder.binding.xml.types.BindingType defaultBindingType) {
        this.defaultBindingType = defaultBindingType;
    }

    /**
     * 
     * 
     * @param index
     * @param vElementBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setElementBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vElementBinding) throws IndexOutOfBoundsException {
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
    public void setElementBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType[] vElementBindingArray) {
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
    public void setEnumBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vEnumBinding) throws IndexOutOfBoundsException {
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
    public void setEnumBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType[] vEnumBindingArray) {
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
    public void setGroupBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vGroupBinding) throws IndexOutOfBoundsException {
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
    public void setGroupBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType[] vGroupBindingArray) {
        //-- copy array
        groupBindingList.clear();

        for (int i = 0; i < vGroupBindingArray.length; i++) {
                this.groupBindingList.add(vGroupBindingArray[i]);
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
    public void setInclude(final int index,final org.exolab.castor.builder.binding.xml.IncludeType vInclude) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.includeList.size()) {
            throw new IndexOutOfBoundsException("setInclude: Index value '" + index + "' not in range [0.." + (this.includeList.size() - 1) + "]");
        }

        this.includeList.set(index, vInclude);
    }

    /**
     * 
     * 
     * @param vIncludeArray
     */
    public void setInclude(final org.exolab.castor.builder.binding.xml.IncludeType[] vIncludeArray) {
        //-- copy array
        includeList.clear();

        for (int i = 0; i < vIncludeArray.length; i++) {
                this.includeList.add(vIncludeArray[i]);
        }
    }

    /**
     * Sets the value of field 'namingXML'.
     * 
     * @param namingXML the value of field 'namingXML'.
     */
    public void setNamingXML(final org.exolab.castor.builder.binding.xml.NamingXMLType namingXML) {
        this.namingXML = namingXML;
    }

    /**
     * 
     * 
     * @param index
     * @param vPackage
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPackage(final int index,final org.exolab.castor.builder.binding.xml.PackageType vPackage) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("setPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }

        this._packageList.set(index, vPackage);
    }

    /**
     * 
     * 
     * @param vPackageArray
     */
    public void setPackage(final org.exolab.castor.builder.binding.xml.PackageType[] vPackageArray) {
        //-- copy array
        _packageList.clear();

        for (int i = 0; i < vPackageArray.length; i++) {
                this._packageList.add(vPackageArray[i]);
        }
    }

    /**
     * 
     * 
     * @param index
     * @param vSimpleTypeBinding
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSimpleTypeBinding(final int index,final org.exolab.castor.builder.binding.xml.ComponentBindingType vSimpleTypeBinding) throws IndexOutOfBoundsException {
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
    public void setSimpleTypeBinding(final org.exolab.castor.builder.binding.xml.ComponentBindingType[] vSimpleTypeBindingArray) {
        //-- copy array
        simpleTypeBindingList.clear();

        for (int i = 0; i < vSimpleTypeBindingArray.length; i++) {
                this.simpleTypeBindingList.add(vSimpleTypeBindingArray[i]);
        }
    }

    /**
     * Method unmarshalBinding.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.exolab.castor.builder.binding.xml.Binding
     */
    public static Binding unmarshalBinding(final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (Binding) org.exolab.castor.xml.Unmarshaller.unmarshal(Binding.class, reader);
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
