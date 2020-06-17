package com.xn.shejimoshi.zuhe;

public class GasolineCar extends Car{
    private String color;

    public GasolineCar(Color color) {
        super(color);
        this.color =color.color();
    }

    @Override
    public void move() {
        System.out.println( color +"汽油汽车");
    }
}
