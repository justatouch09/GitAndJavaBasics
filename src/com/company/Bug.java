package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class Bug {
    int legs;
    String color;
    String type;
    int age;
    boolean deadly;

    //public double ageOfBug() {
      //  return (48 - 24);
    //}

    public void setType(String type) {
        if (this.type.contains("s"))
            System.out.println("Special font");
        this.type = type; }


    public void setLegs(int legs) {
        this.legs = legs;

    }
}
