package com.rehearsal.refactoring.pro6.pro6_1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Extract Method（提炼函数）
 * @date 2019-08-19 11:12
 */
public class Order {

    String name;
    Double amount;

    Vector<Order> order = new Vector();

    void printOwing() {
        Enumeration e = order.elements();
        double outstanding = 0.0;
        // print banner
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }
        //print details
        System.out.println ("name:" + name);
        System.out.println ("amount" + outstanding);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

/*-----------------------------after---------------------------------------*/
class OrderNew {

    String name;
    Double amount;
    Vector<Order> order = new Vector();

    void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);

    }

    private void printBanner() {
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
    }

    private void printDetails(double outstanding) {
        System.out.println ("name:" + name);
        System.out.println ("amount" + outstanding);
    }

    private double getOutstanding() {
        Enumeration e = order.elements();
        double result = 0.0;
        while (e.hasMoreElements()) {
            OrderNew each = (OrderNew) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
