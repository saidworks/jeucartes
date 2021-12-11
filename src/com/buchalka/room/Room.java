package com.buchalka.room;

public class Room {
    private Table tables;
    private Door doors;
    private Window windows;
    private Chair chairs;

    public Room(Table tables, Door doors, Window windows, Chair chairs) {
        this.tables = tables;
        this.doors = doors;
        this.windows = windows;
        this.chairs = chairs;
    }
}
