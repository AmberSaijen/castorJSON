package org.jsoncast;

import org.castor.core.annotationprocessing.AnnotationProcessor;
import org.castor.core.util.AbstractProperties;
import org.castor.core.util.Messages;
import org.castor.xml.XMLProperties;
import org.exolab.castor.xml.Serializer;
import org.exolab.castor.xml.XMLSerializerFactory;

public class AnnotationParserUtils {
	
	
	public static AnnotationProcessor getAnnotationProcessor(final AbstractProperties properties) {
        AnnotationProcessor annotationProcessor;
        String annotationProcessorName = properties.getString(XMLProperties.ANNOTATION_PROCESSOR);
        
        try {
            annotationProcessor = (AnnotationProcessor)Class.forName(annotationProcessorName).newInstance();
        } catch (Exception except) {
            throw new RuntimeException("Failed to instanciate annotation processor " + annotationProcessorName);
        }
        return annotationProcessor;
    }

}
