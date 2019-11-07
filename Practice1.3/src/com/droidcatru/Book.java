package com.droidcatru;

public class Book {
    public int PagesCount;
    public String Name;
    public String Author;
    public int PublicationYear;

    public Book() {}

    public Book(String name, String author, int publicationYear, int pagesCount) {
        this.PagesCount = pagesCount;
        this.Name = name;
        this.Author = author;
        this.PublicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return this.Name + " was written in " + this.PublicationYear + " by " + this.Author + " and has " + this.PagesCount + " pages";
    }
}
