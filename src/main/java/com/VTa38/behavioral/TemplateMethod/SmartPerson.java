package com.VTa38.behavioral.TemplateMethod;

public class SmartPerson extends Brain{
    @Override
    void think() {
        System.out.println("Let's think alot... Now i am know what to do");
    }

    @Override
    void makeSignalToReact() {
        System.out.println("Do this");
    }
}
