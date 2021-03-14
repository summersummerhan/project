/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2part3;

/**
 *
 * @author 加藤鹰
 */
public class Person {
    String name;
    double age;
    int ssn;


    public Person(){

    }

    public Person(String name, double age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }


}

   

