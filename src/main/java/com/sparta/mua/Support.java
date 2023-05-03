package com.sparta.mua;

// INHERITANCE
public class Support extends Character {

    private int timeLimit; // ENCAPSULATION

    public int getTimeLimit() {
        return timeLimit;
    }

    public Support(String name, String style, String catchphrase, int time) {
        super(name, style, catchphrase);
        timeLimit = time;
    }


    // POLYMORPHISM
    public void speak() {
        System.out.println(getName() + " just joined for " + timeLimit + " seconds!");
    }
}
