package com.company;

import java.util.Locale;
import java.util.Scanner;

public class bomb {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        if (bomba(s) == true){
            System.out.println("ПРИГНИСЬ!");
        }
        else {
            System.out.println("Расслабься, бомбы нет");
        }
    }
    public static boolean bomba(String s) {
        s = s.toLowerCase(Locale.ROOT);
        boolean a = s.contains("bomb");
        boolean b = s.contains("бомба");
        if ((a == true) || (b == true )){
            return (true);
        }
        else{
            return (false);
        }
    }
}
