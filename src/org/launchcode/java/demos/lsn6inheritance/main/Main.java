package org.launchcode.java.demos.lsn6inheritance.main;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());
        System.out.println(((HouseCat) suki).isSatisfied());
    }
}
