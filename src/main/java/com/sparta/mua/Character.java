package com.sparta.mua;

// ABSTRACT
public abstract class Character {

    // ENCAPSULATION
    private String name;
    private String type;
    private String catchphrase;

    public Character(String name, String type, String catchphrase) {
        this.name = name;
        this.type = type;
        this.catchphrase = catchphrase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    public void speak() {
        System.out.println(name + " is here! a " + type + " type" + ", " + catchphrase);
    }
}
