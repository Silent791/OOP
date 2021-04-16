package com.company;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        double prob, prize, pay;
        //-------------------------------------------------------------------------------------
        System.out.println("Введите probe:");
        Scanner str1 = new Scanner(System.in);
        try{
            prob = Double.valueOf(str1.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите prize:");
        Scanner str2 = new Scanner(System.in);
        try{
            prize = Double.valueOf(str2.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Введите pay:");
        Scanner str3 = new Scanner(System.in);
        try{
            pay = Double.valueOf(str3.nextLine ());
        }
        catch (NumberFormatException e){
            System.err.println("Вы некорректно ввели число!");
            return;
        }
        //-------------------------------------------------------------------------------------
        System.out.println("Результат работы функции: " + profitableGamble(prob, prize, pay));
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob * prize > pay){
            return true;
        }
        else{
            return false;
        }
    }
}
