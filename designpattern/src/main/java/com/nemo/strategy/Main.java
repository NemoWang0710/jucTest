package com.nemo.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] a = {9,2,3,5,7,1,4};
//        Cat[] a = {new Cat(5,5),new Cat(2,2),new Cat(3,3)};

        Dog[] a = {new Dog(1),new Dog(3),new Dog(2)};
        Sorter<Dog> sorter = new Sorter();
        sorter.sort(a, new DogComparator());
        System.out.println(Arrays.toString(a));
    }
}
