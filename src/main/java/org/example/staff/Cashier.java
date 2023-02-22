package org.example.staff;

import java.util.ArrayList;

public class Cashier extends Staff {
    private double performanceRating;

    private static ArrayList<Cashier> cashierList = new ArrayList<Cashier>();

    Cashier(String name, int age, String role, String contact) {
        super(name, age, role, contact);
    }

    Cashier(String name, int age, String role, String contact, double performanceRating) {
        super(name, age, role, contact);
        this.performanceRating = performanceRating;
    }

    static void declareCashier() {
        Cashier cashier1 = new Cashier("May", 25, "Cashier", "08161234", 4.2);
        cashierList.add(cashier1);
        Cashier cashier2 = new Cashier("Jane", 26, "Cashier", "0912345", 2.8);
        cashierList.add(cashier2);
    }


    public double getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(double performanceRating) {
        this.performanceRating = performanceRating;
    }


    public static ArrayList<Cashier> getCashierList() {
        return cashierList;
    }

    public static void setCashierList(ArrayList<Cashier> cashierList) {
        Cashier.cashierList = cashierList;
    }
}