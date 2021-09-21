/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Order;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public int countCompletedOrder() {
        int count = 0;
        for (int i = 0; i < workRequestList.size(); i++) {
            if (workRequestList.get(i) instanceof Order && workRequestList.get(i).getStatus() == Status.Received) {
                count++;

            }

        }
        return count;

    }
    public int countOrder() {
        int count = 0;
        for (int i = 0; i < workRequestList.size(); i++) {
            if (workRequestList.get(i) instanceof Order) {
                count++;

            }

        }
        return count;

    }
     public int countCommodity() {
        int count = 0;
        for (int i = 0; i < workRequestList.size(); i++) {
            if (workRequestList.get(i) instanceof Commodity) {
                count++;

            }

        }
        return count;

    }

    public double calculateTotalPurchased() {
        double money = 0;
        for (int i = 0; i < workRequestList.size(); i++) {
            if (workRequestList.get(i) instanceof Order && workRequestList.get(i).getStatus() == Status.Received) {
                Order o = (Order) workRequestList.get(i);
                money += o.calculatePrice();
            }

        }
        return money;

    }
}
