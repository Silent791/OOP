package com.company;

public class WarNeverChanges {
    public static void main(String[] args) {
        int [] ar = new int[4];
        ar[0] = 2;
        ar[1] = 8;
        ar[2] = 7;
        ar[3] = 5;
        System.out.println("Исходный массив: ");
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        System.out.print("Разница между суммой четных и нечетных чисел: " + winner(ar));
    }
    public static int winner (int [] ar){
        int chet = 0, nechet = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i] % 2 == 0 )
                chet = chet + ar[i];
            else
                nechet = nechet + ar[i];
        }
        return (Math.abs(chet - nechet));
    }
}
