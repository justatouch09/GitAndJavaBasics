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

    public double movieLength() {
        return ( 320 - minutes);

    }
}

