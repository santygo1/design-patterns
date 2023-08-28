package com.ds.proxy;

class MyProject implements Project{

    public MyProject(){
        System.out.println("Creating project");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}
