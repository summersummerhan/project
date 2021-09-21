/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Store.StoreReceptionistJPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 10643
 */
public class StoreReceptionistRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,JFrame frame) {
        return new StoreReceptionistJPanel(userProcessContainer, organization, enterprise, account, system, frame);
    }
        @Override
    public String toString() {
        return "StoreReceptionist";
    }
}
