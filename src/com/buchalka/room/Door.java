package com.buchalka.room;
import java.util.*;
public class Door {
    private ArrayList dimensions;
    private int nbrs;

    public Door(){}

    public Door(ArrayList dimensions, int nbrs) {
        this.dimensions = dimensions;
        this.nbrs = nbrs;
    }

    public ArrayList getDimensions() {
        return dimensions;
    }

    public int getNbrs() {
        return nbrs;
    }
}
