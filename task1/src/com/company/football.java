package com.company;

import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        int win, tie, lose;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество побед:");
        Scanner str1 = new Scanner (System.in);
        try {
            win = Integer.valueOf(str1.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Нужно вводить целое число!");
            return;
        }
        if (win < 0)
        {
            System.err.println("Количество побед не может быть отрицательным!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество ничьих:");
        Scanner str2 = new Scanner (System.in);
        try {
            tie = Integer.valueOf(str2.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Нужно вводить целое число!");
            return;
        }
        if (tie < 0)
        {
            System.err.println("Количество ничьих не может быть отрицательным!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество поражений:");
        Scanner str3 = new Scanner (System.in);
        try {
            lose = Integer.valueOf(str3.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Нужно вводить целое число!");
            return;
        }
        if (lose < 0)
        {
            System.out.println("Количество поражений не может быть отрицательным!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Окончательные очки для команды: " + footballPoints(win, tie, lose));
    }
    public static int footballPoints (int win, int tie, int lose) {
        win = win * 3;
        return (win + tie);
    }
}
