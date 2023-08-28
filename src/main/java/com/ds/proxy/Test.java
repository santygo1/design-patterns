package com.ds.proxy;

class Test {

    public static void main(String[] args) {
        Project project = new ProjectLazyInit();
        System.out.println("Not created");

        project.run();
    }
}
