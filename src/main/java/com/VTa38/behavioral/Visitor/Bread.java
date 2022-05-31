package com.VTa38.behavioral.Visitor;

public class Bread implements Meal{
    @Override
    public void accept(Visitor vis) {
        vis.visit(this);
    }
}
