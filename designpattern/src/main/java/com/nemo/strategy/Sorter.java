package com.nemo.strategy;

import java.util.Arrays;

public class Sorter {

    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                minPos = a[minPos].compareTo(a[j]) == -1 ? minPos : j;
            }
            swap(a,minPos,i);
        }
    }

    private void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
