package org.jsoncast;

import org.exolab.castor.xml.OutputFormat;
import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class JSONSerializer implements org.exolab.castor.xml.Serializer, DocumentHandler {
    private Writer out;
    private OutputStream output;
    private boolean isEmptyDocument = true;
    private int currIndent = 0;

    public void setDocumentLocator(Locator locator) {

    }

    public void startDocument() throws SAXException {
        printIndent();
        //System.out.println("startDocument");
    }

    public void endDocument() throws SAXException {
        printIndent();
        //System.out.println("endDocument");
        try {
            out.write("}");
            out.flush();
        } catch (Exception ex) {
        }
        try {
            output.write("}".getBytes());
            output.flush();
        } catch (Exception ex) {
        }
    }

    private void printIndent() {
        String indentStr = " ";
        for (int i = 0; i < currIndent; i++) {
            try {
                out.write(indentStr);
            } catch (Exception ex) {
            }
            try {
                output.write(indentStr.getBytes());
            } catch (Exception ex) {
            }
        }
    }

    public void startElement(String name, AttributeList atts) throws SAXException {
        printIndent();
        //System.out.println("startElement "+name);
        currIndent++;

        String text = ((isEmptyDocument) ? ("{\n" + "\"" + name + "\"") : ",\n\n" + "\"" + name + "\"") + " : ";
        try {
            out.write(text);
        } catch (Exception ex) {
        }
        try {
            output.write(text.getBytes());
        } catch (Exception ex) {
        }
        if (isEmptyDocument)
            isEmptyDocument = false;
        if (atts != null && atts.getLength() > 0) {
            try {
                out.write(" {\n");
            } catch (Exception ex) {
            }
            try {
                output.write(" {\n".getBytes());
            } catch (Exception ex) {
            }

            for (int i = 0; i < atts.getLength(); i++) {
                String attrName = atts.getName(i);
                String attrValue = atts.getValue(i);
                printIndent();

                text = ((i > 0) ? ",\n" : "") + "\"@" + attrName + "\"" + " : \"" + attrValue + "\"";
                try {
                    out.write(text);
                } catch (Exception ex) {
                }
                try {
                    output.write(text.getBytes());
                } catch (Exception ex) {
                }

            }

            try {
                out.write(" \n} ");
            } catch (Exception ex) {
            }
            try {
                output.write(" \n} ".getBytes());
            } catch (Exception ex) {
            }
        }
    }

    public void endElement(String name) throws SAXException {
        printIndent();
        //System.out.println("endElement "+"\""+name+"\"");
        currIndent--;
        for (int i = 0; i < currIndent; i++) {
            try {
                out.write(" ");
            } catch (Exception ex) {
            }
            try {
                output.write(" ".getBytes());
            } catch (Exception ex) {
            }
        }

        String text = "\n";
        try {
            out.write(text);
        } catch (Exception ex) {
        }
        try {
            output.write(text.getBytes());
        } catch (Exception ex) {
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        //System.out.println("characters "+ch);
        String text = "\"" + new String(ch) + "\"";
        try {
            out.write(text);
        } catch (Exception ex) {
        }
        try {
            output.write(text.getBytes());
        } catch (Exception ex) {
        }
    }

    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        //System.out.println("JSON ignorableWhitespace "+new String(ch));

    }

    public void processingInstruction(String target, String data) throws SAXException {
        try {
            out.write(",\n" + "\"" + target + "\" : \"" + data + "\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setOutputCharStream(Writer out) {
        this.out = out;
    }

    public DocumentHandler asDocumentHandler() throws IOException {
        return this;
    }

    public void setOutputFormat(OutputFormat format) {

    }

    public void setOutputByteStream(OutputStream output) {
        this.output = output;
    }
}
