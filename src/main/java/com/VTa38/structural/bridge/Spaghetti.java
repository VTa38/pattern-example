package com.VTa38.structural.bridge;

public class Spaghetti extends Dish{
    public Spaghetti(Spices spices){
        super(spices);
    }

    @Override
    void setSpices() {
        System.out.println("Let's season with spices our spaghetti");
        spices.setSpices();
    }
}
