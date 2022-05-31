package com.VTa38.structural.facade;

public class Brain implements Body{
    @Override
    public void getSignal() {
        System.out.println("Let's thinking, what i need to do...");
    }

    @Override
    public void react() {
        System.out.println("Ok, let's eat");
    }
}
