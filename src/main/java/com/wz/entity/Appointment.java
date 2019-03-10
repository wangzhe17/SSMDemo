package com.wz.entity;

import java.util.Date;

public class Appointment {
    private long bookID;

    private long studentID;

    private Date appointTime;

    private Book book;

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "bookID=" + bookID +
                ", studentID=" + studentID +
                ", appointTime=" + appointTime +
                ", book=" + book +
                '}';
    }
}
