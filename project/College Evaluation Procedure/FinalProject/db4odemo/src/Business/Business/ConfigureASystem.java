package Business.Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author tzm
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee e = system.getEmployeeDirectory().createEmployee();
        e.setFirstName("Sys");
        e.setLastName("Admin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", e, new SystemAdminRole());
        Enterprise customerCenter = system.getEnterpriseDirectory().createAndAddEnterprise("Customer", Enterprise.EnterpriseType.CustomerCenter);
        customerCenter.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        system.getOrganizationDirectory().createOrganization(Organization.Type.SysServicePersonnel);
        
        return system;
    }

}
