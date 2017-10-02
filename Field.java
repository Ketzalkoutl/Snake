public class Field {

    int size;
    Cell[][] field = new Cell[size][size];

    Field() {
        this.size = 30;
        for (int i = 1; i < size - 1; i++)
            for (int j = 1; j < size - 1; j++)
                field[i][j] = new Cell(i, j, Type.type.VOID);

        for (int i = 0; i < size; i++) {
            field[i][0] = new Cell(i, 0, Type.type.WALL);
            field[i][size - 1] = new Cell(i, size - 1, Type.type.WALL);
        }

        for (int j = 1; j < size - 1; j++) {
            field[0][j] = new Cell(0, j, Type.type.WALL);
            field[size - 1][j] = new Cell(size - 1, j, Type.type.WALL);
        }
    }

    public void change_cell(int height, int width, Type.type type) {
        field[height][width].type = type;
    }
}
