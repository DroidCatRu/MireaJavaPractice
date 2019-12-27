package com.droidcatru.Practice12;

class Person {
    private String lastname;
    private String name;
    private String secondname;

    public Person() {
        this.lastname = "";
        this.name = "";
        this.secondname = "";
    }

    public Person(String lastname) {
        this.lastname = lastname;
        this.name = "";
        this.secondname = "";
    }

    public Person(String lastname, String name, String secondname) {
        this.lastname = lastname;
        this.name = name;
        this.secondname = secondname;
    }

    public String getFullName() {
        if (!this.lastname.isEmpty() && !this.name.isEmpty() && !this.secondname.isEmpty()) {
            return this.lastname + " " + this.name + " " + this.secondname;
        }
        else if (!this.lastname.isEmpty()) {
            return this.lastname;
        }
        else {
            return "Name is not set";
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Person David = new Person("Davidyan", "David", "Davidovich");
        Person Koshkin = new Person("Koshkin");
        Person person = new Person();
        System.out.println(David.getFullName());
        System.out.println(Koshkin.getFullName());
        System.out.println(person.getFullName());
    }
}
