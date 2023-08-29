package com.ds.builder;

class SedanBuilder extends CarBuilder {

    @Override
    void typeOfCar() {
        this.car.setTypeOfCar("Sedan");
    }

    @Override
    void engine() {
        this.car.setEngine("v8");
    }

    @Override
    void typeOfGearBox() {
        this.car.setTypeOfGearBox("mechanic");
    }
}
