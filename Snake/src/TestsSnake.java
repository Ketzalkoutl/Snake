import org.junit.Test;
import org.junit.Before;
import static junit.framework.Assert.assertEquals;

public class TestsSnake{
    private Field field;
    private Snake snake;

    @Before
    public void init()
    {
        field = new Field();
        snake = new Snake(field);
    }
    @Test
    public void addToTailTest(){
        Point addedPoint = new Point(1,2);
        snake.addToTail(addedPoint, field);
        assertEquals(addedPoint, snake.snake.getFirst());
        assertEquals(field.stateCell.get(addedPoint), type.snake);
    }

    @Test
    public void addToHeadTest(){
        Point addedPoint = new Point(5,1);
        snake.addToHead(addedPoint, field);
        assertEquals(addedPoint, snake.snake.getLast());
        assertEquals(field.stateCell.get(addedPoint), type.snake);
    }

    @Test
    public void cutToTailTest(){
        Point delPoint = snake.snake.getFirst();
        snake.cutTail(field);
        assertEquals(false, field.stateCell.containsKey(delPoint));
        assertEquals(false, snake.snake.contains(delPoint));
    }

    }

