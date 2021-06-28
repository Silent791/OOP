package com.company;

import java.util.Scanner;

public class Putanica {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println("Распутанная строка:");
        System.out.println(unmix(s));
    }
    public static String unmix (String s){
        String b = "";
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i = i + 2) {
                b = b + s.charAt(i + 1);
                b = b + s.charAt(i);
            }
        }
        else {
            for (int i = 0; i < s.length() - 1; i = i + 2) {
                b = b + s.charAt(i + 1);
                b = b + s.charAt(i);
            }
            b = b + s.charAt(s.length() - 1);
        }
        return (b);
    }
}
