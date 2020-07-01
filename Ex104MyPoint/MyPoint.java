package be.vdab.Ex104MyPoint;

public class MyPoint {

    double x;
    double y;

    MyPoint() {};
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    };

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public static double distance (MyPoint p1, MyPoint p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double distance = Math.sqrt(Math.pow((x2 -x1),2) + Math.pow((y2 -y1),2));
        return distance;
    }
}
