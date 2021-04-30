package com.company;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        System.out.println("Введите первую строку: ");
        Scanner str1 = new Scanner(System.in);
        String s1 = str1.nextLine();
        System.out.println("Введите вторую строку: ");
        Scanner str2 = new Scanner(System.in);
        String s2 = str2.nextLine();
        if(sameAscii(s1, s2) == true){
            System.out.println("Cумма значений ASCII первой строки СОВПАДАЕТ с суммой значений ASCII второй строки");
        }
        else{
            System.out.println("Cумма значений ASCII первой строки НЕ СОВПАДАЕТ с суммой значений ASCII второй строки");
        }
    }
    public static boolean sameAscii (String s1, String s2) {
        int sum1 = 0; int sum2 = 0;
        for (int i = 0; i < s1.length(); i++){
            sum1 = sum1 +  s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++){
            sum2 = sum2 +  s2.charAt(i);
        }
        if (sum1 == sum2) {
            return (true);
        }
        else{
            return (false);
        }
    }
}
