package com.ds.strategy;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        System.out.println("Doing insertion sort");
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
    }
}
