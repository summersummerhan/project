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
public class City {


    Community community;

    public City(){
               System.out.println("print out the number of abnormal cases for each community");
        Person person1 =new Person(111464132,1,"rondo",25,90,0,6,21.5);
        person1.testSystolicBloodPressure1(1,20);
        House house1 = new House("137 W San Bernardino Rd",91723,200.5,person1);
        System.out.println(house1);
        Community community1 = new Community("heather",house1);
        System.out.println(community1);
        int z=person1.m;
        System.out.println("the community1 has"+" "+z+" "+"abnormal blood pressure cases");
        System.out.println("\n");

        Person person2 =new Person(213214214,5,"jack",35,130,60,3,5.5);
        person1.testSystolicBloodPressure1(5,80);
        House house2 = new House("1305 Van Ness Ave",94109,300.6,person2);
        System.out.println(house2);
        Community community2 = new Community("guest",house2);
        System.out.println(community2);
        int z2=person2.m;
        System.out.println("the community2 has"+" "+z2+" "+"abnormal blood pressure cases");
        System.out.println("\n");

        Person person3 =new Person(153252543,3,"kevin",85,130,100,3,5.5);
        person1.testSystolicBloodPressure1(1,80);
        House house3 = new House("71 Tamai Vista Blvd",94925,208.7,person3);
        System.out.println(house3);
        Community community3 = new Community("sunny",house3);
        System.out.println(community3);
        int z3=person3.m;
        System.out.println("the community3 has"+" "+z3+" "+"abnormal blood pressure cases");
        System.out.println("\n");

        Person person4 =new Person(153252543,3,"pierce",85,130,400,3,5.5);
        person4.testSystolicBloodPressure1(1,400);
        House house4 = new House("2751 Mission St.9",94110,319.9,person4);
        System.out.println(house4);
        Community community4 = new Community("check",house4);
        System.out.println(community4);
        int z4=person4.m;
        System.out.println("the community4 has"+" "+z4+" "+"abnormal blood pressure cases");
        System.out.println("\n");

        Person person5 =new Person(323252543,31,"ack",85,130,200,3,5.5);
        person5.testSystolicBloodPressure1(1,200);
        House house5 = new House("2530 Bancroft Way",94704,155.0,person5);
        System.out.println(house5);
        Community community5 = new Community("good",house5);
        System.out.println(community5);
        int z5=person5.m;
        System.out.println("the community5 has"+" "+z5+" "+"abnormal blood pressure cases");
        System.out.println("\n");



        int w=z+z2+z3+z4+z5;
                System.out.println("the communities total have"+"  "+w+"  "+"abnormal blood pressure cases");





    }

    public City(Community community) {
        this.community = community;
    }



    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }





    @Override
    public String toString() {
        return "City{" +
                ", community=" + community +
                '}';
    }
}