package com.VTa38.structural.proxy;

public class ProxyBarrack implements Barrack{
    private String purpose;
    private MainBarrack mainBarrack;

    public ProxyBarrack(String purpose){
        this.purpose = purpose;
    }


    @Override
    public void TrainMarine() {
        // Дополнительная логика
        if (mainBarrack == null) {
            mainBarrack = new MainBarrack(purpose);
        }
        mainBarrack.EndOfTraining();
    }
}
