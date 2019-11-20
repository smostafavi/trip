package com.company;

public class Main {

    public static void main(String[] args) {
Closet closet = new Closet();
        System.out.println("I am ready to go on a trip");



        closet.addJacket(); //add the jacket to the main class
        System.out.println((closet.getJacket()));// get me a Jacket

        closet.addShirt(); // add the Shirt class to the main class
        System.out.println((closet.getShirt()));// get ma a shirt


        closet.addPants(); //add pants to the main class
        System.out.println(closet.getPants());  //get ma a pants

        closet.addFootware(); //add the footware to the main class
        System.out.println(closet.getFootware()); // get me a footware
    }
}
