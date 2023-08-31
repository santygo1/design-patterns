package com.ds.state;

public class Sleeping implements Activity{
    @Override
    public void doActivity() {
        System.out.println("Sleeping...");
    }
}
