package com.company;

import java.util.Scanner;

public class X_To_Cks {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println(xPronounce(s));
    }
    public static StringBuffer xPronounce (String s){
        String a = ""; s = " " + s;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'x')
                if ((s.charAt(i - 1) == ' ') && (s.charAt(i + 1) == ' '))
                    a = a + "ecks";
                else
                    if (s.charAt(i - 1) == ' ')
                        a = a + "z";
                    else
                        a = a + "cks";
            else
                a = a + s.charAt(i);
        }
        StringBuffer A = new StringBuffer(a);
        A.delete(0,1);
        return (A);
    }
}
