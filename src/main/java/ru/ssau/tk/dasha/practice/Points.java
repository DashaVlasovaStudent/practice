package ru.ssau.tk.dasha.practice;

public class Points {
    private Points(){

    }
    public static Point sum(Point aa, Point bb) {
        double xSum = aa.x + bb.x;
        double ySum = aa.y + bb.y;
        double zSum = aa.z + bb.z;
        return new Point(xSum, ySum, zSum);
    }

    public static Point subtract(Point aa, Point bb) {
        double xSubtract = aa.x - bb.x;
        double ySubtract = aa.y - bb.y;
        double zSubtract = aa.z - bb.z;
        return new Point(xSubtract, ySubtract, zSubtract);

    }

    public static Point multiply(Point aa, Point bb) {
        double xMultiply = aa.x * bb.x;
        double yMultiply = aa.y * bb.y;
        double zMultiply = aa.z * bb.z;
        return new Point(xMultiply, yMultiply, zMultiply);
    }

    public static Point divide(Point aa, Point bb) {
        double xDivide = aa.x / bb.x;
        double yDivide = aa.y / bb.y;
        double zDivide = aa.z / bb.z;
        return new Point(xDivide, yDivide, zDivide);
    }




}
