package com.company;

import  java.util.Scanner;

public class minute_to_second {
    public static void main(String[] args) {
        System.out.println("Введите количество минут:");
        Scanner str = new Scanner (System.in);
        try {
            int m = Integer.valueOf(str.nextLine ());
            System.out.println(m + " минут(ы) = " + convert(m) + " секунд(ы)");
            }
        catch (NumberFormatException e) {
            System.err.println("Программа работает только с целыми числами!");
        }
    }
    public static int convert (int m) {
        int s = m * 60;
        return s;
    }
}
