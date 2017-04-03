package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class Movie {
    int year;
    boolean scary;
    boolean comedy;
    int minutes;
    String color;

    //public double movieLength() {
     //   return ( 320 - minutes);

    public void setMinutes(int minutes) {
        if (this.minutes < 160); {
            System.out.println("That is right");
        }
        this.minutes = minutes;

    }
    public void setYear(int year) {
        this.year = year;

    }

    }


