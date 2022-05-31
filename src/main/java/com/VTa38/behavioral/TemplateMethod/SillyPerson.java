package com.VTa38.behavioral.TemplateMethod;

public class SillyPerson extends Brain{
    @Override
    void think() {
        System.out.println("Agrr brr pftfgfb...");
    }

    @Override
    void makeSignalToReact() {
        System.out.println("Why i can't do this");
    }
}
