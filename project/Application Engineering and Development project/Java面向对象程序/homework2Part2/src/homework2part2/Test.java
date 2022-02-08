/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2part2;

/**
 *
 * @author 加藤鹰
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class method {
    public method() throws IOException{
        ArrayList<Patient> list=new ArrayList<Patient>();
        char z ;
        boolean done = false;
        System.out.println("Enter choice (1,2,3,4) or 'q' to quit, then press <enter>");
        System.out.println("Enter choice'1' instantiate six instances to test rule in the table");
        System.out.println("Enter choice'2' Create two test cases to demonstrate abnormal instances");
        System.out.println("Enter choice'3' implement procedures to meet the requirements of  'the problem Part 2' ");
        System.out.println("Enter choice'4' implement procedures to meet the requirements of  'the problem Part 2 continue'");
        while (!done) {
            // Read from the keyboard
            z =  (char) System.in.read();
            if (z == '\n') continue; // Ignore a <newline> - OSX
            if (z == '\r') continue; // Ignore a <carriage return> - Windows
            // Switch based on results and take action
            switch (z) {
                default:
                    System.out.println("Invalid value:" );
                    break;
                case '1':
                    System.out.println("instantiate instances to test each of the six cases presented in the table");
                    VitalSigns2 v1 =new VitalSigns2(25,90,80,6,21.5);
                    Patient Infant = new Patient(1,v1 ,"jack");
                    System.out.println("\n");
                    System.out.println("The first show part is hardcode");
                    Infant.isPatientNormal(1,v1);
                    System.out.println("\n");

                    VitalSigns2 v2 =new VitalSigns2(35,130,60,3,5.5);
                    Patient Newborn = new Patient(0,v2,"sun");
                    Newborn.isPatientNormal(0,v2);
                    System.out.println("\n");

                    VitalSigns2 v3 =new VitalSigns2(25,90,100,11,24.5);
                    Patient Toddler = new Patient(2,v3,"a");
                    Toddler.isPatientNormal(2,v3);
                    System.out.println("\n");

                    VitalSigns2 v4 =new VitalSigns2(25,90,96,16,35);
                    Patient Preschooler = new Patient(4,v4,"b");
                    Preschooler.isPatientNormal(4,v4);
                    System.out.println("\n");

                    VitalSigns2 v5 =new VitalSigns2(25,90,110,31,44.5);
                    Patient SchoolAge = new Patient(7,v5,"c");
                    SchoolAge.isPatientNormal(7,v5);
                    System.out.println("\n");

                    VitalSigns2 v6 =new VitalSigns2(18,65,115,90,120);
                    Patient Adolescent = new Patient(18,v6,"d");
                    Adolescent.isPatientNormal(18,v6);
                    System.out.println("\n");
                    list.add(Infant);
                    list.add(Newborn);
                    list.add(Toddler);
                    list.add(Preschooler);
                    list.add(SchoolAge);
                    list.add(Adolescent);

                    break;
                case '2':
                    System.out.println("Create two test cases to demonstrate abnormal instances");
                    VitalSigns2 v7 =new VitalSigns2(0,0,0,0,0);
                    Patient testPeople1 = new Patient(-1,v7,"e");
                    testPeople1.isPatientNormal(-1,v7);
                    System.out.println("\n");

                    VitalSigns2 v8 =new VitalSigns2(1000,1000,1000,1000,1000);
                    Patient testPeople2 = new Patient(500,v7,"f");
                    testPeople2.isPatientNormal(500,v7);
                    System.out.println("\n");
                    list.add(testPeople1);
                    list.add(testPeople2);
                    break;
                case '3':
                    System.out.println("Manually input the patient information, save the previous information and the input information into the ArrayList, and print vital signs history ");
                    System.out.println("Next we'll start the input section");
                    System.out.println("Start the input test, enter “Enter” press to start the program");
                    Scanner sc = new Scanner(System.in);
                    String str = sc.nextLine();
                    System.out.println("Please enter message，Press enter once after each input ， the test ends after Enter six data input");
                    System.out.println("form: (int age,double RespiratoryRate,int HeartRate,int SystolicBloodPressure,int WeightInKilos,double WeightInPounds");
                    int x1 = sc.nextInt();
                    int x2 = sc.nextInt();
                    int x3 = sc.nextInt();
                    int x4 = sc.nextInt();
                    double y1 = sc.nextDouble();
                    double y2 = sc.nextDouble();
                    VitalSigns2 v9 =new VitalSigns2(y1,x2,x3,x4,y2);
                    Patient testEnterPeople = new Patient(x1,v9,"TestPeople");
                    testEnterPeople.isPatientNormal(x1,v9);
                    System.out.println("Input complete");

                    list.add(testEnterPeople);
                    System.out.println("\n");
                    System.out.println("print the vital signs history");
                    for(Patient p1Info:list){
                        System.out.println(p1Info);
                    }

                    break;
                case '4':
                    System.out.println("add new method 'isThisVitalSignNormal(vsign)',Enter patient information to check the normal range and Enter attribute name to find a match");
                    System.out.println("Next we'll start the 'Homework Part 2 continue' section");
                    System.out.println("Start the input test, enter “Enter” press to start the program");
                    Scanner a = new Scanner(System.in);
                    String abc = a.nextLine();
                    System.out.println("First, input 6 data as the parameters of our instance");
                    System.out.println("Please enter message，Press enter once after each input ， the first part input ends after Enter six data input");
                    System.out.println("form: (int age,double RespiratoryRate,int HeartRate,int SystolicBloodPressure,int WeightInKilos,double WeightInPounds");
                    int a1 = a.nextInt();
                    int a2 = a.nextInt();
                    int a3 = a.nextInt();
                    int a4 = a.nextInt();
                    double b1 = a.nextDouble();
                    double b2 = a.nextDouble();
                    VitalSigns2 v10 =new VitalSigns2(b1,a2,a3,a4,b2);
                    Patient testEnterPeople1 = new Patient(a1,v10,"matchPeople");
                    testEnterPeople1.isThisVitalSignNormal(a1,v10);
                    System.out.println("this show whether we match successfully and whether the input case is in the normal range");
                    break;

                case 'q':// Exit if 'q' is entered
                    done = true;
                    break;
            }
        }
        System.out.println("We are quitting");

    }
}

    class Test{
        public static void main(String[] args) throws IOException {
            method method = new method();
        }
    }
