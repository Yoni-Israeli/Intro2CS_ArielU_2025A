package classes.week6;

public class Circle3D {
    private Point3D center = null;
    private double x;
    private double _rad;
    //hi ?dasdsadsa

    public Circle3D(Point3D c, double r){
        center = new Point3D(c);
        this._rad =r;

    }
    public Circle3D(Circle3D c){
        this(c.center,c._rad);
    }
    






}
