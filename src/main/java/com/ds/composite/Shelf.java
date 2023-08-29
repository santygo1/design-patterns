package com.ds.composite;

class Shelf implements Item{

    @Override
    public String getTitle() {
        return "Shelf";
    }

    @Override
    public int getWidth() {
        return 20;
    }

    @Override
    public int getHeight() {
        return 5;
    }

    @Override
    public int getWeight() {
        return 2;
    }
}
