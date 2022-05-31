package com.VTa38.behavioral.Observer;

public class EnemyForces {
    private String commander;
    private int minerals;
    private Observe observe;

    public EnemyForces(String commander){
        this.commander = commander;
        minerals = 10000;
        observe = new Spy();
    }

    public void trainMarine(){
        if (minerals>=50){
            minerals -=50;
            System.out.println("Готов к бою");
            observe.event("Marine");
        }
    }

    public void trainMarauder(){
        if (minerals>=100){
            minerals -=100;
            System.out.println("Готов к бою");
            observe.event("Marine");
        }
    }
}