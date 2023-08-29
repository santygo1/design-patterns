package com.ds.singleton;

class SimpleSingleton {

    private SimpleSingleton(){}

    private static final SimpleSingleton instance = new SimpleSingleton();

    public static SimpleSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "This is simple singleton";
    }
}
