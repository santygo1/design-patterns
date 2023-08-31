package com.ds.visitor;

class Test {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.setEngineBroken(true);

        CarOwner carOwner = new CarOwner(car);
        carOwner.drive();

        CarMechanic carMechanic = new CarMechanic();
        carMechanic.repairCar(car);

        carOwner.drive();
    }
}
