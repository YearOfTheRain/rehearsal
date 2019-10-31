package com.rehearsal.refactoring.pro1.pro1_1old;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Movie
 * @date 2019-08-17 16:11
 **/
public class Movie {

    public static final int CHIRDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
