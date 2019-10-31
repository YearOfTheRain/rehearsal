package com.rehearsal.refactoring.pro6.pro6_4;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Replace Temp with Query（以查询取代临时变量）
 * @date 2019-08-19 11:59
 */
public class Example {

    private int quantity;
    private int itemPrice;

    double getPrice() {
        int basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}

/*-----------------------------------after----------------------------------*/
class ExampleNew {

    private int quantity;
    private int itemPrice;

    double getPrice() {
        return basePrice() * discountFactor();
    }

    private int basePrice() {
        return quantity * itemPrice;
    }

    private double discountFactor() {
        return basePrice() > 1000 ? 0.95 : 0.98;
    }

}
