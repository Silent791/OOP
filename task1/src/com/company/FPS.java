package com.company;

import java.util.Scanner;

public class FPS {
    public static void main(String[] args) {
        int fps, min;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество кадров в секунду:");
        Scanner str1 = new Scanner(System.in);
        try{
            fps = Integer.valueOf(str1.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (fps <= 0){
            System.err.println("Количество кадров в секунду должно выражаться положительным числом!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите количество минут:");
        Scanner str2 = new Scanner(System.in);
        try{
            min = Integer.valueOf(str2.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (min <= 0){
            System.err.println("Количество минут должно выражаться положительным числом!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Количество кадров, показанных за заданное количество минут для данного FPS: " + frames(fps, min));
    }
    public static int frames (int fps, int min){
        return (fps * min * 60);
    }
}
