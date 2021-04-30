package com.company;

import java.util.Scanner;

public class swipe {
    public static void main(String[] args) {
        System.out.println("Введите имя и фамилию человека: ");
        Scanner str = new Scanner (System.in);
        String s = str.nextLine ();
        System.out.println("Замена имени и фамилии: " + nameShuffle(s));
    }
    public static String nameShuffle(String s){
        String a = ""; String b = ""; int i = 0;
        while (s.charAt(i) != 32){
            a = a + s.charAt(i);
            i++;
        }
        i++;
        while(i != s.length()){
            b = b + s.charAt(i);
            i++;
        }
        return (b + " " + a);
    }
}
