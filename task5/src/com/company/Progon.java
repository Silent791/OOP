package com.company;

public class Progon {
    public static void main(String[] args) {
        int [] a = new int[5];
        a[0] = 3; a[1] = 5; a[2] = 7; a[3] = 10; a[4] = 15;
        System.out.print(longestRun(a));
    }
    public static int longestRun(int[] a) {
        int b = 1; int max = 1;
        for (int i = 0; i < a.length - 1; i++){
            if (a[i+1] == a[i] + 1)
                b++;
            else {
                if (b > max)
                    max = b;
                b = 1;
            }
        }
        if (b > max)
            max = b;
        b = 1;
        for (int i = 0; i < a.length - 1; i++){
            if (a[i+1] == a[i] - 1)
                b++;
            else{
                if (b > max)
                    max = b;
                b = 1;
            }
        }
        return (max);
    }
}
