package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner str = new Scanner (System.in);
        String s  = str.nextLine();
            System.out.println("Данная строка в обратном порядке: " + reverseString(s));
    }
    public static String reverseString(String s){
        String a = "";
        for (int i = 0; i < (s.length()); i++) {
            a = s.charAt(i) + a;
        }
        return a;
    }
}
