package com.qa;

public class TestBooks{
    public static void main(String[] args) {
        String [] arrayOfBooks = {"Aryan", "Tom", "Andy"};
        Book book1 = new Book("title1", arrayOfBooks, 20);
        Book book2 = new Book("title2", arrayOfBooks, 30);
        Book book3 = new Book("title3", arrayOfBooks, 40);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Book[] bookArray = new Book[3];

        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        for (int x = 0; x < bookArray.length; x++){
            System.out.println(bookArray[x]);
        }
    }
}
