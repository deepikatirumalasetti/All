package OOPS;

class Employee {
  int employeeId;

  String employeeName;

  double salary;

  public Employee(int employeeId, String employeeName, double salary) {

    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.salary = salary;
  }

  public int setEmployeeId() {

    return this.employeeId;
  }

  public void setEmployeeName(String employeeName) {

    this.employeeName = employeeName;
  }

  public double getSalary() {

    return this.salary;
  }

  public void setSalary(double salary) {

    this.salary = salary;
  }
}

package OOPS;

import java.util.*;

public class Labour extends Employee {
  // public static final
  double overtime = 0.5;

  public Labour(int employeeId, String employeeName, double salary) {

    super(employeeId, employeeName, salary);
  }

  @Override
  public double getSalary() {

    return this.salary + this.salary * this.overtime;
  }

}

public class Manager extends Employee {
  ​ ​
  public static final double incentive = 0.5;

public Manager(int employeeId,String employeeName,double salary) {​​

super(employeeId,employeeName,salary);
}​ ​

@Override
public double getSalary() {​​
return this.salary+this.salary*incentive;
}​ ​

}​ ​
