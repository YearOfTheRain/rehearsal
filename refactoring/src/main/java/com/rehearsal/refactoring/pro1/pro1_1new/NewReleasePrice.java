package com.rehearsal.refactoring.pro1.pro1_1new;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description NewReleasePrice
 * @date 2019-08-17 18:35
 */
public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
