package com.VTa38.behavioral.Command;

public class DefenseArmy implements Command{
    Army army;

    public DefenseArmy(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.defense();
    }
}
