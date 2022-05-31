package com.VTa38.creational.abstract_factory;

public class HealthyMealFactory implements MealFactory {
    @Override
    public Breakfast getBreakfast() {
        return new HealthyBreakfast();
    }

    @Override
    public Dinner getDinner() {
        return new HealthyDinner();
    }
}
