package com.ds.builder;

class Car {
    private String typeOfCar;
    private String engine;
    private String typeOfGearBox;

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public void setTypeOfGearBox(String typeOfGearBox) {
        this.typeOfGearBox = typeOfGearBox;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfCar='" + typeOfCar + '\'' +
                ", engine='" + engine + '\'' +
                ", typeOfGearBox='" + typeOfGearBox + '\'' +
                '}';
    }
}


