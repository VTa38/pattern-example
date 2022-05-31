package com.VTa38.creational.builder;

public class MakeHunter extends Builder{
    public MakeHunter(){
        creature = new Creature();
    }

    @Override
    public Creature buildCreature() {
        creature.createHeart();
        creature.createBrain();
        creature.createClaws();
        Behaviour hunter = new Hunter();
        creature.createBehaviour(hunter);
        return creature;
    }
}
