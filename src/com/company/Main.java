package com.company;

public class Main {

    public static void main(String[] args) {
        House h = new House();
        h.squarefoot = 2000.5;
        h.acre = 2.2;
        h.year = 1990;
        h.color = "green";
        h.stucko = true;

        System.out.println(h.ageOfProperty());


        Bug b = new Bug();
        b.legs = 8;
        b.color = "black";
        b.deadly = true;
        b.age = 24;
        b.type = "spider";

        System.out.println(b.ageOfBug());


        SocialMedia s = new SocialMedia();
        s.characters = 100;
        s.font = "red";
        s.pictures = 10;
        s.style = "bold";
        s.webpage = false;

        System.out.println(s.isWebpage());


        Movie m = new Movie();
        m.year = 2005;
        m.comedy = true;
        m.scary = false;
        m.minutes = 160;
        m.color = "black and white";

        System.out.println(m.movieLength());

        Music k = new Music();
        k.country = false;
        k.rap = true;
        k.time = 4;
        k.year = 2009;
        k.rock = false;

        System.out.println(k.isCountry());
        System.out.format("Is Country Bad Music");
    }

}



