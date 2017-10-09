import java.awt.event.*;

public class Main {

    Direction.dir direction = Direction.dir.RIGTH;
    Field field = new Field();
    Snake snake = new Snake(field);
    int x = snake.snake.get(snake.snake.size() - 1).getX();
    int y = snake.snake.get(snake.snake.size() - 1).getY();

    public void main(){

        while(true){


        }
    }

    public void move(Direction.dir dir) throws Exception {
        switch(dir){
            case DOWN:
                if (direction != Direction.dir.UP) {
                    y--;
                    direction = dir;
                }
                else
                    y++;
                break;
            case UP:
                if (direction != Direction.dir.DOWN) {
                    y++;
                    direction = dir;
                }
                else
                    y--;
                break;
            case RIGTH:
                if (direction != Direction.dir.LEFT) {
                    x++;
                    direction = dir;
                }
                else
                    x--;
                break;
            case LEFT:
                if (direction != Direction.dir.RIGTH) {
                    x--;
                    direction = dir;
                }
                else
                    x++;
                break;
        }

        if (field.field[x][y].type == Type.type.WALL || field.field[x][y].type == Type.type.SNAKE)
            throw new Exception("Zmeya vrezalas'");

        if (field.field[x][y].type == Type.type.FRUIT)
            snake.eaten_fruit.add(field.field[x][y]);

        snake.move(x, y, field);
    }


    public void eaten_fruit_check(){
        if (!snake.eaten_fruit.isEmpty()){
            Cell temp = snake.eaten_fruit.getFirst();
            if (temp.type == Type.type.VOID) {
                snake.add_to_tail(temp.getX(), temp.getY(), field);
                snake.eaten_fruit.pop();
            }
        }
    }
}
