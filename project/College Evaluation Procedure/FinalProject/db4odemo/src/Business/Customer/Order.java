/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Item;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Commodity;
import Business.WorkQueue.ShippingOrder;

import Business.WorkQueue.WorkRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tzm
 */
public class Order extends WorkRequest {

    private HashMap<Item, Integer> orderItem;

    private Enterprise enterprise;
    private String deliverymanName;
    private String DeliveryAgentName;
    private Commodity commodity;
    private ShippingOrder shippingOrder;

    public ShippingOrder getShippingOrder() {
        return shippingOrder;
    }

    public void setShippingOrder(ShippingOrder shippingOrder) {
        this.shippingOrder = shippingOrder;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public String getDeliverymanName() {
        return deliverymanName;
    }

    public void setDeliverymanName(String deliverymanName) {
        this.deliverymanName = deliverymanName;
    }

    public String getDeliveryAgentName() {
        return DeliveryAgentName;
    }

    public void setDeliveryAgentName(String DeliveryAgentName) {
        this.DeliveryAgentName = DeliveryAgentName;
    }

    public Order() {
        super();
        this.orderItem = new HashMap<Item, Integer>();
    }

    public HashMap<Item, Integer> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(HashMap<Item, Integer> orderItem) {
        this.orderItem = orderItem;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public double calculatePrice() {
        double price = 0.0;
        for (Map.Entry<Item, Integer> entry : orderItem.entrySet()) {
            price += entry.getKey().getUnitPrice() * entry.getValue();

        }

        return ((int) price * 100) / 100.0;
    }
}
