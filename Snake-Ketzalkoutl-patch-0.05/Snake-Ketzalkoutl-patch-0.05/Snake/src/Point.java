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

    public Point add(Point term){
        return new Point(this.x + term.x, this.y + term.y);
    }
}
