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
import java.util.ArrayList;

public class PersonDirectory {
    ArrayList<Person> persontList;
    Person person;


public PersonDirectory(){

    persontList = new ArrayList<>();
    Person person1 =new Person(111464132,1,"pierce",25,90,0,6,21.5);


    Person person2 =new Person(213214214,5,"jack",35,130,60,3,5.5);



    Person person3 =new Person(153252543,3,"tatum",85,130,100,3,5.5);



    Person person4 =new Person(153252543,3,"brown",85,130,400,3,5.5);

    Person person5 =new Person(323252543,31,"rondo",85,130,200,3,5.5);
    persontList.add(person1);
    persontList.add(person2);
    persontList.add(person3);
    persontList.add(person4);
    persontList.add(person5);

    for(Person p3Info:persontList){
        System.out.println(p3Info);
    }

    System.out.println("\n");
}

    public PersonDirectory(ArrayList<Person> persontList, Person person) {
        this.persontList = persontList;
        this.person = person;
    }







}
