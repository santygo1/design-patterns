package com.ds.strategy;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {
        IntegerPool integerPool = new IntegerPool(new int[]{4,1,2,16,12,28});
        integerPool.doSort();
        System.out.println(Arrays.toString(integerPool.getArr()));

        IntegerPool integerPool1 = new IntegerPool(new int[]{1,213,21,22,3});
        integerPool1.setSort(new InsertionSort());
        integerPool1.doSort();
        System.out.println(Arrays.toString(integerPool1.getArr()));
    }
}
