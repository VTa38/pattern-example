package com.VTa38.structural.proxy;

public class MainBarrack implements Barrack{

    private String purpose;

    public MainBarrack (String purpose){
        this.purpose = purpose;
        TrainMarine();
    }

    @Override
    public void TrainMarine() {
        System.out.println("Train new marine. Задавим их интеллектом!!");
    }

    public void EndOfTraining(){
        System.out.println("New marine is ready. Кто на новенького?");
        System.out.println("Я готов " + purpose);
    }
}
