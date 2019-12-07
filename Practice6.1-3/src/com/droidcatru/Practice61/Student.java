package com.droidcatru.Practice61;

public class Student {
    private String name;
    private long id;
    private double gpa;

    Student() {
        this.name = "unknown";
        this.id = -1;
        this.gpa = -1.0;
    }

    Student(String Name, long Id, double Gpa) {
        this.name = Name;
        this.id = Id;
        this.gpa = Gpa;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return "Student's name: " + this.name + " id: " + this.id + " gpa: " + this.gpa;
    }
}
