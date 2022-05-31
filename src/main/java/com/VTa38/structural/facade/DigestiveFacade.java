package com.VTa38.structural.facade;

public class DigestiveFacade {
    private Brain brain;
    private Stomach stomach;

    public DigestiveFacade(){
        brain = new Brain();
        stomach = new Stomach();
    }

    public void beHungry(){
        stomach.getSignal();
        brain.getSignal();
    }
    public void eatMeal(){
        brain.react();
        stomach.react();
    }
}
