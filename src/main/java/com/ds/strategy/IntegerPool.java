package com.ds.strategy;

class IntegerPool {

    private final int[] arr;
    private Sort sort;


    IntegerPool(int[] arr) {
        sort = new BubbleSort();
        this.arr = arr;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void doSort(){
        sort.sort(arr);
    }


    public int[] getArr() {
        return arr;
    }
}
