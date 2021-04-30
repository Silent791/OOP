package com.company;

import java.util.Scanner;

public class Tesha {
    public static void main(String[] args) {
        int number, length;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите номер дома: ");
        Scanner str1 = new Scanner(System.in);
        try {
            number = Integer.valueOf(str1.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (number <= 0) {
            System.err.println("Номер дома должен быть положительным числом!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите длину улицы: ");
        Scanner str2 = new Scanner(System.in);
        try {
            length = Integer.valueOf(str2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (length <= 0) {
            System.err.println("Длина улицы должна быть положительным числом!");
            return;
        }
        if (number > length * 2){
            System.err.println("Такого дома не существует на этой улице!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Номер дома на противоположной стороне: " + oppositeHouse(number, length));
    }
    public static int oppositeHouse(int number, int length) {
        //Создание массивов--------------------------------------------------------------------
        int chet[];
        int nechet[];
        chet = new int[length];
        nechet = new int[length];
        int a = (length * 2) - 1;
        int b = 2;
        for (int i = 0; i < length; i++) {
            nechet[i] = a;
            a = a - 2;
        }
        for (int i = 0; i < length; i++) {
            chet[i] = b;
            b = b + 2;
        }
        //-------------------------------------------------------------------------------------
        if (number % 2 == 0) {
            for (int i = 0; i < length; i++) {
                if (chet[i] == number) {
                    a = nechet[i];
                }
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (nechet[i] == number) {
                    a = chet[i];
                }
            }
        }
        return (a);
    }
}