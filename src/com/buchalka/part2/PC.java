package com.buchalka.part2;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC() {
    }

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        motherboard.loadProgram("Ubuntu 20.04");
        drawLogo();
    }
    public void drawLogo(){
        monitor.drawPixelAt(1920,1740,"green");
    }

}
