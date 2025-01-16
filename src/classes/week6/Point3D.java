package classes.week6;

public class Point3D {
    public static final double EPS1 = 0.001, EPS2 = Math.pow(EPS1, 2), EPS = EPS2;
    public static final Point3D ORIGIN = new Point3D(0, 0);

    private double _x;
    private double _y;

    public Point3D(double a, double b) {
        this._x = a;
        this._y = b;
    }

    public Point3D(Point3D p) {
        this._x = p.x();
        this._y = p.y();
    }

    /**
     * String constructor
     * @param s
     */
    public Point3D(String s){//"(12,34)"
        s = s.substring(1,s.length()-1);// "12,34" remove brackets
        String[] a = s.split(",");//"12"  "34" remove ","
        _x = Double.parseDouble(a[0]);//12.0
        _y = Double.parseDouble(a[1]);//34.0

    }

    public double x() {
        return _x;
    }

    public double y() {
        return _y;
    }
    public int ix(){
        return (int)_x;
    }
    public int iy(){
        return (int)_y;
    }

    /**
     * generate new point with new x,y
     * @param p
     * @return
     */
    public Point3D add(Point3D p) {
        Point3D a = new Point3D(p.x()+x(),p.y()+this.y());
        return a;
    }
    /**
     * move original point to new x,y
     * @param p
     */
    public void move(Point3D p) {
        this._x += p.x();
        this._y += p.y();
    }
    @Override
    /**
     * transition two double to string
     * from 3 5 to "(3,5)"
     * @return
     */

    public String toString(){
        return "("+_x+","+_y+")";
    }
    public double distance() {
        return this.distance(ORIGIN);
    }
    public double distance(Point3D p3) {
        double dx = this.x() - p3.x();
        double dy = this.y() - p3.y();
        double t = (dx*dx+dy*dy);
        return Math.sqrt(t);
    }
    public static double distance(Point3D p1, Point3D p2) {
        double dx = p1.x() - p2.x();
        double dy = p2.y() - p2.y();
        double t = (dx*dx+dy*dy);
        return Math.sqrt(t);
    }

    public static void main(String[] args) {
        Point3D p1 = new Point3D(3,4);
        Point3D p2 = new Point3D(5,5);
        double a =p1.distance();
        double b =p1.distance(p2);
        System.out.println(a+" "+b);
        Point3D p3 = p1.add(p2);
        System.out.println("p3 is "+p3);
    }



}
