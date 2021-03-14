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

public class Patient extends  Person{
 VitalSigns vitalSigns;
 EncounterHistory encounterHistory;

 public Patient() throws IOException {
  encounterHistory = new EncounterHistory();
 }

 public Patient(VitalSigns vitalSigns, EncounterHistory encounterHistory) throws IOException {
  this.vitalSigns = vitalSigns;
  this.encounterHistory = encounterHistory;
 }



 public VitalSigns getVitalSigns() {
  return vitalSigns;
 }

 public void setVitalSigns(VitalSigns vitalSigns) {
  this.vitalSigns = vitalSigns;
 }

 public EncounterHistory getEncounterHistory() {
  return encounterHistory;
 }

 public void setEncounterHistory(EncounterHistory encounterHistory) {
  this.encounterHistory = encounterHistory;
 }

 @Override
 public String toString() {
  return "Patient{" +
          "vitalSigns=" + vitalSigns +
          ", encounterHistory=" + encounterHistory +
          ", name='" + name + '\'' +
          ", age=" + age +
          ", ssn=" + ssn +
          '}';
 }
}