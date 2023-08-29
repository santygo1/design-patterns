package com.ds.composite;

class Board implements Item {

    @Override
    public String getTitle() {
        return "Board";
    }

    @Override
    public int getWidth() {
        return 20;
    }

    @Override
    public int getHeight() {
        return 120;
    }

    @Override
    public int getWeight() {
        return 2;
    }
}
