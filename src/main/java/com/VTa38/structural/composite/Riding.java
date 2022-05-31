package com.VTa38.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Riding implements Transport{
    private List<Transport> transports = new ArrayList<Transport>();

    @Override
    public void moved(String something) {
        for (Transport transport: transports) {
            transport.moved(something);
        }
    }

    public void add (Transport transport){
        this.transports.add(transport);
    }

    public void clear (){
        this.transports.clear();
    }
}
