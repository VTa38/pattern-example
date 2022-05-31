package com.VTa38.creational.builder;

public class Creature {
    public void createHeart(){message("Make new heart"); }
    public void createBrain(){
        message("Make new clean brain");
    }
    public void createClaws(){
        message("Make new scared claws!!!");
    }
    public void createBehaviour(Behaviour behaviour){
        message("Hello, i am new " + behaviour.create());
    }
    private void message (String mes){
        System.out.println(mes);
    }
}
