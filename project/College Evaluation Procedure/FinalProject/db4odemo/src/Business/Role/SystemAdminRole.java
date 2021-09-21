/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import UI.SystemAdmin.SysAdminJPanel;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,JFrame frame) {
        return new SysAdminJPanel(userProcessContainer,account,system,frame);
    }

}
