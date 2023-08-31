package com.ds.visitor;

class Car {

    private String mark;
    private boolean isEngineStarting;
    private boolean isEngineBroken;

    Car(String mark){
        isEngineBroken = false;
        isEngineStarting = false;
    }

    void accept(CarVisitor visitor){
        visitor.visit(this);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public boolean isEngineStarting() {
        return isEngineStarting;
    }

    public void setEngineStarting(boolean engineStarting) {
        isEngineStarting = engineStarting;
    }

    public boolean isEngineBroken() {
        return isEngineBroken;
    }

    public void setEngineBroken(boolean engineBroken) {
        isEngineBroken = engineBroken;
    }
}
