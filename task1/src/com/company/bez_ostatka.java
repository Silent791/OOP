package com.company;

import java.util.Scanner;

public class bez_ostatka {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите целое число:");
        Scanner str = new Scanner (System.in);
        try {
            a = Integer.valueOf(str.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (divisbleByFive(a) == true){
            System.out.println("Данное число равномерно делится на 5");
        }
        else{
            System.out.println("Данное число не делится равномерно на 5");
        }
    }
    public static boolean divisbleByFive (int a) {
        if (a % 5 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
