package com.VTa38.creational.builder;

public class MakeWildfowl extends Builder{
    public MakeWildfowl(){
        creature = new Creature();
    }

    @Override
    public Creature buildCreature() {
        creature.createHeart();
        creature.createBrain();
        creature.createClaws();
        Herbivores herbivores = new Herbivores();
        creature.createBehaviour(herbivores);
        return creature;
    }
}