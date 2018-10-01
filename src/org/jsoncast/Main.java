package org.jsoncast;

import myapp.Employee;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.XMLContext;

import javax.xml.bind.JAXBException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

  public static void main(String[] args) throws IOException, MarshalException, ValidationException, JAXBException, MappingException {
    Writer writer = new FileWriter("out.json");
    XMLContext xmlContext = new XMLContext();
    xmlContext.setProperty("org.exolab.castor.xml.serializer.factory", "org.jsoncast.JSONSerializerFactory");
    Marshaller marshaller = xmlContext.createMarshaller();
    marshaller.setWriter(writer);
    int[] ids = {1, 3, 5, 2};
    Employee employee = new Employee();
    employee.setEmplID(ids);
    employee.setSalary(12);
    employee.setFirstName("FirstName");
    employee.setLastName("LastName");
    marshaller.marshal(employee);
  }
}
