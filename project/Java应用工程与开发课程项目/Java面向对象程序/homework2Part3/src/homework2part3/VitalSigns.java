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
public class VitalSigns {
    double RespiratoryRate;
    int HeartRate;
    int SystolicBloodPressure;
    int WeightInKilos;
    double WeightInPounds;
    String time;


    public VitalSigns() {
    }

    public VitalSigns(double RespiratoryRate, int HeartRate, int SystolicBloodPressure, int WeightInKilos, double WeightInPounds,String time) {
        this.RespiratoryRate = RespiratoryRate;
        this.HeartRate = HeartRate;
        this.SystolicBloodPressure = SystolicBloodPressure;
        this.WeightInKilos = WeightInKilos;
        this.WeightInPounds = WeightInPounds;
        this.time = time;
        //feverAndStress(); when get fever and stress use this method
    }

    public void feverAndStress(){
        System.out.println("patient get stress and fever");
        HeartRate++;
        SystolicBloodPressure++;
        RespiratoryRate++;

    }

    @Override
    public String toString() {
        return "VitalSigns{" +
                "RespiratoryRate=" + RespiratoryRate +
                ", HeartRate=" + HeartRate +
                ", SystolicBloodPressure=" + SystolicBloodPressure +
                ", WeightInKilos=" + WeightInKilos +
                ", WeightInPounds=" + WeightInPounds +
                ", time=" + time +
                '}';
    }
}