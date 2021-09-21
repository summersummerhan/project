/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Order;
import Business.Enterprise.Enterprise;

/**
 *
 * @author tzm
 */
public class ShippingOrder extends WorkRequest {

    private Order order;
    private Enterprise storeEnterprise;
    private Enterprise daEnterprise;
    private String customerAddress;
    private String customerPhone;
    private String storeAddress;
    private String storePhone;

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }
    

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

   

    public Enterprise getDaEnterprise() {
        return daEnterprise;
    }

    public void setDaEnterprise(Enterprise daEnterprise) {
        this.daEnterprise = daEnterprise;
    }

    public Enterprise getStoreEnterprise() {
        return storeEnterprise;
    }

    public void setStoreEnterprise(Enterprise storeEnterprise) {
        this.storeEnterprise = storeEnterprise;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
