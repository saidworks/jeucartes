package com.buchalka.room;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Door doors = new Door(new int[]{1200, 1300,20},4);
        Table tables = new Table(new int[]{500,1300,20},3);
        Window windows = new Window(new int[]{500,1000,400},2);
        Chair chairs = new Chair(new int[]{500,500,400},3,"Wood");

        Room myRoom = new Room(tables,doors,windows,chairs);
        myRoom.roomActions();
    }
}
