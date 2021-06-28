package com.company;

import java.util.Scanner;

public class registr {
    public static void main(String[] args) {
        System.out.println("Введите слово:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println("Результат работы программы: ");
        System.out.print(reverseCase(s));
    }
    public static String reverseCase (String s){
        String S = "";
        for (int i = 0; i < s.length(); i++){
            if (((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) || (s.charAt(i) >= 128) && (s.charAt(i) <= 159) || s.charAt(i) == 240)
                S = S + Character.toLowerCase(s.charAt(i));
            else
                if (((s.charAt(i) >= 97) && (s.charAt(i) <= 122)) || (s.charAt(i) >= 160) && (s.charAt(i) <= 175) || (s.charAt(i) >= 224) && (s.charAt(i) <= 239) || s.charAt(i) == 241)
                    S = S + Character.toUpperCase(s.charAt(i));
                else
                    S = S + s.charAt(i);
        }
        return (S);
    }
}
