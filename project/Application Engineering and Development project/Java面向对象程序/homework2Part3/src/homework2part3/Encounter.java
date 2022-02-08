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
import java.util.Scanner;

public class Encounter  {
    String hospital;
    String doctor;
    int floor;
    double age;
    VitalSigns vitalSigns;

    public Encounter() {

    }

    public Encounter(String hospital, String doctor, int floor, double age,VitalSigns vitalSigns) {
        this.hospital = hospital;
        this.doctor = doctor;
        this.floor = floor;
        this.age = age;
        this.vitalSigns=vitalSigns;
    }

    public void  isThisVitalSignNormal(double age, VitalSigns vitalsigns){
        Scanner input = new Scanner(System.in);//Use the scanner class to accept input
        System.out.println("\n");
        System.out.println("please print AttributeName");
        String attributename =input.nextLine();

        switch(attributename)
        {
            case "RespiratoryRate":
                System.out.println("True   the input String match");
                isPatientNormal(age,vitalsigns);
                break;
            case "HeartRate":
                System.out.println("True   the input String match");
                isPatientNormal(age,vitalsigns);
                break;
            case "SystolicBloodPressure":
                System.out.println("True   the input String match");
                isPatientNormal(age,vitalsigns);
                break;
            case "WeightInKilos":
                System.out.println("True   the input String match");
                isPatientNormal(age,vitalsigns);
                break;
            case "WeightInPounds":
                System.out.println("True   the input String match");
                isPatientNormal(age,vitalsigns);
                break;
            default:
                System.out.println("False");
        }
    }





    public void isPatientNormal(double age,VitalSigns vitalsigns){
        System.out.println(vitalsigns);
        findAge(age);
        testRespiratoryRate(age,vitalsigns);
        testHeartRate(age,vitalsigns);
        testSystolicBloodPressure(age,vitalsigns);
        testWeightInKilos(age,vitalsigns);
        testWeightInPounds(age,vitalsigns);
    }



    public void findAge(double age){
        if(this.age <0) {
            System.out.println("the patient age is wrong");
        }else if(this.age<0.0834){
            System.out.println("the patient is Newborn");
        }else if(this.age<=1){
            System.out.println("the patient is Infant");
        }else if(this.age<=3){
            System.out.println("the patient is Toddler");
        }else if(this.age<=6){
            System.out.println("the patient is Preschooler");
        }else if(this.age<13){
            System.out.println("the patient is SchoolAge");
        }else if(this.age<=100){
            System.out.println("the patient is Adolescent");
        }else {
            System.out.println("the patient is too old to survive");
        }
    }




    public void testRespiratoryRate(double age,VitalSigns vitalsigns) {
        if(age<0){
            System.out.println("False");
        }
        else if (age<0.0834) {
            if (vitalsigns.RespiratoryRate < 30) {
                System.out.println("False    " + "the Newborn's RespiratoryRate is Abnormal");
            } else if (vitalsigns.RespiratoryRate <= 50) {
                System.out.println("true     " + "the Newborn's RespiratoryRate is Normal");
            } else if (vitalsigns.RespiratoryRate > 50) {
                System.out.println("False    " + "the Newborn's RespiratoryRate is Abnormal");
            }
        }
        else if (age<=1) {
            if (vitalsigns.RespiratoryRate<20){
                System.out.println("False    " + "the Infant's RespiratoryRate is Abnormal");
            }else if(vitalsigns.RespiratoryRate<=30){
                System.out.println("true     " + "the Infant's RespiratoryRate is Normal");
            }else if(vitalsigns.RespiratoryRate>30) {
                System.out.println("False    " + "the Infant's RespiratoryRate is Abnormal");
            }

        }
        else if (age<=3) {
            if (vitalsigns.RespiratoryRate<20){
                System.out.println("False    " + "the Toddler's RespiratoryRate is Abnormal");
            }else if(vitalsigns.RespiratoryRate<=30){
                System.out.println("true     " + "the Toddler's RespiratoryRate is Normal");
            }else if(vitalsigns.RespiratoryRate>30) {
                System.out.println("False    " + "the Toddler's RespiratoryRate is Abnormal");
            }

        }
        else if (age<=5) {
            if (vitalsigns.RespiratoryRate<20){
                System.out.println("False    " + "the Preschooler's RespiratoryRate is Abnormal");
            }else if(vitalsigns.RespiratoryRate<=30){
                System.out.println("true     " + "the Preschooler's RespiratoryRate is Normal");
            }else if(vitalsigns.RespiratoryRate>30) {
                System.out.println("False    " + "the Preschooler's RespiratoryRate is Abnormal");
            }

        }
        else if (age<13) {
            if (vitalsigns.RespiratoryRate<20){
                System.out.println("False    " + "the SchoolAge's RespiratoryRate is Abnormal");
            }else if(vitalsigns.RespiratoryRate<=30){
                System.out.println("true     " + "the SchoolAge's RespiratoryRate is Normal");
            }else if(vitalsigns.RespiratoryRate>30) {
                System.out.println("False    " + "the SchoolAge's RespiratoryRate is Abnormal");
            }

        }
        else if (age<=100) {
            if (vitalsigns.RespiratoryRate<12){
                System.out.println("False    " + "the Adolescent's RespiratoryRate is Abnormal");
            }else if(vitalsigns.RespiratoryRate<20){
                System.out.println("true     " + "the Adolescent's RespiratoryRate is Normal");
            }else if(vitalsigns.RespiratoryRate>20) {
                System.out.println("False    " + "the Adolescent's RespiratoryRate is Abnormal");
            }

        }
        else  {
            System.out.println("False"); }
    }




    private void testWeightInKilos(double age,VitalSigns vitalsigns) {
        if(age<0){
            System.out.println("False");
        }
        else if (age<0.0834) {
            if (vitalsigns.WeightInKilos<2){
                System.out.println("False    " + "the Newborn's WeightInKilos is Abnormal");
            }else if(vitalsigns.WeightInKilos<=3){
                System.out.println("true     " + "the Newborn's WeightInKilos is Normal");
            }else if(vitalsigns.WeightInKilos>3) {
                System.out.println("False    " + "the Newborn's WeightInKilos is Abnormal");
            }
        }
        else if (age<=1) {
            if (vitalsigns.WeightInKilos<4){
                System.out.println("False    " + "the Infant's WeightInKilos is Abnormal");
            }else if(vitalsigns.WeightInKilos<=10){
                System.out.println("true     " + "the Infant's WeightInKilos is Normal");
            }else if(vitalsigns.WeightInKilos>10) {
                System.out.println("False    " + "the Infant's WeightInKilos is Abnormal");
            }

        }
        else if (age<=3) {
            if (vitalsigns.WeightInKilos<10){
                System.out.println("False    " + "the Toddler's WeightInKilos is Abnormal");
            }else if(vitalsigns.WeightInKilos<=14){
                System.out.println("true     " + "the Toddler's WeightInKilos is Normal");
            }else if(vitalsigns.WeightInKilos>14) {
                System.out.println("False    " + "the Toddler's WeightInKilos is Abnormal");
            }

        }
        else if (age<=5) {
            if (vitalsigns.WeightInKilos<14){
                System.out.println("False    " + "the Preschooler's WeightInKilos is Abnormal");
            }else if(vitalsigns.WeightInKilos<=18){
                System.out.println("true     " + "the Preschooler's WeightInKilos is Normal");
            }else if(vitalsigns.WeightInKilos>18) {
                System.out.println("False    " + "the Preschooler's WeightInKilos is Abnormal");
            }

        }
        else if (age<13) {
            if (vitalsigns.WeightInKilos<20){
                System.out.println("False    " + "the SchoolAge's WeightInKilos is Abnormal");
            }else if(vitalsigns.WeightInKilos<=42){
                System.out.println("true     " + "the SchoolAge's WeightInKilos is Normal");
            }else if(vitalsigns.WeightInKilos>42) {
                System.out.println("False    " + "the SchoolAge's WeightInKilos is Abnormal");
            }

        }
        else if (age<=100) {
            if (vitalsigns.WeightInKilos<50){
                System.out.println("False    " + "the Adolescent's WeightInKilos is Abnormal");
            }else if(vitalsigns.WeightInKilos>=50){
                System.out.println("true     " + "the Adolescent's WeightInKilos is Normal");
            }
        }
        else  {
            System.out.println("False"); }
    }


    private void testSystolicBloodPressure(double age,VitalSigns vitalsigns) {
        if(age<0){
            System.out.println("False");
        }
        else if (age<0.0834) {
            if (vitalsigns.SystolicBloodPressure<50){
                System.out.println("False    " + "the Newborn's SystolicBloodPressure is Abnormal");
            }else if(vitalsigns.SystolicBloodPressure<=70){
                System.out.println("true     " + "the Newborn's SystolicBloodPressure is Normal");
            }else if(vitalsigns.WeightInKilos>70) {
                System.out.println("False    " + "the Newborn's SystolicBloodPressure is Abnormal");
            }
        }
        else if (age<=1) {
            if (vitalsigns.SystolicBloodPressure<70){
                System.out.println("False    " + "the Infant's SystolicBloodPressure is Abnormal");
            }else if(vitalsigns.SystolicBloodPressure<=100){
                System.out.println("true     " + "the Infant's SystolicBloodPressure is Normal");
            }else if(vitalsigns.SystolicBloodPressure>100) {
                System.out.println("False    " + "the Infant's SystolicBloodPressure is Abnormal");
            }

        }
        else if (age<=3) {
            if (vitalsigns.SystolicBloodPressure<80){
                System.out.println("False    " + "the Toddler's SystolicBloodPressure is Abnormal");
            }else if(vitalsigns.SystolicBloodPressure<=110){
                System.out.println("true     " + "the Toddler's SystolicBloodPressure is Normal");
            }else if(vitalsigns.SystolicBloodPressure>110) {
                System.out.println("False    " + "the Toddler's SystolicBloodPressure is Abnormal");
            }

        }
        else if (age<=5) {
            if (vitalsigns.SystolicBloodPressure<80){
                System.out.println("False    " + "the Preschooler's SystolicBloodPressure is Abnormal");
            }else if(vitalsigns.SystolicBloodPressure<=110){
                System.out.println("true     " + "the Preschooler's SystolicBloodPressure is Normal");
            }else if(vitalsigns.SystolicBloodPressure>110) {
                System.out.println("False    " + "the Preschooler's SystolicBloodPressure is Abnormal");
            }

        }
        else if (age<13) {
            if (vitalsigns.SystolicBloodPressure<80){
                System.out.println("False    " + "the SchoolAge's SystolicBloodPressure is Abnormal");
            }else if(vitalsigns.SystolicBloodPressure<=120){
                System.out.println("true     " + "the SchoolAge's SystolicBloodPressure is Normal");
            }else if(vitalsigns.SystolicBloodPressure>120) {
                System.out.println("False    " + "the SchoolAge's SystolicBloodPressure is Abnormal");
            }

        }
        else if (age<=100) {
            if (vitalsigns.SystolicBloodPressure<110){
                System.out.println("False    " + "the Adolescent's SystolicBloodPressure is Abnormal");
            }else if(vitalsigns.SystolicBloodPressure<=120){
                System.out.println("true     " + "the Adolescent's SystolicBloodPressure is Normal");
            }else if(vitalsigns.SystolicBloodPressure>120){
                System.out.println("true     " + "the Adolescent's SystolicBloodPressure is Normal");
            }
        }
        else  {
            System.out.println("False"); }
    }


    private void testHeartRate(double age,VitalSigns vitalsigns) {
        if(age<0){
            System.out.println("False");
        }
        else if (age<0.0834) {
            if (vitalsigns.HeartRate<120){
                System.out.println("False    " + "the Newborn's HeartRate is Abnormal"+ "Act quickly，the children show bradycardia is sign，maybe hypoxia.");
            }else if(vitalsigns.HeartRate<=160){
                System.out.println("true     " + "the Newborn's HeartRate is Normal");
            }else if(vitalsigns.HeartRate>160) {
                System.out.println("False    " + "the Newborn's HeartRate is Abnormal");
            }
        }
        else if (age<=1) {
            if (vitalsigns.HeartRate<80){
                System.out.println("False    " + "the Infant's HeartRate is Abnormal"+ "Act quickly，the children show bradycardia is sign，maybe hypoxia.");
            }else if(vitalsigns.HeartRate<=140){
                System.out.println("true     " + "the Infant's HeartRate is Normal");
            }else if(vitalsigns.HeartRate>140) {
                System.out.println("False    " + "the Infant's HeartRate is Abnormal");
            }

        }
        else if (age<=3) {
            if (vitalsigns.HeartRate<80){
                System.out.println("False    " + "the Toddler's HeartRate is Abnormal"+ "Act quickly，the children show bradycardia is sign，maybe hypoxia.");
            }else if(vitalsigns.HeartRate<=130){
                System.out.println("true     " + "the Toddler's HeartRate is Normal");
            }else if(vitalsigns.HeartRate>130) {
                System.out.println("False    " + "the Toddler's HeartRate is Abnormal");
            }

        }
        else if (age<=5) {
            if (vitalsigns.HeartRate<80){
                System.out.println("False    "+  "the Preschooler's HeartRate is Abnormal" + "Act quickly，the children show bradycardia is sign，maybe hypoxia.");
            }else if(vitalsigns.HeartRate<=120){
                System.out.println("true     " + "the Preschooler's HeartRate is Normal");
            }else if(vitalsigns.HeartRate>120) {
                System.out.println("False    " + "the Preschooler's HeartRate is Abnormal");
            }

        }
        else if (age<13) {
            if (vitalsigns.HeartRate<70){
                System.out.println("False    " + "the SchoolAge's HeartRate is Abnormal");
            }else if(vitalsigns.HeartRate<=110){
                System.out.println("true     " + "the SchoolAge's HeartRate is Normal");
            }else if(vitalsigns.HeartRate>110) {
                System.out.println("False    " + "the SchoolAge's HeartRate is Abnormal");
            }

        }
        else if (age<=100) {
            if (vitalsigns.HeartRate<55){
                System.out.println("False    " + "the Adolescent's HeartRate is Abnormal");
            }else if(vitalsigns.HeartRate<=105){
                System.out.println("true     " + "the Adolescent's HeartRate is Normal");
            }else if(vitalsigns.HeartRate>105){
                System.out.println("true     " + "the Adolescent's HeartRate is Normal");
            }
        }
        else  {
            System.out.println("False"); }
    }
    private void testWeightInPounds(double age,VitalSigns vitalsigns) {
        if(age<0){
            System.out.println("False");
        }
        else if (age<0.0834) {
            if (vitalsigns.WeightInPounds<4.5){
                System.out.println("False    " + "the Newborn's WeightInPounds is Abnormal");
            }else if(vitalsigns.WeightInPounds<=7){
                System.out.println("true     " + "the Newborn's WeightInPounds is Normal");
            }else if(vitalsigns.WeightInPounds>7) {
                System.out.println("False    " + "the Newborn's WeightInPounds is Abnormal");
            }
        }
        else if (age<=1) {
            if (vitalsigns.WeightInPounds<9){
                System.out.println("False    " + "the Infant's WeightInPounds is Abnormal");
            }else if(vitalsigns.WeightInPounds<=22){
                System.out.println("true     " + "the Infant's WeightInPounds is Normal");
            }else if(vitalsigns.WeightInPounds>22) {
                System.out.println("False    " + "the Infant's WeightInPounds is Abnormal");
            }

        }
        else if (age<=3) {
            if (vitalsigns.WeightInPounds<22){
                System.out.println("False    " + "the Toddler's WeightInPounds is Abnormal");
            }else if(vitalsigns.WeightInPounds<=31){
                System.out.println("true     " + "the Toddler's WeightInPounds is Normal");
            }else if(vitalsigns.WeightInPounds>31) {
                System.out.println("False    " + "the Toddler's WeightInPounds is Abnormal");
            }

        }
        else if (age<=5) {
            if (vitalsigns.WeightInPounds<31){
                System.out.println("False    " + "the Preschooler's WeightInPounds is Abnormal");
            }else if(vitalsigns.WeightInPounds<=40){
                System.out.println("true     " + "the Preschooler's WeightInPounds is Normal");
            }else if(vitalsigns.WeightInPounds>40) {
                System.out.println("False    " + "the Preschooler's WeightInPounds is Abnormal");
            }

        }
        else if (age<13) {
            if (vitalsigns.WeightInPounds<41){
                System.out.println("False    " + "the SchoolAge's WeightInPounds is Abnormal");
            }else if(vitalsigns.WeightInPounds<=92){
                System.out.println("true     " + "the SchoolAge's WeightInPounds is Normal");
            }else if(vitalsigns.WeightInPounds>92) {
                System.out.println("False    " + "the SchoolAge's WeightInPounds is Abnormal");
            }

        }
        else if (age<=100) {
            if (vitalsigns.WeightInPounds<110){
                System.out.println("False    " + "the Adolescent's WeightInPounds is Abnormal");
            } else if(vitalsigns.WeightInPounds>=110){
                System.out.println("true     " + "the Adolescent's WeightInPounds is Normal");
            }
        }
        else  {
            System.out.println("False"); }
    }


    @Override
    public String toString() {
        return "Encounter{" +
                "hospital='" + hospital + '\'' +
                ", doctor='" + doctor + '\'' +
                ", floor=" + floor +
                ", age=" + age +
                ", vitalSigns=" + vitalSigns +
                '}';
    }
}