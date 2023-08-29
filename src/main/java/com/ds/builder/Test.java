package com.ds.builder;

class Test {
    public static void main(String[] args) {
        Company company = new Company("Toyota", new SedanBuilder());
        company.buildCar();
    }
}
