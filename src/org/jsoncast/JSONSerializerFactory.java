package org.jsoncast;

import org.exolab.castor.xml.OutputFormat;
import org.exolab.castor.xml.Serializer;
import org.exolab.castor.xml.XMLSerializerFactory;

public class JSONSerializerFactory implements XMLSerializerFactory {
    public Serializer getSerializer() {
        return new JSONSerializer();
    }

    public OutputFormat getOutputFormat() {
        return new JSONOutputFormat();
    }
}
