package com.wz.entity;

public class Book {
    private long bookID;

    private String name;

    private int number;

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
