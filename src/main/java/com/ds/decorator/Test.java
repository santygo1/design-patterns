package com.ds.decorator;

public class Test {

    public static void main(String[] args) {
        Project project = new MyProject();
        project = new ProjectLogger(project);

        project.run();
    }
}
