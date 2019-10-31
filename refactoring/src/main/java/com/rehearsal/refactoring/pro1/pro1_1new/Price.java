package com.rehearsal.refactoring.pro1.pro1_1new;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description price
 * @date 2019-08-17 18:33
 **/
public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
