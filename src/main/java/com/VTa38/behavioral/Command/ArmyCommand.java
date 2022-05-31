package com.VTa38.behavioral.Command;

public class ArmyCommand {
    Command command;

    public ArmyCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
