package com.company;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        StringBuffer S = new StringBuffer(s);
        System.out.print("Результат: " + unrepeated(S));
    }
    public static StringBuffer unrepeated (StringBuffer S) {
        for (int i = 0; i < S.length() - 1; i++)
            for (int j = i + 1; j < S.length(); j++)
                if (S.charAt(j) == S.charAt(i))
                    S.delete(j, j + 1);
        for (int i = 0; i < S.length(); i++)                        //Прохожусь два раза, так как при "aaaaaa" остаётся "aa"
            for (int j = i + 1; j < S.length(); j++)
                if (S.charAt(j) == S.charAt(i))
                    S.delete(j, j + 1);
        return (S);
    }
}
