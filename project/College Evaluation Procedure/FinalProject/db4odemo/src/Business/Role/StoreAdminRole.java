/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import UI.Store.StoreManagerMainJPanel;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class StoreAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,JFrame frame) {
        return new StoreManagerMainJPanel(userProcessContainer, organization, enterprise, account, system, frame);
    }
    @Override
    public String toString() {
        return "StoreAdmin";
    }

}
