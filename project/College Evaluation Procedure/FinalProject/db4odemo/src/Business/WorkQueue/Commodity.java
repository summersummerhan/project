/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Order;

/**
 *
 * @author 加藤鹰
 */
public class Commodity extends WorkRequest{
     private Order order;  
    private String customerAddress;
    private String customerPhone;
    private String DeliveryManName;
    private String DeliveryManPhone;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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

    public String getDeliveryManName() {
        return DeliveryManName;
    }

    public void setDeliveryManName(String DeliveryManName) {
        this.DeliveryManName = DeliveryManName;
    }

    public String getDeliveryManPhone() {
        return DeliveryManPhone;
    }

    public void setDeliveryManPhone(String DeliveryManPhone) {
        this.DeliveryManPhone = DeliveryManPhone;
    }

   
}
