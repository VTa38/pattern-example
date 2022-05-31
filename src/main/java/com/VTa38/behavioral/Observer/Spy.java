package com.VTa38.behavioral.Observer;

public class Spy implements Observe{
    @Override
    public void event(String troops) {
        System.out.println("Hmm, enemies have" + troops);
    }
}
