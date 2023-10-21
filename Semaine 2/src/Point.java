public class Point {

    private int x;
    private int y;

    Point( int nX, int nY){
        x = nX;
        y = nY;
    }

    public int getX(){ return x; }

    public void setX(int nX){ x = nX; }

    public int getY(){ return y; }

    public void setY(int nY){ y = nY; }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
