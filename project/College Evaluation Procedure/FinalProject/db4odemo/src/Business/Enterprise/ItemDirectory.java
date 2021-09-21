/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author tzm
 */
public class ItemDirectory {
    private ArrayList<Item> itemDirectory;

    public ItemDirectory() {
        itemDirectory = new ArrayList();
    }

    public ArrayList<Item> getItemDirectory() {
        return itemDirectory;
    }

 

    public Item createItem() {
        Item item = new Item();
        itemDirectory.add(item);
        return item;
    } 
    
    public void removeItem(Item item) {
        itemDirectory.remove(item);
    }
}
