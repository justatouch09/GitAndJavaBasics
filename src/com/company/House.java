package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class House {
    double acre;
    double squarefoot;
    int year;
    String color;
    boolean stucko;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.contains ("green")) {
            System.out.println("This color is correct!");
            this.color = color;

        }

    }

    //public double ageOfProperty(String year) {
     //   return (2017 - year);
    //


    public void setYear(int year) {
        this.year = year;
    }
    //public void setAcre


}

