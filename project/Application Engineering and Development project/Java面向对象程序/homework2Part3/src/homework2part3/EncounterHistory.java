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
import java.util.ArrayList;

public class EncounterHistory {
    ArrayList<Encounter> encounterList;
    Encounter encounter;

    public EncounterHistory()  {

    }


    @Override
    public String toString() {
        return "EncounterHistory{" +
                "encounterList=" + encounterList +
                ", encounter=" + encounter +
                '}';
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
}