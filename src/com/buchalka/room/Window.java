package com.buchalka.room;

import java.util.ArrayList;

public class Window extends Door {
    public Window(){}
    public Window(int[] dimensions, int nbrs) {
        super(dimensions, nbrs);
    }

    public void open(){
        System.out.println("Windows has been opened");
    }
}
