package com.VTa38.creational.builder;

public class Build {
    private Builder builder;
    static {
        System.out.println("Is it will be hunter?");
    }

    public Build(boolean b){
        if (b){
            builder = new MakeHunter();
        } else {
            builder = new MakeWildfowl();
        }
    }

    public Creature createCreature(){
        return builder.buildCreature();
    }
}
