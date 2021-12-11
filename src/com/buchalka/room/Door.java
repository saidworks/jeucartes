package com.buchalka.room;
import java.util.*;
public class Door {
    private int[] dimensions;
    private int nbrs;

    public Door(){}

    public Door(int[] dimensions, int nbrs) {
        this.dimensions = dimensions;
        this.nbrs = nbrs;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public int getNbrs() {
        return nbrs;
    }

    public void open(){
        System.out.println("open the door");
    }
}
