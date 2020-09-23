package ru.mirea.pr2;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String newTitle, String newAuthor, int newPages){
        title = newTitle;
        author = newAuthor;
        pages = newPages;
    }

    public String toString() {
        return ("Book:\n" +
                "Title = " + title + "\nAuthor = " + author + "\nPages = " + pages);
    }
}

