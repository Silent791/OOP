package com.company;

import java.util.Scanner;

public class Chetnost {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner str = new Scanner(System.in);
        int a = Integer.valueOf(str.nextLine());
        System.out.print(parityAnalysis(a));
    }
    public static boolean parityAnalysis (int a){
        boolean b = false;
        if (a % 2 == 0)
            b = true;
        int sum = 0;
        while (a > 0){
           sum = sum + a % 10;
           a = a / 10;
        }
        boolean c = false;
        if (sum % 2 == 0)
            c = true;
        return (b == c);
    }
}
