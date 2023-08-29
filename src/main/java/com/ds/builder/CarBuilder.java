package com.ds.builder;

abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void typeOfCar();

    abstract void engine();

    abstract void typeOfGearBox();

    public Car getCar() {
        return car;
    }
}

