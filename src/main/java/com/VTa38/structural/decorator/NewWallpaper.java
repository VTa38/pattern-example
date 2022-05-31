package com.VTa38.structural.decorator;

public class NewWallpaper extends RoomDecorator{
    public NewWallpaper(Room room) {
        super(room);
    }

    @Override
    public void beautify() {
        room.beatify();
        setNewWallpaper();
    }

    private void setNewWallpaper(){
        System.out.println(" now have new wallpaper)");
    }
}
