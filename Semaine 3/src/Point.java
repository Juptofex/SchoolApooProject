public class Point {

    private double x;
    private double y;

    Point(double nX, double nY){
        x = nX;
        y = nY;
    }

    public double getX(){ return x; }

    public void setX(double nX){ x = nX; }

    public double getY(){ return y; }

    public void setY(double nY){ y = nY; }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
