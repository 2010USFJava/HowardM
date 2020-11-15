package com.revature.racer;

public class Racer {
    private String name;
//    private String carType;
    private String specialItem;
    private int speed;
    private int acceleration;

    public Racer(String name, String specialItem, int speed, int acceleration) {
        this.name = name;
//        this.carType = carType;
        this.specialItem = specialItem;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getCarType() {
//        return carType;
//    }
//
//    public void setCarType(String carType) {
//        this.carType = carType;
//    }

    public String getSpecialItem() {
        return specialItem;
    }

    public void setSpecialItem(String specialItem) {
        this.specialItem = specialItem;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Racer{" +
                "name='" + name + '\'' +
//                ", carType='" + carType + '\'' +
                ", specialItem='" + specialItem + '\'' +
                ", speed=" + speed +
                ", acceleration=" + acceleration +
                '}';
    }
}
