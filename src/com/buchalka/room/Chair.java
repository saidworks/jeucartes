package com.buchalka.room;

import java.util.ArrayList;

public class Chair extends Door{
    private String material;

    public Chair() {
    }

    public Chair(ArrayList dimensions, int nbrs, String material) {
        super(dimensions, nbrs);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
