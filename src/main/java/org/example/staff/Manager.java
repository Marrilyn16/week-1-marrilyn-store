package org.example.staff;

public class Manager extends Staff {

    Manager(String name, int age, String role, String contact) {
        super(name, age, role, contact);
    }
    static void hireACashier() {
        Applicants.declareApplicants();
        for (Applicants app: Applicants.getApplicantsList()) {
            if (app.getGender().equals("Female")) {
                System.out.println("The manager has hired: " + app.getName());
//                System.out.println("The details of the hired cashier are as follows: ");
//                System.out.println("Name: " + app.getName());
//                System.out.println("Age: " + app.getAge());
//                System.out.println("Qualification: " + app.getQualification());
//                System.out.println("Gender: " + app.getGender());
            }
        }
    }


    static void fireACashier() {
        Cashier.declareCashier();
        for (Cashier cash: Cashier.getCashierList()) {
            if (cash.getPerformanceRating() <= 3.0) {
                System.out.println("The manager has fired: " + cash.getName());
                System.out.println("The details of the fired cashier are as follows: ");
                System.out.println("Name: " + cash.getName());
                System.out.println("Age: " + cash.getAge());
                System.out.println("Performance Ratio: " + cash.getPerformanceRating());
            }
        }
    }
}
