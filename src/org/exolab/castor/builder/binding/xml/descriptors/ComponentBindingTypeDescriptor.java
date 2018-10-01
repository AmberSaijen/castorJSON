/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.4.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.builder.binding.xml.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.builder.binding.xml.ComponentBindingType;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
public class ComponentBindingTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private String _nsURI;

    /**
     * Field _xmlName.
     */
    private String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;

    public ComponentBindingTypeDescriptor() {
        super();
        _nsURI = "http://www.castor.org/SourceGenerator/Binding";
        _xmlName = "componentBindingType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- name
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "name", "name", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getName();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.setName( (String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: name
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- componentBindingTypeChoice
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice.class, "componentBindingTypeChoice", "-error-if-this-is-used-", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getComponentBindingTypeChoice();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.setComponentBindingTypeChoice( (org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice();
            }
        };
        desc.setSchemaType("org.exolab.castor.builder.binding.xml.ComponentBindingTypeChoice");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.exolab.castor.builder.binding.xml.descriptors.ComponentBindingTypeChoiceDescriptor());
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: componentBindingTypeChoice
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- componentBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingType.class, "componentBindingList", "componentBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getComponentBinding();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.addComponentBinding( (org.exolab.castor.builder.binding.xml.ComponentBindingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.removeAllComponentBinding();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.ComponentBindingType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: componentBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- elementBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingType.class, "elementBindingList", "elementBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getElementBinding();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.addElementBinding( (org.exolab.castor.builder.binding.xml.ComponentBindingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.removeAllElementBinding();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.ComponentBindingType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: elementBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- attributeBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingType.class, "attributeBindingList", "attributeBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getAttributeBinding();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.addAttributeBinding( (org.exolab.castor.builder.binding.xml.ComponentBindingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.removeAllAttributeBinding();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.ComponentBindingType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: attributeBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- complexTypeBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingType.class, "complexTypeBindingList", "complexTypeBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getComplexTypeBinding();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.addComplexTypeBinding( (org.exolab.castor.builder.binding.xml.ComponentBindingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.removeAllComplexTypeBinding();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.ComponentBindingType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: complexTypeBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- groupBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingType.class, "groupBindingList", "groupBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getGroupBinding();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.addGroupBinding( (org.exolab.castor.builder.binding.xml.ComponentBindingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.removeAllGroupBinding();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.ComponentBindingType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: groupBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- enumBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingType.class, "enumBindingList", "enumBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getEnumBinding();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.addEnumBinding( (org.exolab.castor.builder.binding.xml.ComponentBindingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.removeAllEnumBinding();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.ComponentBindingType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: enumBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- simpleTypeBindingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.builder.binding.xml.ComponentBindingType.class, "simpleTypeBindingList", "simpleTypeBinding", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                ComponentBindingType target = (ComponentBindingType) object;
                return target.getSimpleTypeBinding();
            }
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.addSimpleTypeBinding( (org.exolab.castor.builder.binding.xml.ComponentBindingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    ComponentBindingType target = (ComponentBindingType) object;
                    target.removeAllSimpleTypeBinding();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public Object newInstance(Object parent) {
                return new org.exolab.castor.builder.binding.xml.ComponentBindingType();
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.builder.binding.xml.ComponentBindingType");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.castor.org/SourceGenerator/Binding");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: simpleTypeBindingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    public org.exolab.castor.mapping.AccessMode getAccessMode() {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    public org.exolab.castor.mapping.FieldDescriptor getIdentity() {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    public Class getJavaClass() {
        return org.exolab.castor.builder.binding.xml.ComponentBindingType.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    public String getNameSpacePrefix() {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    public String getNameSpaceURI() {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    public org.exolab.castor.xml.TypeValidator getValidator() {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    public String getXMLName() {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition() {
        return _elementDefinition;
    }

}
