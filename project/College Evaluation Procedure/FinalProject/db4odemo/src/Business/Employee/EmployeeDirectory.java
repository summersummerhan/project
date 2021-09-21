/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Business.Person;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {

    private ArrayList<Person> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Person> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee() {
        Employee employee = new Employee();
        employeeList.add(employee);
        return employee;
    }

}
