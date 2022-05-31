package com.VTa38.structural.decorator;

public class WarmFloor extends RoomDecorator{
    public WarmFloor(Room room) {
        super(room);
    }

    @Override
    public void beautify() {
        room.beatify();
        setWarmFloor();
    }

    private void setWarmFloor(){
        System.out.println(" now have warm floor!");
    }
}
