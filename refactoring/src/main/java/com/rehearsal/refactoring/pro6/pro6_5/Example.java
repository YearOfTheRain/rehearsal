package com.rehearsal.refactoring.pro6.pro6_5;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Introduce Explaining Variable（引入解释性变量）
 * @date 2019-08-19 12:22
 */
public class Example {
    private int quantity;
    private int itemPrice;

    double price() {
        // price is base price - quantity discount + shipping
        return quantity * itemPrice -
                Math.max(0, quantity - 500) * itemPrice * 0.05 +
                Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}

/*--------------------------after----------------------------------------*/
class ExampleNew {
    private int quantity;
    private int itemPrice;

    double price() {
        // price is base price - quantity discount + shipping
        final double basePrice = quantity * itemPrice;
        final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
        final double shipping = Math.min(quantity * itemPrice * 0.1, 100.0);
        return basePrice - quantityDiscount + shipping;
    }

    double price2() {
        // price is base price - quantity discount + shipping
        return basePrice() - quantityDiscount() - shipping();
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

    private double quantityDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
