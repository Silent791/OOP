package com.company;

import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        System.out.println("Сколько литров топлива у вас?");
        Scanner str1 = new Scanner(System.in);
        double l = Double.valueOf(str1.nextLine());
        System.out.println("Какой расход у вашего автмобиля(л/100км)?");
        Scanner str2 = new Scanner(System.in);
        double ras = Double.valueOf(str2.nextLine());
        System.out.println("Сколько пассажиров в машине?");
        Scanner str3 = new Scanner(System.in);
        int pas = Integer.valueOf(str3.nextLine());
        System.out.println("Включён ли кондиционер в салоне?");
        Scanner str4 = new Scanner(System.in);
        String k = str4.nextLine();
        boolean kon = false;
        if (k.equals("да"))
            kon = true;
        System.out.println("Максимальное расстояние, которое может проехать ваш автомобиль: " + totalDistance(l, ras, pas, kon));
    }
    public static double totalDistance(double l, double ras, int pas, boolean kon) {

        int proc = pas * 5;
        ras = ras + (ras / 100.0 * proc);
        if (kon)
            ras = ras * 1.1;
        return ((Math.round((l / ras * 100.0) * 100)) / 100.0);
    }
}
