package com.company;

import static java.lang.Math.*;

public class Point3d extends Point2d{
    public static void main(String[] args) {
    }
    public double zCoord;
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }
    public double getZ () {
        return zCoord;
    }
    public void setZ ( double val) {
        zCoord = val;
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
}
