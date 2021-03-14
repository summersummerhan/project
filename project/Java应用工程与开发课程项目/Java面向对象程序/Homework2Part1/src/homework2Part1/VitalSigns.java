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
public class VitalSigns {

    double RespiratoryRate;
    int HeartRate;
    int SystolicBloodPressure;
    int WeightInKilos;
    double WeightInPounds;


    public VitalSigns() {
    }

    public VitalSigns(double RespiratoryRate, int HeartRate, int SystolicBloodPressure, int WeightInKilos, double WeightInPounds) {
        this.RespiratoryRate = RespiratoryRate;
        this.HeartRate = HeartRate;
        this.SystolicBloodPressure = SystolicBloodPressure;
        this.WeightInKilos = WeightInKilos;
        this.WeightInPounds = WeightInPounds;
        //feverAndStress(); when get fever and stress use this method
    }

    public void feverAndStress(){
        System.out.println("patient get stress and fever");
        HeartRate++;
        SystolicBloodPressure++;
        RespiratoryRate++;

    }



}
