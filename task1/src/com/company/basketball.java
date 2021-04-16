package com.company;

import java.util.Scanner;

public class basketball {
    public static void main(String[] args) {
        int point2, point3;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество забитых 2-х очков:");
        Scanner str1 = new Scanner (System.in);
        try {
            point2 = Integer.valueOf(str1.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Нужно вводить целое число!");
            return;
        }
        if (point2 < 0)
        {
            System.err.println("Количество забитых 2-х очков не может быть отрицательным!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество забитых 3-х очков:");
        Scanner str2 = new Scanner (System.in);
        try {
            point3 = Integer.valueOf(str2.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Нужно вводить целое число!");
            return;
        }
        if (point3 < 0)
        {
            System.err.println("Количество забитых 3-х очков не может быть отрицательным!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Общее количество забитых очков: " + points(point2, point3));
    }
    public static int points (int point2, int point3) {
        point2 = point2 * 2;
        point3 = point3 * 3;
        return (point2 + point3);
    }
}
