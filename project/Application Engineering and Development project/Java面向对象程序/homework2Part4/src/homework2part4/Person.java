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
import java.util.Scanner;

/**
 * move  part3.Encounter attribute to this class
 * Name:HangXia NUID:001534616;
 */
public class Person {
    int ssn;
    double age;
    String name;
    double RespiratoryRate;
    int HeartRate;
    int SystolicBloodPressure;
    int WeightInKilos;
    double WeightInPounds;

    public Person(){

    }

    public Person(int ssn, double age, String name, double respiratoryRate, int heartRate, int systolicBloodPressure, int weightInKilos, double weightInPounds) {
        this.ssn = ssn;
        this.age = age;
        this.name = name;
        RespiratoryRate = respiratoryRate;
        HeartRate = heartRate;
        SystolicBloodPressure = systolicBloodPressure;
        WeightInKilos = weightInKilos;
        WeightInPounds = weightInPounds;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ssn=" + ssn +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", RespiratoryRate=" + RespiratoryRate +
                ", HeartRate=" + HeartRate +
                ", SystolicBloodPressure=" + SystolicBloodPressure +
                ", WeightInKilos=" + WeightInKilos +
                ", WeightInPounds=" + WeightInPounds +
                '}';
    }

    public void feverAndStress(){
          System.out.println("patient get stress and fever");
          HeartRate++;
          SystolicBloodPressure++;
          RespiratoryRate++;
      }














    public void isThisVitalSignNormal(double age, int SystolicBloodPressure) {
        Scanner input = new Scanner(System.in);//Use the scanner class to accept input
        System.out.println("\n");
        System.out.println("please print AttributeName");
        String attributename = input.nextLine();

        switch (attributename) {
            case "SystolicBloodPressure":
                System.out.println("True   the input String match");
                isPatientNormal1(age,SystolicBloodPressure);
                break;
            default:
                System.out.println("False");
        }
    }


    public void isPatientNormal1(double age,int SystolicBloodPressure) {
        System.out.println(SystolicBloodPressure);
        findAge1(age);
        testSystolicBloodPressure1(age, SystolicBloodPressure);

    }


    public void findAge1(double age) {
        if (this.age < 0) {
            System.out.println("the patient age is wrong");
        } else if (this.age < 0.0834) {
            System.out.println("the patient is Newborn");
        } else if (this.age <= 1) {
            System.out.println("the patient is Infant");
        } else if (this.age <= 3) {
            System.out.println("the patient is Toddler");
        } else if (this.age <= 6) {
            System.out.println("the patient is Preschooler");
        } else if (this.age < 13) {
            System.out.println("the patient is SchoolAge");
        } else if (this.age <= 100) {
            System.out.println("the patient is Adolescent");
        } else {
            System.out.println("the patient is too old to survive");
        }
    }





    int m = 0;


    public void testSystolicBloodPressure1(double age, int SystolicBloodPressure) {
        if (age < 0) {
            System.out.println("False");
        } else if (age < 0.0834) {
            if (SystolicBloodPressure < 50) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            } else if (SystolicBloodPressure <= 70) {
               // System.out.println("true     " + "the Person's SystolicBloodPressure is Normal");
            } else if (WeightInKilos > 70) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            }
        } else if (age <= 1) {
            if (SystolicBloodPressure < 70) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            } else if (SystolicBloodPressure <= 100) {
               // System.out.println("true     " + "the Person's SystolicBloodPressure is Normal");
            } else if (SystolicBloodPressure > 100) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            }

        } else if (age <= 3) {
            if (SystolicBloodPressure < 80) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            } else if (SystolicBloodPressure <= 110) {
               // System.out.println("true     " + "the Person's SystolicBloodPressure is Normal");
            } else if (SystolicBloodPressure > 110) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            }

        } else if (age <= 5) {
            if (SystolicBloodPressure < 80) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            } else if (SystolicBloodPressure <= 110) {
               // System.out.println("true     " + "the Person's SystolicBloodPressure is Normal");
            } else if (SystolicBloodPressure > 110) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            }

        } else if (age < 13) {
            if (SystolicBloodPressure < 80) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            } else if (SystolicBloodPressure <= 120) {
               // System.out.println("true     " + "the Person's SystolicBloodPressure is Normal");
            } else if (SystolicBloodPressure > 120) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            }

        } else if (age <= 100) {
            if (SystolicBloodPressure < 110) {
                m++;
                System.out.println("False    " + "the Person's SystolicBloodPressure is Abnormal");
            } else if (SystolicBloodPressure <= 120) {
                //System.out.println("true     " + "the Person's SystolicBloodPressure is Normal");
            } else if (SystolicBloodPressure > 120) {
              //  System.out.println("true     " + "the Person's SystolicBloodPressure is Normal");
            }
        } else {
            System.out.println("False");
        }
    }













}