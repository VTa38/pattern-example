package com.VTa38.creational.factory;

public class Factory {
    public Pet createPet (String name){
        Pet pet = null;
        if (name.equals("Cat")){
            pet = new Cat();
        }
        if (name.equals("Dog")){
            pet = new Dog();
        }
        if (name.equals("Lion")){
            pet = new Lion();
        }
        return pet;
    }
}
