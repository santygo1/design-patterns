package com.ds.singleton;

class DoubleCheckSingleton {

    private DoubleCheckSingleton(){}
    private static volatile DoubleCheckSingleton INSTANCE;
    public static synchronized DoubleCheckSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleCheckSingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "This is double check singleton";
    }
}
