package com.company;

public class Boom {

    public static void main(String[] args) {
	    int [] a = new int[7];
        a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5; a[5] = 6; a[6] = 7;
	    System.out.print(sevenBoom(a));
    }
    public static String sevenBoom (int [] a){

        for (int i = 0; i < a.length; i++)
            if (a[i] == 7)
                return ("Boom!");
        return ("в массиве нет 7");
    }
}
