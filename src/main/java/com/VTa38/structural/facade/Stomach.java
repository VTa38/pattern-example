package com.VTa38.structural.facade;

public class Stomach implements Body{
    @Override
    public void getSignal() {
        System.out.println("Brrrr...");
    }

    @Override
    public void react() {
        System.out.println("Now I digestion meal");
    }
}
