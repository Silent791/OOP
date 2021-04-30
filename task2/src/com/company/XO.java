package com.company;

import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println("Результат работы программы: " + getXO(s));
    }
    public static boolean getXO(String s){
        int x = 0; int o = 0; boolean a;
        for (int i = 0; i < (s.length()); i++) {
            if ((s.charAt(i) == 88) || ((s.charAt(i) == 120))) {
                x++;
            }
            if ((s.charAt(i) == 79) || ((s.charAt(i) == 111))) {
                o++;
            }
        }
        if ((x == 0) && (o == 0)) {
            a = true;
        }
        else {
            if (x == o) {
                a = true;
            } else {
                a = false;
            }
        }
        return a;
    }
}

