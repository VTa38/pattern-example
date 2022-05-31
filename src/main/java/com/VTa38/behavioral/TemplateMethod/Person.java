package com.VTa38.behavioral.TemplateMethod;

public class Person extends Brain{
    @Override
    void think() {
        System.out.println("I need to think. I will do something");
    }

    @Override
    void makeSignalToReact() {
        System.out.println("I am not really know what to do, but i've made something");
    }
}
