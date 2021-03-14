/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2Part1;

/**
 *
 * @author 加藤鹰
 */
import java.util.Scanner;

public class Test {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        VitalSigns v1 =new VitalSigns(25,90,80,6,21.5);
        Patient Infant = new Patient(1,v1 );
        Infant.isPatientNormal(1,v1);
        System.out.println("\n");

        VitalSigns v2 =new VitalSigns(35,130,60,3,5.5);
        Patient Newborn = new Patient(0,v2);
        Newborn.isPatientNormal(0,v2);
        System.out.println("\n");

        VitalSigns v3 =new VitalSigns(25,90,100,11,24.5);
        Patient Toddler = new Patient();
        Toddler.isPatientNormal(2,v3);
        System.out.println("\n");

        VitalSigns v4 =new VitalSigns(25,90,96,16,35);
        Patient Preschooler = new Patient(4,v4);
        Preschooler.isPatientNormal(4,v4);
        System.out.println("\n");

        VitalSigns v5 =new VitalSigns(25,90,110,31,44.5);
        Patient SchoolAge = new Patient(7,v5);
        SchoolAge.isPatientNormal(7,v5);
        System.out.println("\n");

        VitalSigns v6 =new VitalSigns(18,65,115,90,120);
        Patient Adolescent = new Patient(18,v6);
        Adolescent.isPatientNormal(18,v6);
        System.out.println("\n");

        VitalSigns v7 =new VitalSigns(0,0,0,0,0);
        Patient testPeople1 = new Patient(-1,v7);
        testPeople1.isPatientNormal(-1,v7);
        System.out.println("\n");

        VitalSigns v8 =new VitalSigns(1000,1000,1000,1000,1000);
        Patient testPeople2 = new Patient(500,v7);
        testPeople2.isPatientNormal(500,v7);
        System.out.println("\n");

        while (true) {
            try {
                System.out.println("Manually input six data to get the patient's age and test whether the five data are in the normal range");
                System.out.println("Start the input test, enter “Enter” press to start the program");

                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                System.out.println("Please enter message，Press enter once after each input ， the test ends after Enter six data");
                System.out.println("form: (int age,double RespiratoryRate,int HeartRate,int SystolicBloodPressure,int WeightInKilos,double WeightInPounds");

                int x1 = sc.nextInt();
                int x2 = sc.nextInt();
                int x3 = sc.nextInt();
                int x4 = sc.nextInt();
                double y1 = sc.nextDouble();
                double y2 = sc.nextDouble();
                VitalSigns v9 =new VitalSigns(y1,x2,x3,x4,y2);
                Patient testEnterPeople = new Patient(x1,v9);
                testEnterPeople.isPatientNormal(x1,v9);
                System.out.println("Input complete");
                break;
            } catch (Exception e) {
                System.out.println("Input error, please input again");
            }
        }



    }
}