package com.company;

import java.util.Scanner;

public class StrangeAddition {
    public static void main(String[] args) {
        System.out.println("Введите первое слагаемое:");
        Scanner str1 = new Scanner(System.in);
        String a = str1.nextLine();
        System.out.println("Введите второе слагаемое:");
        Scanner str2 = new Scanner(System.in);
        String b = str2.nextLine();
        System.out.println(a + " + " + b + " = " + memeSum(a, b));
    }
    public static String memeSum (String a, String b){
        if (a.length() > b.length())
            while (a.length() > b.length())
                b = "0" + b;
        if (b.length() > a.length())
            while (b.length() > a.length())
                a = "0" + a;
        String r = "";
        for (int i = 0; i < a.length(); i++)
            r = r + (Character.digit(a.charAt(i), 10) + Character.digit(b.charAt(i), 10));
        return (r);
    }
}
