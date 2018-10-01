package myapp;

import org.jsoncast.MyAnnotation;

import java.io.Serializable;

public class Employee implements Serializable {
  
  private int[] emplID;
  private String firstName;
  @MyAnnotation(myInteger = 3)
  private String lastName;
  private float salary;

  public Employee() {
    super();
  }

  public Employee(int[] id, String firstName, String lastName, float salary) {
    super();
    this.emplID = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public int[] getEmplID() {
    return emplID;
  }

  public void setEmplID(int[] emplID) {
    this.emplID = emplID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

}
