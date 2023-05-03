package com.sparta.mua;

public class Main {

    public static void main(String[] args) {

        Fighter mario = new Fighter("Mario","Brawler","It's a me, Mario!");
        Fighter link = new Fighter("Link","Sword","Hya!");

        Support jigglypuff = new Support("Jigglypuff","Shooter","Gulp!", 10);

        link.speak();

        mario.speak();
        mario.jump();


        jigglypuff.speak();
    }
}
