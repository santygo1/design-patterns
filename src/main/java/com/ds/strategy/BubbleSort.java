package com.ds.strategy;

class BubbleSort implements Sort {

    @Override
    public void sort(int[] arr) {
        System.out.println("Doing BubbleSort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
