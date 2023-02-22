package org.example.customers;

import org.example.products.Products;

public class Customers {
    private String name;
    private int age;
    private String gender;

    public Customers(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    static void buyProducts(String productName, int quantity) {
     //   Products.declareProducts(productList);
//        for (Products prod: Products.getProductList()) {
//
//        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
