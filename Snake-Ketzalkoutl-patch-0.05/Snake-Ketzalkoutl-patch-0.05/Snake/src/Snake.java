import java.util.*;
public class Snake {

    public LinkedList<Point> snake = new LinkedList();

    private dir currentDir;

    public void setCurrentDir(dir direction){
        Point head = snake.getLast();
        head.add(direction.getShift());
        if (head != snake.get(snake.size() - 2));
            currentDir = direction;
    }

    public dir getCurrentDir(){
        return currentDir;
    }


    Snake(Field field){
        for (int x = 1; x < 5; x++) {
            Point point =new Point(x, 1);
            field.stateCell.put(point, type.snake);
            snake.add(point);
        }
    }



    public void addToTail(Point point, Field field){
        snake.addFirst(point);
        field.stateCell.put(point, type.snake);
    }

    public void addToHead(Point point, Field field){
        snake.addLast(point);
        field.stateCell.put(point, type.snake);
    }

    public void cutTail(Field field){
        field.stateCell.remove(snake.getFirst());
        snake.removeFirst();
    }

    public void move(Point point, Field field){
        addToHead(point, field);
        cutTail(field);
    }
}
