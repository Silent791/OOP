package com.company;

import java.util.Scanner;

public class raznica {
    public static void main(String[] args) {
        int size; int arr[];
        //-------------------------------------------------------------------------------------
        System.out.println("Введите размер массива: ");
        Scanner str1 = new Scanner (System.in);
        try {
            size = Integer.valueOf(str1.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        if (size <= 0){
            System.out.println("Размер массива должен выражаться положительным числом!");
        }
        //-------------------------------------------------------------------------------------
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i+1) + " элемент: ");
            Scanner str2 = new Scanner (System.in);
            try {
                arr[i] = Integer.valueOf(str2.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Вы некорректно ввели число!");
                return;
            }
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Разница между максимальным и минимальным элементом массива: " + differenceMaxMin(arr, size));
    }
    public static int differenceMaxMin (int[] arr, int size) {
        int min = arr[0]; int max = arr[0];
        for (int i = 0; i < size; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < size; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return (max - min);
    }
}
