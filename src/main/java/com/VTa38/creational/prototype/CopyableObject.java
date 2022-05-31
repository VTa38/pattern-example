package com.VTa38.creational.prototype;

public class CopyableObject implements Copyable{
    private String isMeRealConst = "who am i ???";

    public  CopyableObject(){
        this.isMeRealConst = "I am real";
    }

    public CopyableObject(boolean b){
        if (b){
            this.isMeRealConst = "I am real !";
        } else
            this.isMeRealConst = "I am copy ?!! Noooo!!!";
    }

    @Override
    public CopyableObject copy() {
        CopyableObject newMe = new CopyableObject(false);
        return newMe;
    }
}
