package com.VTa38.behavioral.Mediator;

public class Mediator {
    public static void tellSomeone(Person person, String information){
        System.out.println(person.getName() + " want to tell you" + information);
    }
} // Мы передаём какие-либо банные через дополнительный слой (посредника)
