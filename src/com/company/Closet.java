package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Closet {



    private ArrayList<Jacket> jacketArray = new ArrayList<>();
    private ArrayList<Shirt> shirtArray = new ArrayList<>();
    private ArrayList<Pants> pantsArray = new ArrayList<>();
    private ArrayList<Footware> footwareArray = new ArrayList<>();

    public Closet() {
    }

    public void addJacket() {
        Jacket jacket1 = new Jacket("A", "B", "C", "D"); //creating instances of jacket
        Jacket jacket2 = new Jacket("E", "F", "G", "H"); //creating instances of jacket
        Jacket jacket3 = new Jacket("L", "M", "N", "O"); //creating instances of jacket
        Jacket jacket4 = new Jacket("P", "Q", "R", "S"); //creating instances of jacket
        Jacket jacket5 = new Jacket("L", "Z", "W", "Y"); //creating instances of jacket

        jacketArray.add(jacket1);
        jacketArray.add(jacket2);
        jacketArray.add(jacket3);
        jacketArray.add(jacket4);
        jacketArray.add(jacket5);
    }

    // creating instance of Shirt
    public void addShirt(){
        Shirt shirt1 = new Shirt("a", "b", "c", "d","u");
        Shirt shirt2 = new Shirt("e", "f", "g", "H","p");
        Shirt shirt3 = new Shirt("l", "m", "n", "o","o");
        Shirt shirt4 = new Shirt("p", "q", "s", "t","y");
        Shirt shirt5 = new Shirt("j", "w", "x", "z","x");

        shirtArray.add(shirt1);
        shirtArray.add(shirt2);
        shirtArray.add(shirt3);
        shirtArray.add(shirt4);
        shirtArray.add(shirt5);
    }

    // creating instance of Pants
    public void addPants() {
        Pants pants1 = new Pants("AB", "BA", "CD", "DC");
        Pants pants2 = new Pants("EF", "FE", "GH", "HG");
        Pants pants3 = new Pants("MN", "NM", "JK", "KJ");
        Pants pants4 = new Pants("xy", "yx", "ky", "ky");
        Pants pants5 = new Pants("ur", "do", "of", "oh");

        pantsArray.add(pants1);
        pantsArray.add(pants2);
        pantsArray.add(pants3);
        pantsArray.add(pants4);
        pantsArray.add(pants5);
    }

    public void addFootware() {
        // creating instance of Footware
        Footware footware1 = new Footware("oi", "gk", "bg", "vf");
        Footware footware2 = new Footware("lk", "RE", "VC", "jh");
        Footware footware3 = new Footware("fd", "cx", "zx", "bg");
        Footware footware4 = new Footware("bv", "zs", "wq", "er");
        Footware footware5 = new Footware("tc", "li", "uy", "ew");

        footwareArray.add(footware1);
        footwareArray.add(footware2);
        footwareArray.add(footware3);
        footwareArray.add(footware4);
        footwareArray.add(footware5);
    }




    //getting shirts
    public String getJacket() {
        int x = 0;
        Random r = new Random();
        x = r.nextInt(5);
        return jacketArray.get(x).toString();

    }

    public String getShirt(){
        int x = 0;

        Random r = new Random();
        x = r.nextInt(5);
        return shirtArray.get(x).toString();


    }

    public String getPants() {
        int x = 0;

        Random r = new Random();
        x = r.nextInt(5);
        return pantsArray.get(x).toString();


    }

    public String getFootware() {
        int x = 0;

        Random r = new Random();
        x = r.nextInt(5);
        return footwareArray.get(x).toString();
    }
}