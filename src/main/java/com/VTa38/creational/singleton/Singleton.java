package com.VTa38.creational.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton() {
    }

    public Singleton getInstance(){
        if (singleton == null){
            this.singleton = new Singleton();
        }
        return  singleton;
    }
    //дальейшая реализация класса
}
