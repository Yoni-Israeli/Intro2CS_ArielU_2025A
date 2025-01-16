package classes.week6;

public class main {
    Point1D p1 = new Point1D();
    Point1D p2 = new Point1D(3,8);
    Point1D p3 = p1.add(p2);
    double p1x = p1.Getx();
    double p1y = p1.Gety();

    public static void main(String[] args) {
        Point1D p1 = new Point1D();
        double p1x = p1.Getx();
        System.out.println(p1x);
        p1.setx(5);
         p1x = p1.Getx();
        System.out.println(p1x);
    }
}
