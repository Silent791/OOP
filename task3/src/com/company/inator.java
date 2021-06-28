package com.company;

import java.util.Locale;
import java.util.Scanner;

public class inator {
    public static void main(String[] args) {
        System.out.println("Введите слово:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.print("Изменённое слово: " + inatorInator(s));
    }
    public static String inatorInator(String s){
        s = s.toLowerCase(Locale.ROOT);
        char a = s.charAt(s.length() - 1);
        int b = s.length();
        if ((a == 'a') || (a == 'e') || (a == 'i') || (a == 'o') || (a == 'u') || (a == 'y') ||
                (a == 'а') || (a == 'е') || (a == 'ё') || (a == 'и') || (a == 'о') || (a == 'у') || (a == 'ы') || (a == 'э') || (a == 'ю') || (a == 'я'))
            s = s + "-inator";
        else
            s = s + "inator";
        return (s + " " + b + "000");
    }
}
