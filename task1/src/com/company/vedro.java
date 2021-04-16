package com.company;

import java.util.Scanner;

public class vedro {
    public static void main(String[] args) {
        int n, w, h;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество квадратных метров, которые вы можете нарисовать:");
        Scanner str1 = new Scanner(System.in);
        try{
            n = Integer.valueOf(str1.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Количество кадратных метров должно быть целым числом!");
            return;
        }
        if (n <= 0){
            System.err.println("Количество кадратных метров должно быть положительным числом!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите ширину одной стены в метрах:");
        Scanner str2 = new Scanner(System.in);
        try{
            w = Integer.valueOf(str2.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Ширина должна выражаться целым числом!");
            return;
        }
        if (w <= 0){
            System.err.println("Ширина должна выражаться положительным числом!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите высоту одной стены в метрах:");
        Scanner str3 = new Scanner(System.in);
        try{
            h = Integer.valueOf(str3.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Высота должна выражаться целым числом!");
            return;
        }
        if (h <= 0){
            System.err.println("Высота должна выражаться положительным числом!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Количество полных стен, которые вы можете покрасить: " + howManyWalls(n, w, h));
    }
    public static int howManyWalls (int n, int w, int h) {
        return (n / (w * h));
    }
}
