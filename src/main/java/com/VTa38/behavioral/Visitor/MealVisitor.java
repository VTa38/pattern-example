package com.VTa38.behavioral.Visitor;

public class MealVisitor implements Visitor{
    @Override
    public void visit(Bread bread) {
        System.out.println("This is bread");
    }

    @Override
    public void visit(Cake cake) {
        System.out.println("This is cake");
    }

    @Override
    public void visit(Meat meat) {
        System.out.println("This is meat");
    }
}
