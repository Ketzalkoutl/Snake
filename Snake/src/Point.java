public class Point {
    private int x;
    private int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){ this.x = x; }

    public void setY(int y){ this.y = y; }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object obj){

        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if(!(getClass() == obj.getClass()))
            return false;
        else {
            Point tempPoint = (Point)obj;
            if (this.x == tempPoint.getX() && this.y == tempPoint.getY())
                return true;
            return false;
        }
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        return this.x * prime + this.y * prime * prime;
    }

    public Point add(Point term){
        return new Point(this.x + term.x, this.y + term.y);
    }
}
