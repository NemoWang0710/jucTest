package com.nemo.strategy;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {
    int weight;
    int height;
    public Cat (int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    /**
     * 如果这里相通过另外一种方式进行比较，那就需要修改代码了，违反了开闭原则
     * @param c
     * @return
     */
    public int compareTo(Cat c){
        if(this.weight < c.weight)  return -1;
        else if (this.weight > c.weight) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
