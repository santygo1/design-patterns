package com.ds.prototype;

class Test {
    public static void main(String[] args) {
        Person original = new Person("Danil", "Spirin");
        Person clone = original.clone();

        System.out.println("Original is " + original);
        System.out.println("Clone is " + clone);
    }
}
