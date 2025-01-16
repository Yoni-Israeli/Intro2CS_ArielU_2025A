package classes.week6;

/**
 * 1. data values?
 * 2. constructor
 * 3. setters
 * 4. getters
 * 5. functions
 */

public class Point1D {
    private double _x;
    private double _y;

    public Point1D(double a, double b){// constructor
        this._x=a;
        this._y=b;
    }
    public Point1D(){
        this._x = 0;
        this._y = 0;
    }
    public Point1D(Point1D p){// same copy constructor
        this(p._x,p._y);
    }
//    public Point1D(Point1D p){ //same copy constructor
//        this._x = p._x;
//        this._y = p._y;
//    }

    /**
     *
     * @param s "1,5"
     * _x = 1
     * _y = 5
     */
    public Point1D(String s){// s = "1,5"
        String[] a = s.split(",");//  {1,5}
        this._x = Double.parseDouble(a[0]); //1
        this._y = Double.parseDouble(a[1]); //5
    }

    public double Getx() {return this._x;}
    public double Gety() {return this._y;}

    public int GetIx() {return (int)this._x;}
    public int GetIy() {return (int)this._y;}
    public void setx(int x){
        this._x = x;
    }
    public void sety(int y){
        this._y = y;
    }
    public Point1D add(Point1D p) {
        Point1D a = new Point1D(p._x+this.Getx(),p._y+this.Gety());
        return a;
    }
    public void move(Point1D p) {
        this._x = this._x+p.Getx();
        this._y = this._y+p.Gety();
    }

    /**
     * p3 address turn to _x value and _y value
     * @return _x , _y
     */
    @Override
    public String toString()
    {
        return _x+","+_y;
    }

    public static void main(String[] args) {
        Point1D p1 = new Point1D(1,5);
        Point1D p2 = new Point1D(5,5);
        System.out.println(p1);
        Point1D p3 = p1.add(p2);
        System.out.println("p3 is : " +p3);
        Point1D p4 = new Point1D();
        System.out.println(p4);

    }



}
