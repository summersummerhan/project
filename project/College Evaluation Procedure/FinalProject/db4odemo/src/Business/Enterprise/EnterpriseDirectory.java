/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author tzm
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {

        if (type == Enterprise.EnterpriseType.CustomerCenter) {
            CustomerCenter enterprise = new CustomerCenter(name);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        if (type == Enterprise.EnterpriseType.DeliveryAgent) {
            DeliveryAgent enterprise = new DeliveryAgent(name);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        if (type == Enterprise.EnterpriseType.Store) {
            Store enterprise = new Store(name);
            enterpriseList.add(enterprise);
            return enterprise;
        }

        return null;
    }
}
