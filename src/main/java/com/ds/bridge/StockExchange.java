package com.ds.bridge;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Stock exchange development in progress");
        developer.writeCode();
    }
}
