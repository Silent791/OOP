package com.company;

import java.util.Scanner;

public class modul {
    public static void main(String[] args) {
        int a, b;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите делимое:");
        Scanner str1 = new Scanner(System.in);
        try{
            a = Integer.valueOf(str1.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите делитель:");
        Scanner str2 = new Scanner(System.in);
        try{
            b = Integer.valueOf(str2.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (b == 0){
            System.err.println("На ноль делить нельзя!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Остаток от деления равен: " + mod(a, b));
    }
    public static int  mod (int a, int b){
        return (a - ((a/b) * b));
    }
}
