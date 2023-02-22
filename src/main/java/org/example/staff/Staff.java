package org.example.staff;

public abstract class Staff {
    private  String name;
    private int age;
    private String role;
    private String contact;

     Staff(String name, int age, String role, String contact) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.contact = contact;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
