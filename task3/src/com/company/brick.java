package com.company;

import java.util.Scanner;

public class brick {
    public static void main(String[] args) {
        System.out.println("Введите высоту кирпича:");
        Scanner str1 = new Scanner(System.in);
        int a = Integer.valueOf(str1.nextLine());
        System.out.println("Введите ширину кирпича:");
        Scanner str2 = new Scanner(System.in);
        int b = Integer.valueOf(str2.nextLine());
        System.out.println("Введите глубину кирпича:");
        Scanner str3 = new Scanner(System.in);
        int c = Integer.valueOf(str3.nextLine());
        System.out.println("Введите ширину отверстия:");
        Scanner str4 = new Scanner(System.in);
        int w = Integer.valueOf(str4.nextLine());
        System.out.println("Введите высоту отверстия:");
        Scanner str5 = new Scanner(System.in);
        int h = Integer.valueOf(str5.nextLine());
        System.out.print(doesBrickFit(a, b, c, w, h));
    }
    public static boolean doesBrickFit (int a, int b, int c, int w, int h){
        byte sum = 0;
        if ((a <= w) || (a <= h))
            sum++;
        if ((b <= w) || (b <= h))
            sum++;
        if ((c <= w) || (c <= h))
            sum++;
        return (sum >= 2);
    }
}
