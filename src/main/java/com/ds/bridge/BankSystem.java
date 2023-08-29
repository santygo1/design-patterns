package com.ds.bridge;

public class BankSystem extends Program{
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Bank system development in progress");
        developer.writeCode();
    }
}
