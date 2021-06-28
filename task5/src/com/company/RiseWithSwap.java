package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RiseWithSwap {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner str1 = new Scanner(System.in);
        String A = str1.nextLine();
        StringBuffer a = new StringBuffer(A);
        System.out.println("Введите второе число:");
        Scanner str2 = new Scanner(System.in);
        String B = str2.nextLine();
        StringBuffer b = new StringBuffer(B);
        System.out.println(maxPossible(a, b));
    }
    public static StringBuffer maxPossible (StringBuffer a, StringBuffer b){
        int c = 0; int o = -1; int p = b.length() - 1;
        while (b.length() != 0) {
            int max = Character.getNumericValue(b.charAt(0));
            for (int i = 0; i < b.length(); i++)
                if (b.charAt(i) > max) {
                    max = Character.getNumericValue(b.charAt(i));
                    o = i;
                }
            if (b.length() == 1)
                o = 0;
            b.delete(o, o + 1);
            for (int i = 0; i < a.length(); i++)
                if (Character.getNumericValue(a.charAt(i)) < max) {
                    a.replace(i, i + 1, String.valueOf(max));
                    break;
                }
            c++;
        }
        return (a);
    }
}
