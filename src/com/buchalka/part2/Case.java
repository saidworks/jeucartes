package com.buchalka.part2;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSuplly;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSuplly, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuplly = powerSuplly;
        this.dimensions = dimensions;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSuplly() {
        return powerSuplly;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
