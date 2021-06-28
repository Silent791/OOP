package com.company;

import java.util.Scanner;

public class rsp {
    public static void main(String[] args) {
        System.out.println("Игрок 1, введите свой знак:");
        Scanner str1 = new Scanner(System.in);
        String s1 = str1.nextLine();
        System.out.println("Игрок 2, введите свой знак:");
        Scanner str2 = new Scanner(System.in);
        String s2 = str2.nextLine();
        System.out.println(game(s1, s2));
    }

    public static String game(String s1, String s2) {
        String a;
        if (s1.equals(s2))
            a = ("Ничья");
        else
            if ((s1.equals("камень") && (s2.equals("бумага"))) || (s1.equals("ножницы") && (s2.equals("камень"))) || (s1.equals("бумага") && (s2.equals("ножницы"))))
                a = ("Игрок 2 победил");
            else
                if ((s1.equals("бумага") && (s2.equals("камень"))) || (s1.equals("камень") && (s2.equals("ножницы"))) || (s1.equals("ножницы") && (s2.equals("бумага"))))
                    a = ("Игрок 1 победил");
                else
                    a = "Вы некорректно ввели знак";

        return (a);
    }
}