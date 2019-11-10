package com.droidcatru;

public class Main {

    public static void main(String[] args) {
        Author Dave = new Author("Dave", "daveTheBest@gmail.com", 'm');
        System.out.println(Dave.getName());
        System.out.println(Dave.Email);
        System.out.println(Dave.getGender());
        System.out.println(Dave);
    }
}
