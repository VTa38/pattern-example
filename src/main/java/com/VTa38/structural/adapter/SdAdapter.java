package com.VTa38.structural.adapter;

public class SdAdapter extends SdMemory{
    private ComputerMemory computerMemory;

    public SdAdapter(ComputerMemory computerMemory){
        this.computerMemory = computerMemory;
    }

    public void seeInformationOnComputer (){
        System.out.println(computerMemory.getInformation());
    }
} // Может быть много реализаций при которых адаптер аппелирует методами 2х разных классов и позоляет работать с ними в связке
