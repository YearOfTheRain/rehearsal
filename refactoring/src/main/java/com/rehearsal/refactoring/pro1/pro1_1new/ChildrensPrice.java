package com.rehearsal.refactoring.pro1.pro1_1new;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ChildrensPrice
 * @date 2019-08-17 18:34
 **/
public class ChildrensPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
