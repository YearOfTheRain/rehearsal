package com.rehearsal.refactoring.pro1.pro1_1new;

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
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = this.rentals.elements();
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></ H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += each.getMovie().getTitle()+ ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
        //add footer lines
        result +=  "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
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
        System.out.println(customer.htmlStatement());
    }
}
