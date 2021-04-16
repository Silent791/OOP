package com.company;

import java.util.Scanner;

public class logic_operator {
    public static void main(String[] args) {
        boolean a, b;
        System.out.println("Введите первый логический аргумент:");
        Scanner str1 = new Scanner(System.in);
        a = Boolean.valueOf(str1.nextLine());
        System.out.println("Введите второй логический аргумент:");
        Scanner str2 = new Scanner(System.in);
        b = Boolean.valueOf(str2.nextLine());
        System.out.println(and(a, b));
    }
    public static boolean and (boolean a, boolean b) {
            return (a && b);
        }
    }

