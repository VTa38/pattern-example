package com.VTa38.creational.abstract_factory;

public class JunkMealFactory implements MealFactory{
    @Override
    public Breakfast getBreakfast() {
        return new JunkBreakfast();
    }

    @Override
    public Dinner getDinner() {
        return new JunkDinner();
    }
}
