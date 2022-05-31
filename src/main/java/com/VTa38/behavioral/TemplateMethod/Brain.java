package com.VTa38.behavioral.TemplateMethod;

public abstract class Brain {
    abstract void think();
    abstract void makeSignalToReact();

    public final void react(){
        think();
        makeSignalToReact();
    } // У нас есть закреплённый алгоритм, но при этом мы можем по-разному реализовать некоторые шаги
}
