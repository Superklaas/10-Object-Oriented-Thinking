package be.vdab.Ex104MyPoint;

import java.text.DecimalFormat;

public class TestMyPoint {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        double distanceP1P2 = MyPoint.distance(p1,p2);
        System.out.println("Distance: " + df.format(distanceP1P2));
    }
}
