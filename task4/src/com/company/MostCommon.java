package com.company;

import java.util.Locale;
import java.util.Scanner;

public class MostCommon {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.print(commonLastVowel(s));
    }
    public static String commonLastVowel (String s){
        s = s.toLowerCase(Locale.ROOT);
        String b = "";
        s = s + " ";
        for (int j = 0; j < s.length() - 1; j++)
            if (((s.charAt(j + 1) == ' ') || (s.charAt(j + 1) == '!' ) || (s.charAt(j + 1) == '.') || (s.charAt(j + 1) == '?')) &&
                ((s.charAt(j) == 'a') || (s.charAt(j) == 'e') || (s.charAt(j) == 'i') || (s.charAt(j) == 'o') || (s.charAt(j) == 'u') || (s.charAt(j) == 'y')))
                b = b + s.charAt(j);
        if (b.equals(""))
            return "В данном предложении на конце слов только согласные буквы";
        int a = 0; int e = 0; int i = 0; int o = 0; int u = 0; int y = 0;
        for (int j = 0; j < b.length(); j++) {
            if (b.charAt(j) == 'a')
                a++;
            if (b.charAt(j) == 'e')
                e++;
            if (b.charAt(j) == 'i')
                i++;
            if (b.charAt(j) == 'o')
                o++;
            if (b.charAt(j) == 'u')
                u++;
            if (b.charAt(j) == 'y')
                y++;
        }
        int array[] = new int[]{a, e, i, o, u, y};
        int max = 0; int name = 0;
        for (int j = 0; j < 6; j++){
            if (array[j] > max) {
                max = array[j];
                name = j;
            }
        }
        switch (name) {
            case 0:
                return ("Самая популярная гласная буква на конце слов — a");
            case 1:
                return ("Самая популярная гласная буква на конце слов — e");
            case 2:
                return ("Самая популярная гласная буква на конце слов — i");
            case 3:
                return ("Самая популярная гласная буква на конце слов — o");
            case 4:
                return ("Самая популярная гласная буква на конце слов — u");
            case 5:
                return ("Самая популярная гласная буква на конце слов — y");
        }
        return ("");
    }
}
