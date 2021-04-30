package com.company;

import java.util.Scanner;

public class job {
    public static void main(String[] args) {
        int a, b, c;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите зарплату первого программиста: ");
        try {
            Scanner str1 = new Scanner(System.in);
            a = Integer.valueOf(str1.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (a <= 0) {
            System.err.println("Зарплата должна выражаться положительным числом!");
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите зарплату второго программиста: ");
        try {
            Scanner str2 = new Scanner(System.in);
            b = Integer.valueOf(str2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (b <= 0) {
            System.err.println("Зарплата должна выражаться положительным числом!");
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите зарплату третьего программиста: ");
        try {
            Scanner str3 = new Scanner(System.in);
            c = Integer.valueOf(str3.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (c <= 0) {
            System.err.println("Зарплата должна выражаться положительным числом!");
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Разница между самым высокооплачиваемым программистом и самым низкооплачиваемым: " + programmers(a, b, c));
    }

    public static int programmers (int a, int b, int c) {
        int k = 0;
        if ((a > b) && (b > c)) {
            k = a - c;
        }
        else {
            if ((b > a) && (a > c)) {
                k = b - c;
            }
            else {
                if ((a > c) && (c > b)) {
                    k = a - b;
                }
                else {
                    if ((c > b) && (b > a)) {
                        k = c - a;
                    }
                    else{
                        if ((b > a) && (a > c)){
                            k = c - b;
                        }
                        else{
                            if ((b > c) && (c > a)){
                                k = b - a;
                            }
                        }
                    }
                }
            }
        }
        return (k);
    }
}