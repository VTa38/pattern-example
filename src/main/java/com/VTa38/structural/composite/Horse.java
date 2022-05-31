package com.VTa38.structural.composite;

public class Horse implements Transport{

    @Override
    public void moved(String name) {
        System.out.printf("Ride on horse named: %s !!! Are you understand me?", name);
    }
}
