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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientDirectory {
    ArrayList <Patient> patientList;
    ArrayList<Encounter> encounterList;
    Patient patient;

    public PatientDirectory() throws IOException {
        patientList = new ArrayList<>();
        encounterList = new ArrayList<>();
        char z ;
        boolean done = false;
        System.out.println("Enter choice (1,2,3,4,5) or 'q' to quit, then press <enter>");
        System.out.println("Enter choice'1' Create instances to show the Encounter");
        System.out.println("Enter choice'2' Create abnormal instances to show the Encounter");
        System.out.println("Enter choice'3' Manually input encounter instances, store all instances and traverse the output");
        System.out.println("Enter choice'4' Add new method 'isThisVitalSignNormal(vsign)'，Manually input encounter instances, store all instances and traverse the output");
        System.out.println("Enter choice'5' show information about the patientDirectory");
        System.out.println("Enter choice'q' to quit process");

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
                    System.out.println("instantiate six encounter  instances ");
                    VitalSigns v1 =new VitalSigns(25,90,80,6,21.5,"1:01");
                    Encounter encounter1 = new Encounter("A hospital","brown",1,1,v1);
                    System.out.println("\n");
                    System.out.println("The first show part is hardcode");
                    System.out.println(encounter1);
                    encounter1.isPatientNormal(1,v1);
                    System.out.println("\n");

                    VitalSigns v2 =new VitalSigns(35,130,60,3,5.5,"12:05");
                    Encounter encounter2 = new Encounter("B hospital","smart",2,22,v2);
                    System.out.println(encounter2);
                    encounter2.isPatientNormal(22,v2);
                    System.out.println("\n");

                    VitalSigns v3 =new VitalSigns(25,90,100,11,24.5,"3;03");
                    Encounter encounter3 = new Encounter("C hospital","tatum",3,2,v3);
                    System.out.println(encounter3);
                    encounter3.isPatientNormal(2,v3);
                    System.out.println("\n");

                    VitalSigns v4 =new VitalSigns(25,90,96,16,35,"8:09");
                    Encounter encounter4 = new Encounter("D hospital","theis",4,5,v4);
                    System.out.println(encounter4);
                    encounter4.isPatientNormal(5,v4);
                    System.out.println("\n");

                    VitalSigns v5 =new VitalSigns(25,90,110,31,44.5,"22:14");
                    Encounter encounter5 = new Encounter("E hospital","walker",5,0.06,v5);
                    System.out.println(encounter5);
                    encounter5.isPatientNormal(0.06,v5);
                    System.out.println("\n");

                    VitalSigns v6 =new VitalSigns(18,65,115,90,120,"16:30");
                    Encounter encounter6 = new Encounter("F hospital","pierce",6,50,v6);
                    System.out.println(encounter6);
                    encounter6.isPatientNormal(18,v6);
                    System.out.println("\n");
                    encounterList.add(encounter1);
                    encounterList.add(encounter2);
                    encounterList.add(encounter3);
                    encounterList.add(encounter4);
                    encounterList.add(encounter5);
                    encounterList.add(encounter6);

                    break;
                case '2':
                    System.out.println("Create two test encounter to demonstrate abnormal instances");
                    VitalSigns v7 =new VitalSigns(0,0,0,0,0,"11;08");
                    Encounter encounter7 = new Encounter("G hospital","rondo",7,50,v7);
                    System.out.println(encounter7);
                    encounter7.isPatientNormal(50,v7);
                    System.out.println("\n");

                    VitalSigns v8 =new VitalSigns(1000,1000,1000,1000,1000,"18:06");
                    Encounter encounter8 = new Encounter("H hospital","davis",7,40,v8);
                    System.out.println(encounter8);
                    encounter8.isPatientNormal(40,v7);
                    System.out.println("\n");
                    encounterList.add(encounter7);
                    encounterList.add(encounter8);
                    break;
                case '3':
                    System.out.println("Manually input the patient information, save the previous information and the input information into the ArrayList, and print vital signs history ");
                    System.out.println("Next we'll start the input section");
                    System.out.println("Start the input test, enter “Enter” press to start the program");
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Please enter message，Press enter once after each input ，the test ends after Enter ten data input");
                    System.out.println("form: (double age,double RespiratoryRate,int HeartRate,int SystolicBloodPressure,int WeightInKilos,double WeightInPounds,String time,String hospital,String doctor,int floor");
                    int x1 = sc.nextInt();
                    int x2 = sc.nextInt();
                    int x3 = sc.nextInt();
                    int x4 = sc.nextInt();
                    double y1 = sc.nextDouble();
                    double y2 = sc.nextDouble();
                    String str = sc.next();
                    String hospital = sc.next();
                    String doctor = sc.next();
                    int floor = sc.nextInt();

                    VitalSigns v9 =new VitalSigns(y1,x2,x3,x4,y2,str);
                    Encounter testEnterEncounter = new Encounter(hospital,doctor,floor,x1,v9);
                    System.out.println(testEnterEncounter);
                    testEnterEncounter.isPatientNormal(x1,v9);
                    System.out.println("Input complete");

                    encounterList.add(testEnterEncounter);
                    System.out.println("\n");
                    System.out.println("print the Encounter history");
                    for(Encounter p1Info:encounterList){
                        System.out.println(p1Info);
                    }
                    break;
                case '4':
                    System.out.println("add new method 'isThisVitalSignNormal(vsign)',Enter Encounter information to check the normal range and Enter attribute name to find a match");
                    System.out.println("Start the input test, enter “Enter” press to start the program");
                    Scanner a = new Scanner(System.in);
                    String abc = a.nextLine();
                    System.out.println("First, input ten data as the parameters of our instance");
                    System.out.println("Please enter message，Press enter once after each input ， the first part input ends after Enter ten data input");
                    System.out.println("form: (double age,double RespiratoryRate,int HeartRate,int SystolicBloodPressure,int WeightInKilos,double WeightInPounds,String time,String hospital,String doctor,int floor");

                    int z1 = a.nextInt();
                    int z2 = a.nextInt();
                    int z3 = a.nextInt();
                    int z4 = a.nextInt();
                    double m1 = a.nextDouble();
                    double m2 = a.nextDouble();
                    String str1 = a.next();
                    String hospital1 = a.next();
                    String doctor1 = a.next();
                    int floor1 = a.nextInt();

                    VitalSigns v10 =new VitalSigns(m1,z2,z3,z4,m2,str1);
                    Encounter testEnterEncounter1 = new Encounter(hospital1,doctor1,floor1,z1,v10);
                    System.out.println(testEnterEncounter1);
                    testEnterEncounter1.isThisVitalSignNormal(z1,v10);


                    System.out.println("this show whether we match successfully and whether the input case is in the normal range");
                    break;

                case '5':
                    VitalSigns vitalSigns1 = new VitalSigns(25,90,80,6,21.5,"1:01");
                    EncounterHistory encounterHistory1 = new EncounterHistory();
                    Patient patient1 = new Patient(vitalSigns1,encounterHistory1);

                    VitalSigns vitalSigns2 = new VitalSigns(35,130,60,3,5.5,"12:05");
                    EncounterHistory encounterHistory2 = new EncounterHistory();
                    Patient patient2 = new Patient(vitalSigns2,encounterHistory2);

                    VitalSigns vitalSigns3 = new VitalSigns(25,90,100,11,24.5,"3;03");
                    EncounterHistory encounterHistory3 = new EncounterHistory();
                    Patient patient3 = new Patient(vitalSigns3,encounterHistory3);


                    patientList.add(patient1);
                    patientList.add(patient2);
                    patientList.add(patient3);
                    System.out.println("Displays information about the patientDirectory");
                    for(Patient p2Info:patientList){
                        System.out.println(p2Info);
                    }

                    break;
                case 'q':// Exit if 'q' is entered
                    done = true;
                    break;
            }
        }
        System.out.println("We had quit the program");




    }


    public void ViewPatientDirectory(){
    }

    public PatientDirectory(ArrayList<Patient> patientList, Patient patient) throws IOException {
        this.patientList = patientList;
        this.patient = patient;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }


}