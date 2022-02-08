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
public class VitalSigns2 {

    double RespiratoryRate;
    int HeartRate;
    int SystolicBloodPressure;
    int WeightInKilos;
    double WeightInPounds;


    public VitalSigns2() {
    }

    public VitalSigns2(double RespiratoryRate, int HeartRate, int SystolicBloodPressure, int WeightInKilos, double WeightInPounds) {
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

    @Override
    public String toString() {
        return "VitalSigns2{" +
                "RespiratoryRate=" + RespiratoryRate +
                ", HeartRate=" + HeartRate +
                ", SystolicBloodPressure=" + SystolicBloodPressure +
                ", WeightInKilos=" + WeightInKilos +
                ", WeightInPounds=" + WeightInPounds +
                '}';
    }
}
