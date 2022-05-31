package com.VTa38.behavioral.Strategy;

public class ContextAction {
    private Strategy strategy;

    public ContextAction(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doAction(){
        strategy.someAction();
    }
}
