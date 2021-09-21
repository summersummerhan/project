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
import UI.DeliveryWork.DeliveryManJPanel1;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 加藤鹰
 */
public class DeliveryManRole  extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, JFrame frame) {
        return new DeliveryManJPanel1( userProcessContainer, organization,enterprise, account, system, frame);
    }
    
}
