package com.VTa38.behavioral.Memento;

public class SocialNetworkPerson {
    private String name;
    private int age;

    public SocialNetworkPerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("New user %s with age %s.", name, age);
    }

    public Person createAccount (){
        System.out.println(name + " now registered.");
        return new Person(name, age);
    }

    public void getInfo(Person person){
        System.out.printf("Name: %s, age: %s.", person.getName(), person.getAge());
    }
}
