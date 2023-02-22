package org.example.staff;

import java.util.ArrayList;

public class Applicants {
    private String name;
    private int age;
    private String qualification;
    private String gender;
    private static ArrayList<Applicants> applicantsList = new ArrayList<Applicants>(2);

    Applicants(String name, int age, String qualification, String gender) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.gender = gender;
    }
    static void declareApplicants(){
        Applicants applicant1 = new Applicants("Marilyn", 24,"BSC","Female");
        applicantsList.add(applicant1);
        Applicants applicant2 = new Applicants("John",25,"BSC","Male");
        applicantsList.add(applicant2);
    }

    public static ArrayList<Applicants> getApplicantsList() {
        return applicantsList;
    }

    public static void setApplicantsList(ArrayList<Applicants> applicantsList) {
        Applicants.applicantsList = applicantsList;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Applicants{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
