package com.ds.composite;

interface Item {
    String getTitle();

    int getWidth();
    int getHeight();
    int getWeight();

    default void display(){
        System.out.println("This is " + getTitle());
        System.out.println("Width: " + getWidth() + " cm.");
        System.out.println("Height: " + getHeight() + " cm.");
        System.out.println("Weight: " + getWeight() + " kg.");
    }
}
