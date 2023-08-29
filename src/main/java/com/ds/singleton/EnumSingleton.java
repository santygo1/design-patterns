package com.ds.singleton;

enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return "This is enum singleton";
    }
}
