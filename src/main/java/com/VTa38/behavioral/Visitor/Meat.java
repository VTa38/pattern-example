package com.VTa38.behavioral.Visitor;

public class Meat implements Meal{
    @Override
    public void accept(Visitor vis) {
        vis.visit(this);
    }
}
