/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {
        Customer("Customer Organization"),
        SysServicePersonnel("SysServicePersonnel Organization"),
        StoreAdmin("StoreAdmin Organization"),
        StoreReceptionist("StoreReceptionist Organization"),
        StoreDistributionPersonnel("StoreDistributionPersonnel Organization"),
        DeliveryAgentAdmin("DeliveryAgentAdmin Organization"),
        DistributionCenters("DistributionCenters Organization"),
        DeliveryMan("DeliveryMan Organization"),
        Driver("Driver Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public Organization() {
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<UserAccount> searchUserAccountByUsername(String s) {
        ArrayList<UserAccount> result = new ArrayList<>();
        if (!this.userAccountDirectory.getUserAccountList().isEmpty()) {
            for (UserAccount ua : this.userAccountDirectory.getUserAccountList()) {

                if (ua.getUsername().toLowerCase().contains(s.toLowerCase())) {
                    if (!result.contains(ua)) {
                        result.add(ua);
                    }
                }

            }
        }
        return result;
    }

}
