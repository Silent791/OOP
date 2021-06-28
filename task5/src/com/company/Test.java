package com.company;

public class Test {
    public static void main(String[] args) {
        double [] a = new double[6];
        a[0] = 95; a[1] = 83; a[2] = 90; a[3] = 87; a[4] = 88; a[5] = 93;
        System.out.print(takeDownAverage(a));
    }
    public static int takeDownAverage(double[] a) {
        double average = 0;
        for (int i = 0; i < a.length; i++)
            average = average + a[i];
        return ((int) ((average / a.length - 5) * (a.length + 1) - average));
    }
}
