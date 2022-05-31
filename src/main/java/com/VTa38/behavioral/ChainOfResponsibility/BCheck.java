package com.VTa38.behavioral.ChainOfResponsibility;

public class BCheck implements Check{
    private int money;
    private Check check;

    public BCheck(int money) {
        this.money = money;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void nextPay(Check check) {
        this.check = check;
    }

    @Override
    public void Pay(int m) throws Exception {
        int actualMoney = check.getMoney();
        if(actualMoney > m){
            check.setMoney(actualMoney - m);
        } else {
            throw new Exception("You have not enough money");
        }
    }
}
