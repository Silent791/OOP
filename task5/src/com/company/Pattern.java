package com.company;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        System.out.println("Введите первую строку:");
        Scanner str1 = new Scanner(System.in);
        String s1 = str1.nextLine();
        System.out.println("Введите вторую строку:");
        Scanner str2 = new Scanner(System.in);
        String s2 = str2.nextLine();
        System.out.println(sameLetterPattern(s1, s2));
    }
    public static boolean sameLetterPattern (String s1, String s2){
        String S1 = ""; String S2 = "";

        char x, z; char y = '汉';
        int k = -1;
        x = s1.charAt(0);
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != x) {
                y = s1.charAt(i);
                k = i;
                break;
            }
        if ((k >= 0) && (y != '汉'))
        for (int i = k + 1; i < s1.length(); i++)
            if ((s1.charAt(i) != x) && (s1.charAt(i) != y))
                z = s1.charAt(i);
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) == x)
                S1 = S1 + 'X';
            else
                if (s1.charAt(i) == y)
                    S1 = S1 + 'Y';
                else
                    S1 = S1 + 'Z';
        //----------------------------------------------------------------------
        k = -1; y = '汉'; z = '汉';
        x = s2.charAt(0);
        for (int i = 0; i < s2.length(); i++)
            if (s2.charAt(i) != x) {
                y = s2.charAt(i);
                k = i;
                break;
            }
        if ((k >= 0) && (y != '汉'))
            for (int i = k + 1; i < s2.length(); i++)
                if ((s2.charAt(i) != x) && (s2.charAt(i) != y))
                    z = s2.charAt(i);
        for (int i = 0; i < s2.length(); i++)
            if (s2.charAt(i) == x)
                S2 = S2 + 'X';
            else
            if (s2.charAt(i) == y)
                S2 = S2 + 'Y';
            else
                S2 = S2 + 'Z';
        return (S1.equals(S2));
    }
}
