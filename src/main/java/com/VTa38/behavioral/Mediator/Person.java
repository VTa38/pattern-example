package com.VTa38.behavioral.Mediator;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void tellSomeoneByMediator(String information){
        Mediator.tellSomeone(this, information);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
