package ru.ssau.tk.dasha.practice;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point a = new Point(3, 4, 5.9);
    Point b = new Point(3.8, 7, 9);
    Point c = new Point(1, 4.5, 5.9);

    public double getX() {
        return a.x;
    }
    public double getY() {
        return a.y;
    }
    public double getZ() {
        return a.z;
    }




}
