package com.xn.moshi.jianzao_gongchang;

/**
 * 具体产品
 */
public class CarEntity {
    private String color;
    private String motor;
    private String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "color='" + color + '\'' +
                ", motor='" + motor + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
