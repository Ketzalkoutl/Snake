public class Point {
    private int x;
    private int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(){ this.x = x; }

    public void setY(){ this.y = y; }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Point add(Point arg1, Point arg2){
        return new Point(arg1.x + arg2.x, arg1.y + arg2.y);
    }
    public Point sub(Point arg1, Point arg2){
        return new Point(arg2.x - arg1.x, arg2.y - arg1.y);
    }
}
