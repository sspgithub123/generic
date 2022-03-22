package com.bridgelabz;

public class MaximumNumber {

    //method: find maximum
    public <T extends Comparable<T>> void findMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        } else if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum is: " + max);
    }
}
