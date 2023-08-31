package com.ds.visitor;

class CarMechanic implements CarVisitor{

    public void repairCar(Car car){
        visit(car);
    }

    @Override
    public void visit(Car car) {
        if (car.isEngineBroken()){
            car.setEngineBroken(false);
            System.out.println("Mechanic is repairing car...");
        }else {
            System.out.println("Car is normal");
        }
    }
}
