package com.ds.visitor;

class CarOwner implements CarVisitor{

    private Car car;

    CarOwner(Car car){
        this.car = car;
    }

    public void drive(){
        visit(this.car);
    }

    @Override
    public void visit(Car car) {
        if (!car.isEngineBroken()){
            if (!car.isEngineStarting()){
                car.setEngineStarting(true);
                System.out.println("Owner is starting car engine...");
            }
        }else {
            System.out.println("Car is broken, visit mechanic");
        }
    }
}
