package com.company;

import java.util.Scanner;

public class Znaki {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println(noYelling(s));
    }
    public static String noYelling (String s){
        String a = ""; int b = s.length();
        if ((s.charAt(s.length() - 1) == '!') || (s.charAt(s.length() - 1) == '?')) {
            for (int i = s.length() - 1; i > 0; i--)
                if ((s.charAt(i) != '!') && (s.charAt(i) != '?')) {
                    b = i + 1;
                    break;
                }
            for (int i = 0; i <= b; i++)
                a = a + s.charAt(i);
            return (a);
        }
        else {
            return (s);
        }
    }
}
