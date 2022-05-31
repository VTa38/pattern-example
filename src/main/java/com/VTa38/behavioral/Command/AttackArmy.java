package com.VTa38.behavioral.Command;

public class AttackArmy  implements Command {
    Army army;

    public AttackArmy(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.attack();
    }
}
