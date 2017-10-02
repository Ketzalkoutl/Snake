public class Cell {

    public Type.type type;
    public int x;
    public int y;

    Cell(int x, int y, Type.type type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    Cell(){
        this.x = 0;
        this.y = 0;
        this.type = Type.type.VOID;
    }
}
