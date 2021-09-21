/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    public enum RoleType {
        SysAdmin("Sysadmin"),
        SysServicePersonnel("SysServicePersonnel"),
        Customer("Customer"),
        StoreAdmin("StoreAdmin"),
        StoreReceptionist("StoreReceptionist"),
        StoreDistributionPersonnel("StoreDistributionPersonnel"),
        DeliveryAgentAdmin("DeliveryAgentAdmin"),
        Driver("Driver"),
        DistributionCenterAdmin("DistributionCenterAdmin"),
        DeliveryMan("Delivery");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,JFrame frame);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
