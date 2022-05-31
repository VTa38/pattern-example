package com.VTa38.behavioral.State;

public class MoveSomewhere implements State{
    private State state;

    public MoveSomewhere(State state) {
        this.state = state;
    }

    @Override
    public void move() {
        this.state.move();
    }
}
