package com.rehearsal.refactoring.pro1.pro1_1new;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 租赁
 * @date 2019-08-17 16:18
 **/
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
