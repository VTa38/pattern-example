package com.VTa38.behavioral.Command;

public class TrainingArmy implements Command{
    Army army;

    public TrainingArmy(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.trainingTroops();
    }
}
