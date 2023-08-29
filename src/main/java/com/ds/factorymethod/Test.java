package com.ds.factorymethod;

class Test {
    public static void main(String[] args) {
        DeveloperFactory devFactory = new JavaDeveloperFactory();
        Developer developer = devFactory.createDeveloper();
        developer.writeCode();

        devFactory = new CppDeveloperFactory();
        developer = devFactory.createDeveloper();
        developer.writeCode();
    }
}
