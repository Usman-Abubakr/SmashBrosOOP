package com.sparta.mua;

// INHERITANCE
public class Fighter extends Character implements Playable {

    public Fighter(String name, String style, String catchphrase) {
        super(name, style, catchphrase);
    }

    // INTERFACE
    public void jump() {
        System.out.println("Fighters can only jump");
    }
}
