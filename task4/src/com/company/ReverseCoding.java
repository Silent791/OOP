package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseCoding {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println("Результат вычитания из этого числа его же, но перевёрнутого " + reverseRaznost(s));
    }
    public static int reverseRaznost (String s){
        int [] a = new int[s.length()];
        for (int i = 0; i < s.length(); i ++)
            a[i] = Character.digit(s.charAt(i), 10);
        Arrays.sort(a);
        String S = "";
        for (int i = 0; i < a.length; i++) {
            S = S + String.valueOf(a[i]);
        }
        return (Integer.valueOf(s) - Integer.valueOf(S));
    }
}
