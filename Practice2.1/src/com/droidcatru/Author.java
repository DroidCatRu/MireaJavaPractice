package com.droidcatru;

public class Author {
    private String Name;
    public String Email;
    private char Gender;

    public Author(String name, String email, char gender) {
        this.Name = name;
        this.Email = email;
        this.Gender = gender;
    }

    public String getName() {
        return this.Name;
    }

    public String getGender() {
        if(this.Gender == 'm') {
            return "men";
        }
        else if(this.Gender == 'w') {
            return "women";
        }
        return "unknown";
    }

    @Override
    public String toString() {
        return this.Name + " (" + this.Email + ") is a " + getGender();
    }
}
