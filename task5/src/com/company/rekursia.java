package com.company;

import java.util.Scanner;

public class rekursia {
    int k = 0;
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        int a = Integer.parseInt(clean(s));
        System.out.println("Количество цифр в данном числе: " + digitsCount(a));
    }
    public static int digitsCount (int a){
        if (a/10 != 0)
            return (1 + digitsCount(a/10));
        else
            return 1;
    }
    public static String clean (String s){
        String S = "";
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)))
                S = S + s.charAt(i);
        return (S);
    }
}
