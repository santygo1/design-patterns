package com.ds.builder;

class Company {
    private String name;
    private CarBuilder builder;

    Company(String name, CarBuilder carBuilder){
        this.name = name;
        this.builder = carBuilder;
    }

    Car buildCar(){
        builder.createCar();
        builder.typeOfCar();
        builder.engine();
        builder.typeOfGearBox();

        Car car = builder.getCar();
        System.out.printf("Company %s build car %s %n",name, car);

        return car;
    }
}
