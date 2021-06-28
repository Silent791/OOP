package com.company;

import java.util.*;

public class Poryadok {
    public static void main(String[] args) {
        int [] a = new int[6];
        a[0] = 5; a[1] = 6; a[2] = 7; a[3] = 8; a[4] = 9; a[5] = 9;
        System.out.print(cons(a));
    }
    public static  boolean cons (int [] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++)
            if (a[i+1] != a[i] + 1)
                return false;
        return true;
    }
}
