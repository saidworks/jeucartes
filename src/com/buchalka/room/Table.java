package com.buchalka.room;

import java.util.ArrayList;

public class Table extends Door {
    public Table(int[] dimensions, int nbrs) {
        super(dimensions, nbrs);
    }

    public void put() {
        System.out.println("Meals are on the table");
    }
}
