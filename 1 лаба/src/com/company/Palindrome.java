package com.company;
import  java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);
        String s = str.nextLine ();
        if (isPalindrome(s) == true) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
    public static String reverseString(String s){
        String a = "";
        for (int i = 0; i < (s.length()); i++) {
            a = s.charAt(i) + a;
        }
        return a;
    }
    public static boolean isPalindrome(String s) {
        String s2 = reverseString(s);
        return s.equals(s2);
    }
}
