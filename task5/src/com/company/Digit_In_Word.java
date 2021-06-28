package com.company;

import java.util.Scanner;

public class Digit_In_Word {
    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        System.out.println(rearrange(s));
    }
    public static String rearrange (String s){
        String poryadok = "";
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)))
                poryadok = poryadok + s.charAt(i);
        String S = "";
        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                S = S + s.charAt(i);
        S = S + " ";
        String [] l = new String[poryadok.length()];
        int k = 0; String one = ""; int y = 0;
        while (y < poryadok.length()){
            if (S.charAt(k) == ' '){
                l[y] = one;
                one = "";
                y++;
                k++;
            }
            else {
                one = one + S.charAt(k);
                k++;
            }
        }
        String [] perfect = new String[poryadok.length()];
        for (int i = 0; i < poryadok.length(); i++){
            perfect[Character.getNumericValue(poryadok.charAt(i) - 1)] = l[i];
        }
        String result = "";
        for (int i = 0; i < perfect.length; i++)
            result = result + perfect[i] + " ";
        return (result);
    }
}
