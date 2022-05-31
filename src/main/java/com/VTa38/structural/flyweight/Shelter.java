package com.VTa38.structural.flyweight;

public class Shelter {
    private Animal[] allAnimals;

    public Shelter(int max){
        this.allAnimals = new Animal[max];
    }

    public Animal getPet(int number){
        if (allAnimals[number] == null){
            allAnimals[number] = new Animal(number);
        }
        return allAnimals[number];
    }
} // По идее это простое кэширование