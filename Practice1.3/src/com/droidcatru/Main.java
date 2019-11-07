package com.droidcatru;

public class Main {

    public static void main(String[] args) {
        Book myFavoriteBook = new Book();
        myFavoriteBook.Name = "The circle";
        myFavoriteBook.Author = "Dave Eggers";
        myFavoriteBook.PublicationYear = 2013;
        myFavoriteBook.PagesCount = 361;

        System.out.println(myFavoriteBook);

        Book theBestBookAboutSteveJobs = new Book("Steve Jobs", "Walter Isaacson", 2011, 700);
        System.out.println(theBestBookAboutSteveJobs);
    }
}
