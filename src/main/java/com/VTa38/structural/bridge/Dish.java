package com.VTa38.structural.bridge;

public abstract class Dish {
    protected Spices spices;

    public Dish(Spices spices){
        this.spices = spices;
    }

    abstract void setSpices();
}
