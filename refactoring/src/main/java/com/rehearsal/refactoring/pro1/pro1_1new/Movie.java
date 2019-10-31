package com.rehearsal.refactoring.pro1.pro1_1new;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Movie
 * @date 2019-08-17 16:11
 **/
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
       return price.getFrequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                this.price = new RegularPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
            case CHILDRENS:
                this.price = new ChildrensPrice();
                break;
            default:
                this.price = new ChildrensPrice();
                break;
        }
    }
}
