import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Move{

    static boolean eatenFruit;
    static Point tail;

    public static void move(Field field, Snake snake, dir changeDir) throws Exception{
        Point headCoord = snake.snake.getLast();
        headCoord.add(changeDir.getShift());

        if ((field.stateCell.get(headCoord)).equals(type.wall) ||
                (field.stateCell.get(headCoord)).equals(type.snake))
            throw new Exception("Snake crashed");

        if (eatenFruit){
            snake.addToTail(tail, field);
            eatenFruit = false;
        }

        if ((field.stateCell.get(headCoord)).equals(type.fruite)) {
            tail = snake.snake.getFirst();
            eatenFruit = true;
        }

        snake.move(headCoord, field);
    }
}
