package com.ds.singleton;

class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton instance = new LazySimpleSingleton();

    public static LazySimpleSingleton getInstance() {
        if(instance == null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "This is simple lazy singleton";
    }

}
