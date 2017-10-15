import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Move{

    public void move(Map<Point, type> field, LinkedList<Point> snake, dir changeDir) throws Exception{
        Point headCoord = snake.getLast();
        headCoord.add(changeDir.getShift());

        if (field.containsKey(headCoord) && (field.get(headCoord)).equals(type.wall) &&
                (field.get(headCoord)).equals(type.snake))
            throw new Exception("Snake crashed");

        if (field.containsKey(headCoord) && (field.get(headCoord)).equals(type.fruite)) {
            snake.addLast(headCoord);
            field.replace(headCoord, type.snake);
        }

    }
}
