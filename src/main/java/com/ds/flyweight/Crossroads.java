package com.ds.flyweight;

class Crossroads {

    void emulateSituation(){
        CarFactory carFactory = new CarFactory();

        Car familyCar = carFactory.getCarByType("family");
        familyCar.drive();

        Car racingCar = carFactory.getCarByType("racing");
        racingCar.drive();
    }

    public static void main(String[] args) {
        Crossroads crossroads = new Crossroads();
        crossroads.emulateSituation();
    }
}
