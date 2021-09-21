/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author tzm
 */
public class Item {

    private String name;
    private Double unitPrice;
    private int id;

    private static int count = 1;

    public Item(String name, Double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
        id = count;
        count++;
    }

    public Item() {
        id = count;
        count++;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return name;
    }

}
