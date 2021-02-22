package com.dateclass;/* (Date Class) Create a class called Date that includes three instance variables—a month (type
int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct. Provide a set and a get method for each
instance variable. Provide a method displayDate that displays the month, day and year separated
by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities.*/

import java.util.Scanner;

public class DateClass {
    private int day;
    private int month;
    private int year;

    public DateClass(int month, int day, int year) {
            this.day = day;
            this.month = month;
            this.year = year;

    }


    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }
    public int getMonth() {
        return month;
    }

    public void setDay(int day) {

        //Months with 31 days from January to August.
        if ((month > 0 && month < 8) && (month % 2 == 1) && (day > 0 && day < 32)) {
            this.day = day;
        }

        //Months with 31 days from September to December.
        if ((month > 7 && month < 13) && (month % 2 == 0) && (day > 0 && day < 32)) {
            this.day = day;
        }

        //Months with 30 days from January to August.
        if ((month > 0 && month < 8) && (month % 2 == 0) && (day > 0 && day < 31)) {
            this.day = day;
        }

        //Months with 30 days from September to December.
        if ((month > 7 && month < 13) && (month % 2 == 1) && (day > 0 && day < 31)) {
            this.day = day;
        }
        //Months with 28 days from January to March.
        if (month == 2 && day >= 1 && day <= 28) {
            this.day = day;
        }
        //Months with 29 days from January to March.
        if (isLeapYear(year) && (month == 2) && (day > 0 && day < 30)) {
            this.day = day;
        }
    }

    public int getDay() {
        return day;
    }


    public void setYear(int year) {
        if (year > 0 && year <= 2050) {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear(int leapYear) {
        if (leapYear > 0 && leapYear <= 2050){
            if ((leapYear % 4 == 0) || (leapYear % 400 == 0) && (leapYear % 100 != 0)) {
                return true;
            }
         }
        return false;
    }

    public static void main(String[] args) {
        DateClass dateClass = new DateClass(22, 2, 2021);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Month:");
        int month = input.nextInt();
        dateClass.setMonth(month);

        System.out.println("Enter the Day");
        int day = input.nextInt();
        dateClass.setDay(day);

        System.out.println("Enter the Year");
        int year = input.nextInt();
        dateClass.setDay(year);


    }
}






