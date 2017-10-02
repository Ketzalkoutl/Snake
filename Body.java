public class Body {

    public Cell cell;
    public Body next;

    Body(Cell cell, Body next){
        this.cell = cell;
        this.next = next;
    }

    Body(Cell cell){
        this.cell = cell;
        this.next = null;
    }
}
