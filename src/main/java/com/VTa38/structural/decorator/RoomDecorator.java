package com.VTa38.structural.decorator;

public abstract class RoomDecorator {
    protected Room room;
    public RoomDecorator(Room room){
        this.room = room;
    }

    public void beautify (){
        room.beatify();
    }
}
