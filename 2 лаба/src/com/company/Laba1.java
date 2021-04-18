package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Laba1 {
    public static void main(String[] args) {
        System.out.println("Введите координату x первой точки: ");
        Scanner str1 = new Scanner(System.in);
        double x1 = Double.valueOf(str1.nextLine());
        System.out.println("Введите координату y первой точки: ");
        Scanner str2 = new Scanner(System.in);
        double y1 = Double.valueOf(str2.nextLine());
        System.out.println("Введите координату z первой точки: ");
        Scanner str3 = new Scanner(System.in);
        double z1 = Double.valueOf(str3.nextLine());
        System.out.println("Введите координату x второй точки: ");
        Scanner str4 = new Scanner(System.in);
        double x2 = Double.valueOf(str4.nextLine());
        System.out.println("Введите координату y второй точки: ");
        Scanner str5 = new Scanner(System.in);
        double y2 = Double.valueOf(str5.nextLine());
        System.out.println("Введите координату z второй точки: ");
        Scanner str6 = new Scanner(System.in);
        double z2 = Double.valueOf(str6.nextLine());
        System.out.println("Введите координату x третьей точки: ");
        Scanner str7 = new Scanner(System.in);
        double x3 = Double.valueOf(str7.nextLine());
        System.out.println("Введите координату y третьей точки: ");
        Scanner str8 = new Scanner(System.in);
        double y3 = Double.valueOf(str8.nextLine());
        System.out.println("Введите координату z третьей точки: ");
        Scanner str9 = new Scanner(System.in);
        double z3 = Double.valueOf(str9.nextLine());
        System.out.println("Вы ввели следующие точки: ");
        System.out.println(x1 + " " + y1 + " " + z1 + "   " + x2 + " " + y2 + " " + z2 + "   " + x3 + " " + y3 + " " + z3);
        Point3d point1 = new Point3d(x1, y1, z1);
        Point3d point2 = new Point3d(x2, y2, z2);
        Point3d point3 = new Point3d(x3, y3, z3);
        if (compare(point1, point2) == false || compare(point1, point3) == false || compare(point2, point3) == false){
            System.out.println("Одна или несколько точке совпадают друг с другом!");
            return;
        }
        System.out.println("Площадь треугольника, составленного из этих трёх точке равна: " + computeArea(point1, point2, point3));
    }
    public static boolean compare(Point3d point1, Point3d point2) {
        if (point1.getX() == point2.getX() && point1.getY() == point2.getY() && point1.getZ() == point2.getZ()) {
            return false;
        } else {
            return true;
        }
    }
    public static double distanceTo (Point3d point1, Point3d point2){
        double a = sqrt(pow(point2.getX() - point1.getX(), 2) + (pow(point2.getY() - point1.getY(), 2)) + pow(point2.getZ() - point1.getZ(), 2));
        return(a);
    }
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = distanceTo(point1, point2);
        double b = distanceTo(point2, point3);
        double c = distanceTo(point3, point1);
        double p = (a + b + c) / 2;
        return (sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}

