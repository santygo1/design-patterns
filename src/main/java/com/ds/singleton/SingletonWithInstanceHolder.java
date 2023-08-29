package com.ds.singleton;

class SingletonWithInstanceHolder {

    private static class InstanceHolder{
        protected static final SingletonWithInstanceHolder SINGLETON = new SingletonWithInstanceHolder();
    }

    private SingletonWithInstanceHolder(){}

    public static SingletonWithInstanceHolder getInstance(){
        return InstanceHolder.SINGLETON;
    }

    @Override
    public String toString() {
        return "This is singleton with static instance holder";
    }
}
