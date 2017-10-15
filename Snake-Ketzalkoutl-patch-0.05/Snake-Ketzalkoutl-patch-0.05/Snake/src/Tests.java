import org.junit.Test;

public class Tests{

    @Test
    public void addToHeadTest(){
        boolean flag = false;
        Field field = new Field();
        Snake snake = new Snake(field);
        snake.addToHead(5, 1, field);

        Cell head = snake.snake.get(snake.snake.size() - 1);
        if (field.field[5][1].type == Type.type.SNAKE && head.getX() == 5 &&
                head.getY() == 1)
            flag = true;

        assert (flag);
    }

    @Test
    public void addToTailTest(){
        boolean flag = false;
        Field field = new Field();
        Snake snake = new Snake(field);
        snake.addToTail(1, 2, field);

        Cell head = snake.snake.get(0);
        if (field.field[1][2].type == Type.type.SNAKE && head.getX() == 1 &&
                head.getY() == 2)
            flag = true;

        assert (flag);
    }

    @Test
    public void cutTailTest(){
        boolean flag = false;
        Field field = new Field();
        Snake snake = new Snake(field);
        snake.cutTail(field);

        Cell head = snake.snake.get(0);
        if (head.getX() == 2 && head.getY() == 1 && field.field[head.getX()][head.getY()].type == Type.type.SNAKE)
            flag = true;

        assert (flag);
    }

    @Test
    public void moveRightTest() throws Exception {
        boolean flag = false;
        Main main = new Main();
        main.move(dir.right);

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
        main.move(dir.left);

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
        main.move(dir.up);

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
        main.move(dir.down);

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
            main.move(dir.right);
            main.eatenFruitCheck();
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
