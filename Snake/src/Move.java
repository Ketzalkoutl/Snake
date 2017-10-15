import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Move{
    static boolean fruiteIsEaten = false;
    static Point tail;

    public static void move(Field field, Snake snake, dir changeDir) throws Exception{
        Point headCoord = snake.snake.getLast();
        headCoord = headCoord.add(changeDir.getShift());

        if (field.stateCell.containsKey(headCoord) && ((field.stateCell.get(headCoord)).equals(type.wall) ||
                (field.stateCell.get(headCoord)).equals(type.snake)))
            throw new Exception("Snake crashed");

        if(fruiteIsEaten){
            snake.addToTail(tail, field);
            fruiteIsEaten = false;
        }

        System.out.println(field.stateCell.containsKey(headCoord));

        if ((field.stateCell.get(headCoord)).equals(type.fruite)) {
            tail = snake.snake.getFirst();
            fruiteIsEaten = true;
        }

        snake.move(headCoord, field);

    }
}
