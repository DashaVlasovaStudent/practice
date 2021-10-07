package ru.ssau.tk.dasha.practice;

public class Points {
    private Points() {

    }


    public Point enlarge(Point a, double x) {

        return new Point(x * a.getX(), x * a.getY(), x * a.getZ());

    }
    public static double length(Point x){
        return x.length();
    }
    public static Point opposite(Point point){
        double x = -1* point.getX();
        double y = -1* point.getY();
        double z = -1* point.getZ();
        return new Point (x,y,z);
    }
    public static Point inverse(Point point){
        double x = 1/ point.getX();
        double y = 1/ point.getY();
        double z = 1/ point.getZ();
        return new Point (x,y,z);
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
