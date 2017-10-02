import java.util.*;

public class Snake {

    public List<Cell> snake = new LinkedList();
    public ArrayDeque<Cell> eaten_fruit = new ArrayDeque<>();

    Snake(Field field){
        for (int i = 1; i < 5; i++)
            snake.add(field.field[i][1]);
    }

    public void add_to_tail(int x, int y, Field field){
        snake.add(field.field[x][y]);
        snake.get(0).type = Type.type.SNAKE;
    }

    public void add_to_head(int x, int y, Field field){
        snake.add(snake.size() - 1, field.field[x][y]);
        snake.get(snake.size()).type = Type.type.SNAKE;
    }

    public void cut_tail(Field field){
        snake.remove(0).type = Type.type.VOID;
    }

    public void move(int x, int y, Field field){
        add_to_head(x, y, field);
        cut_tail(field);
    }
}
