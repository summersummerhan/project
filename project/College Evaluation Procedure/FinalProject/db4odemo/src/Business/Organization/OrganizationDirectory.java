/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SysServicePersonnel.getValue())) {
            organization = new SysServicePersonnelOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.StoreAdmin.getValue())) {
            organization = new StoreAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.StoreReceptionist.getValue())) {
            organization = new StoreReceptionistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.StoreDistributionPersonnel.getValue())) {
            organization = new StoreDistributionPersonnelOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DeliveryAgentAdmin.getValue())) {
            organization = new DeliveryAgentAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DistributionCenters.getValue())) {
            organization = new DistributionCentersOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DeliveryMan.getValue())) {
            organization = new DeliveryManOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Driver.getValue())) {
            organization = new DriverOrganization();
            organizationList.add(organization);
        }


        return organization;
    }
}
