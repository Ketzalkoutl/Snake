public class Point {
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        x = value;
    }

    public void setY(int value){
        y = value;
    }

    public Point add(Point term1, Point term2){
        return new Point(term1.getX() + term2.getX(), term1.getY() + term2.getY());
    }

    public Point sub(Point minuend, Point subtrahed){
        return new Point(minuend.getX() + subtrahed.getX(), minuend.getY() + subtrahed.getY());
    }
}
