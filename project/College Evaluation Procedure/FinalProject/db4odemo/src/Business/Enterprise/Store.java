/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tzm
 */
public class Store extends Enterprise {

    private ItemDirectory itemDirectory;

    public Store(String name) {
        super(name, Enterprise.EnterpriseType.Store);
        itemDirectory = new ItemDirectory();
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ItemDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ItemDirectory itemDirectory) {
        this.itemDirectory = itemDirectory;
    }

    public void addProductToList(Item item) {
        this.getItemDirectory().getItemDirectory().add(item);
    }
}
