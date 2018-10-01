package org.jsoncast;

import java.lang.annotation.Annotation;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.castor.core.annotationprocessing.AnnotationProcessor;
import org.castor.core.nature.BaseNature;
import org.exolab.castor.xml.MarshalException;


public class MyAnnotationProcessorImpl implements AnnotationProcessor {

	@Override
	public Class<? extends Annotation> forAnnotationClass() {
		return MyAnnotation.class;
	}

	@Override
	public <I extends BaseNature, A extends Annotation> boolean processAnnotation(I info, A annotation) {
		String annotationToProcess = annotation.annotationType().getName();
		ContentHandlerNature currentNature = (ContentHandlerNature)info;
		ContentHandler currentHandler = currentNature.getContentHandler();
		try {
		currentHandler.processingInstruction("MyAnnotationProcessorImpl writes: ", annotationToProcess);
		}
		catch (SAXException sx) {
			System.out.println("My annotation processing failed");
			return false;
		}
		return true;
	}

}
