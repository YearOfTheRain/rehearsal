package com.rehearsal.refactoring.pro1.pro1_1old;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 顾客
 * @date 2019-08-17 16:21
 **/
public class Customer {

    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHIRDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3) {
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }
            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("奇幻世界1",0);
        Movie movie2 = new Movie("奇幻世界2",1);
        Movie movie3 = new Movie("奇幻世界3",1);
        Movie movie4 = new Movie("奇幻世界4",2);
        Movie movie5 = new Movie("奇幻世界5",2);

        Rental rental = new Rental(movie1,5);
        Rental rental2 = new Rental(movie2,3);
        Rental rental3 = new Rental(movie3,1);
        Rental rental4 = new Rental(movie4,2);
        Rental rental5 = new Rental(movie5,4);
        Customer customer = new Customer("汪达尔");
        customer.addRental(rental);
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);
        customer.addRental(rental5);
        System.out.println(customer.statement());
    }
}
