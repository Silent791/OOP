package com.company;

import java.util.Arrays;

public class Razriv {
    public static void main(String[] args) {
        int [] a = new int[11];
        a[0] = 9; a[1] = 4; a[2] = 26; a[3] = 26; a[4] = 0; a[5] = 0; a[6] = 5; a[7] = 20; a[8] = 6; a[9] = 25; a[10] = 5;
        System.out.println("Исходный массив:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        a = sort(a); System.out.println();
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("Наибольший разрыв между отсортированными элементами массива: " + largestGap(a));
    }
    public static int[] sort (int [] a) {
        Arrays.sort(a);
        return (a);
    }
    public static int largestGap (int [] a) {
        int maxGap = 0;
        for (int i = 0; i < a.length - 1; i++)
            if (Math.abs(a[i+1] - a[i]) > maxGap)
                maxGap = Math.abs(a[i+1] - a[i]);
        return (maxGap);
    }
}
