import java.util.*;

public class Snake {

    public List<Cell> snake = new LinkedList();
    public ArrayDeque<Cell> eaten_fruit = new ArrayDeque<>();

    Snake(Field field){
        for (int i = 1; i < 5; i++) {
            snake.add(field.field[i][1]);
            field.field[i][1].type = Type.type.SNAKE;
        }
    }



    public void addToTail(int x, int y, Field field){
        snake.add(0, field.field[x][y]);
        snake.get(0).type = Type.type.SNAKE;
    }

    public void addToHead(int x, int y, Field field){
        snake.add(snake.size(), field.field[x][y]);
        snake.get(snake.size() - 1).type = Type.type.SNAKE;
    }

    public void cutTail(Field field){
        snake.get(0).type = Type.type.VOID;
        snake.remove(0);
    }

    public void move(int x, int y, Field field){
        add_to_head(x, y, field);
        cut_tail(field);
    }
}
