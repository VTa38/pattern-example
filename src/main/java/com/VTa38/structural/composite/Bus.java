package com.VTa38.structural.composite;

public class Bus implements Transport{
    @Override
    public void moved(String number) {
        System.out.printf("Ride on bus %s", number);
    }
}
