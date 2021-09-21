/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Business.Person;

/**
 *
 * @author tzm
 */
public class Customer extends Person {

    private int id;

    private String address;
    private String phone;

    private static int count = 1;

    public Customer() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
