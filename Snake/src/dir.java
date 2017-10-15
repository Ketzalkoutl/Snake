public enum dir {
    up (new Point(0,1)),
    right (new Point(1,0)),
    left(new Point(-1,0)),
    down(new Point(0,-1));

    private final Point shift;

    dir(Point point){
        shift = point;
    }

    public Point getShift(){
        return shift;
    }

}
