package com.ds.singleton;

class Test {

    public static void main(String[] args) {
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        System.out.println(singleton);

        LazySimpleSingleton singleton1 = LazySimpleSingleton.getInstance();
        System.out.println(singleton1);

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton);

        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        System.out.println(doubleCheckSingleton);

        SingletonWithInstanceHolder singletonWithInstanceHolder = SingletonWithInstanceHolder.getInstance();
        System.out.println(singletonWithInstanceHolder);
    }
}
