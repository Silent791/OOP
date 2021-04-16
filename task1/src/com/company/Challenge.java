package com.company;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        int b;
        System.out.println("Введите целое число:");
        Scanner str = new Scanner(System.in);
        try{
            b = Integer.valueOf(str.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        System.out.println("Квадрат данного числа: " + squared(b));
    }
    public static int squared(int b) {
        return b * b;
    }
}
