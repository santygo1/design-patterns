package com.ds.decorator;

public class ProjectLogger implements Project {

    Project project;

    public ProjectLogger(Project project) {
        this.project = project;
    }

    @Override
    public void run() {
        System.out.println("Before running");
        project.run();
        System.out.println("After running");
    }
}
