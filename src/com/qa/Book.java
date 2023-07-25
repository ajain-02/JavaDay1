package com.qa;
import java.util.Arrays;

public class Book{
    String name;
    String [] authors;
    int price;

    public Book(String name, String[] authors, int price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    private int getPrice() {
        return this.price;
    }

    private String getName() {
        return this.name;
    }

    private String[] getAuthors() {
        return this.authors;
    }

    private void setAuthors(String[] authors) {
        this.authors = authors;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", authors=" +
                Arrays.toString(authors) + ", price=" + price + "]";
    }
}
