package com.xn.moshi.jianzao_gongchang;

/**
 * 建造者
 */
public abstract class Builder {
    protected CarEntity carEntity = new CarEntity();

    public void setColor(String color) {
        this.carEntity.setColor(color);
    }

    public void setMotor(String motor) {
        this.carEntity.setMotor(motor);
    }

    public void setType(String type) {
        this.carEntity.setType(type);
    }

    public abstract CarEntity getCarEntity();
}
