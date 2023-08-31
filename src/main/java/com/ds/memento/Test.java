package com.ds.memento;

class Test {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Project project = new Project();
        project.setVersionAndDate("0.1");
        System.out.println(project);
        repository.setSave(project.save());

        project.setVersionAndDate("1.0");
        System.out.println(project);

        project.load(repository.getSave());
        System.out.println(project);
    }
}
