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
import java.util.ArrayList;

public class PersonDirectory {
    ArrayList<Person> persontList;
    Person person;


    public PersonDirectory(){
        persontList = new ArrayList<>();



        Person person1 = new Person("pierce",45,111475829);
        Person person2 = new Person("Rondo",33,435758856);
        Person person3 = new Person("tatum",23,526758856);
        persontList.add(person1);
        persontList.add(person2);
        persontList.add(person3);
        System.out.println("\n");
        System.out.println("this shows the PersonDirectory");
            for(Person p3Info:persontList){
                System.out.println(p3Info);
            }
    }

    public ArrayList<Person> getPersontList() {
        return persontList;
    }

    public void setPersontList(ArrayList<Person> persontList) {
        this.persontList = persontList;
    }


}
