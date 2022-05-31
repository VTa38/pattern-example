package com.VTa38.structural.bridge;

public class Rice extends Dish{
    public Rice(Spices spices){
        super(spices);
    }

    @Override
    void setSpices() {
        System.out.println("Let's season with spices our rice");
        spices.setSpices();
    }
}
