package com.company;

public class triangle {
    public static void main(String[] args) {
        double shortside = 1;
        System.out.print("Короткая сторона: " + shortside + "  Длинная сторона: " + otherSides(shortside)[0] + "  Средняя сторона " + otherSides(shortside)[1]);
    }
    public static double[] otherSides (double a){
        double [] b = new double[2];
        b[0] = a*2;
        b[0] = Math.round(b[0] * 100) / 100;

        b[1] = Math.sqrt((a*2)*(a*2) - a*a);
        b[1] = Math.round(b[1] * 100)/100.0;
        return (b);
    }
}
