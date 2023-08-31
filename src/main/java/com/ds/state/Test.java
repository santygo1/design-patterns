package com.ds.state;

class Test {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.doActivity();
        developer.changeCurrentActivity();
        developer.doActivity();
        developer.changeCurrentActivity();
        developer.doActivity();
        developer.changeCurrentActivity();
        developer.doActivity();
        developer.setCurrentActivity(() -> {
            System.out.println("Do something else...");
        });
        developer.doActivity();
    }
}
