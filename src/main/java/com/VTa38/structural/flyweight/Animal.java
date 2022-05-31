package com.VTa38.structural.flyweight;

public class Animal {
    private int localNumber;
    private String name;

    public Animal(int number){
        this.localNumber = number;
        this.name = "Unnamed";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
