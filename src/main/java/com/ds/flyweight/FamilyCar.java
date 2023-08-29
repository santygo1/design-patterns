package com.ds.flyweight;

class FamilyCar implements Car {
    @Override
    public void drive() {
        System.out.println("Drive with low speed");
    }
}
