package com.company;

public class average {
    public static void main(String[] args) {
        int [] a = new int[11];
        a[0] = 1; a[1] = 0; a[2] = 4; a[3] = 5; a[4] = 2; a[5] = 4; a[6] = 1; a[7] = 2; a[8] = 3; a[9] = 3; a[10] = 3;
            System.out.println("Исходный массив:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.print("Среднее значение: " + mean(a));
    }
    public static double mean (int[] a){
        double av = 0;
        for (int i = 0; i < a.length; i++)
            av = av + a[i];
        return (Math.round(av/a.length * 100) / 100.0);
    }
}
