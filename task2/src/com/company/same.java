package com.company;

import java.util.Scanner;

public class same {
    public static void main(String[] args) {
        int a, b, c;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите аргумент a: ");
        Scanner str1 = new Scanner (System.in);
        try {
            a = Integer.valueOf(str1.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите аргумент b: ");
        Scanner str2 = new Scanner (System.in);
        try {
            b = Integer.valueOf(str2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите аргумент c: ");
        Scanner str3 = new Scanner (System.in);
        try {
            c = Integer.valueOf(str3.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Количество целых чисел, имеющих одинаковое значение: " + equal(a, b, c));
    }
    public static int equal (int a, int b, int c) {
        int k = 0;
        if ((a == b) && (a == c)){
            k = 3;
        }
        else {
            if ((a == b) && (a != c)) {
                k = 2;
            }
            else {
                if ((b == c) && (b != a)) {
                    k = 2;
                }
                else{
                    if ((a == c) && (a != b)){
                        k = 2;
                    }
                    else {
                        if ((a != b) && (b != c) && (a != c)) {
                            k = 0;
                        }
                    }
                }
            }
        }
        return (k);
    }
}
