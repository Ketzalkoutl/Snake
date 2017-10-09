import org.junit.Test;

public class Tests{

    @Test
    public void addToHeadTest(){
        boolean flag = false;
        Field field = new Field();
        Snake snake = new Snake(field);
        snake.add_to_head(5, 1, field);

        if (field.field[5][1].type == Type.type.SNAKE && snake.snake.get(snake.snake.size() - 1).getX() == 5 &&
                snake.snake.get(snake.snake.size() - 1).getY() == 1)
            flag = true;

        assert (flag);
    }

    @Test
    public void addToTailTest(){
        boolean flag = false;
        Field field = new Field();
        Snake snake = new Snake(field);
        snake.add_to_tail(1, 2, field);

        if (field.field[1][2].type == Type.type.SNAKE && snake.snake.get(0).getX() == 1 &&
                snake.snake.get(0).getY() == 2)
            flag = true;

        assert (flag);
    }

    @Test
    public void cutTailTest(){
        boolean flag = false;
        Field field = new Field();
        Snake snake = new Snake(field);
        snake.cut_tail(field);

        int x = snake.snake.get(0).getX();
        int y = snake.snake.get(0).getY();
        if (x == 2 && y == 1 && field.field[x][y].type == Type.type.SNAKE)
            flag = true;

        assert (flag);
    }

    @Test
    public void moveRightTest() throws Exception {
        boolean flag = false;
        Main main = new Main();
        main.move(Direction.dir.RIGTH);

        Cell head = main.snake.snake.get(main.snake.snake.size() - 1);
        if (main.field.field[5][1].type == Type.type.SNAKE && head.getX() == 5 &&
                head.getY() == 1)
            flag = true;

        assert (flag);
    }

    @Test
    public void moveLeftTest() throws Exception {
        boolean flag = false;
        Main main = new Main();
        main.move(Direction.dir.LEFT);

        Cell head = main.snake.snake.get(main.snake.snake.size() - 1);
        if (main.field.field[5][1].type == Type.type.SNAKE && head.getX() == 5 &&
                head.getY() == 1)
            flag = true;

        assert (flag);
    }

    @Test
    public void moveUpTest() throws Exception {
        boolean flag = false;
        Main main = new Main();
        main.move(Direction.dir.UP);

        Cell head = main.snake.snake.get(main.snake.snake.size() - 1);
        if (main.field.field[4][2].type == Type.type.SNAKE && head.getX() == 4 &&
                head.getY() == 2)
            flag = true;

        assert (flag);
    }

    @Test(expected = Exception.class)
    public void moveDownTest() throws Exception {
        boolean flag = false;
        Main main = new Main();
        main.move(Direction.dir.DOWN);

        Cell head = main.snake.snake.get(main.snake.snake.size() - 1);
        if (head.getX() == 4 && head.getY() == 1 &&
                main.field.field[4][1].type == Type.type.WALL)
            flag = true;

        assert (flag);
    }

    @Test
    public void fruitEatTest() throws Exception{
        boolean flag = false;
        Main main = new Main();
        main.field.field[5][1].type = Type.type.FRUIT;

        for (int i = 0;i<5;i++) {
            main.move(Direction.dir.RIGTH);
            main.eaten_fruit_check();
        }

        Cell head = main.snake.snake.get(main.snake.snake.size() - 1);
        Cell tail = main.snake.snake.get(0);
        if(main.field.field[9][1].type == Type.type.SNAKE &&
                main.field.field[5][1].type == Type.type.SNAKE &&
                head.getX() == 9 && head.getY() == 1 &&
                tail.getX() == 5 && tail.getY() == 1)
            flag = true;
        assert(flag);

    }

}
