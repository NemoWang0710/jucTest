package com.nemo.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] a = {9,2,3,5,7,1,4};
        Cat[] a = {new Cat(5,5),new Cat(2,2),new Cat(3,3)};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
