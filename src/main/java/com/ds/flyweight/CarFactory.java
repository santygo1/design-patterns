package com.ds.flyweight;

import java.util.HashMap;
import java.util.Map;


class CarFactory {

    private Map<String, Car> carHashMap = new HashMap<>();

    public Car getCarByType(String type) {
        Car car = carHashMap.get(type);

        if (car == null) {
            switch (type.toLowerCase()) {
                case "family" -> {
                    car = new FamilyCar();
                }
                case "racing" -> {
                    car = new RacingCar();
                }
            }
        }
        carHashMap.put(type, car);

        return car;
    }
}
