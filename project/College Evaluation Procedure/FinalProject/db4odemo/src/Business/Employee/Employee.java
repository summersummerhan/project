/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Business.Person;


/**
 *
 * @author raunak
 */
public class Employee extends Person{
    
   
 private int id;
    private static int count = 1;
    private String address;
    private String phone;

    public Employee() {
       
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

  

    @Override
    public String toString() {
        return this.returnFullName();
    }
}
