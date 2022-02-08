/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2part4;

/**
 *
 * @author 加藤鹰
 */
public class House {

    String address;
    int zipcode;
    double area;
    Person person;




    public House(){




    }

    public House(String address, int zipcode, double area,Person person) {
        this.address = address;
        this.zipcode = zipcode;
        this.area = area;
        this.person=person;




    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", zipcode=" + zipcode +
                ", area=" + area +
                '}';
    }
}
