public class Main {

    Direction.dir direction = Direction.dir.RIGTH;
    Field field = new Field();
    Snake snake = new Snake(field);
    int x = snake.snake.get(snake.snake.size() - 1).x;
    int y = snake.snake.get(snake.snake.size() - 1).y;

    public void Game(){

        while(true){


        }
    }

    public void move(){
        switch(direction){
            case DOWN:
                y--;
                break;
            case UP:
                y++;
                break;
            case RIGTH:
                x++;
                break;
            case LEFT:
                x--;
                break;
        }

        if (field.field[x][y].type == Type.type.WALL || field.field[x][y].type == Type.type.SNAKE)
            GAMEOVER();

        if (field.field[x][y].type == Type.type.FRUIT)
            snake.eaten_fruit.add(field.field[x][y]);

        snake.move(x, y, field);
    }

    public void GAMEOVER(){

    }

    public void eaten_fruit_check(){
        if (!snake.eaten_fruit.isEmpty() && snake.eaten_fruit.getFirst().type)
    }
}
