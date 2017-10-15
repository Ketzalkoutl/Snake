import org.junit.Test;
import org.junit.Before;
import static junit.framework.Assert.assertEquals;

public class TestsMove {
    private Field field;
    private Snake snake;
    private dir direction;

    @Before
    public void init() {
        field = new Field();
        snake = new Snake(field);

    }

    @Test(expected = Exception.class)
    public void MoveToWallTest() throws Exception {
        Move.move(field, snake, dir.down);
    }

    @Test(expected = Exception.class)
    public void MoveToSnakeTest() throws Exception {
        Move.move(field, snake, dir.left);
        assertEquals(snake.snake.getFirst().getX(), 2);
        assertEquals(snake.snake.getFirst().getY(), 1);
        assertEquals(snake.snake.getLast().getX(), 5);
        assertEquals(snake.snake.getLast().getY(), 1);
    }

    @Test
    public  void  MoveToFruiteTest() throws Exception{
        field.stateCell.put(new Point(5,1), type.fruite);
        Move.move(field,snake,dir.right);
        Move.move(field,snake,dir.right);
        assertEquals(5,snake.snake.size());

    }
}
