package com.VTa38.behavioral.ChainOfResponsibility;

public interface Check {
    void nextPay(Check check);
    void Pay(int m) throws Exception;
    int getMoney();
    void setMoney(int m);
} // Условно говоря, позволяет из одного объекта совершить работу в нескольких объектах