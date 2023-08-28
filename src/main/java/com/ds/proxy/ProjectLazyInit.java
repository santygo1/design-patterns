package com.ds.proxy;

public class ProjectLazyInit implements Project{

    private Project project;

    @Override
    public void run() {
        if (project == null){
            project = new MyProject();
        }

        project.run();
    }
}
