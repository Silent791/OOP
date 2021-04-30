package com.company;

import java.util.Scanner;

public class sale {
    public static void main(String[] args) {
        int p, s;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите исходную цену: ");
        Scanner str1 = new Scanner (System.in);
        try {
            p = Integer.valueOf(str1.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (p <= 0){
            System.err.println("Цена должна выражаться положительным числом!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите процент скидки: ");
        Scanner str2 = new Scanner (System.in);
        try {
            s = Integer.valueOf(str2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if ((s <= 0)){
            System.err.println("Процент скидки должен выражаться положительным числом!");
            return;
        }
        if ((s >= 100)){
            System.err.println("Процент скидки должен быть меньше ста процентов!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Цена после скидки: " + discount(p, s));
    }
    public static double discount (int p, int s) {
        double P = p;
        return (p - (P/100 * s));
    }
}
