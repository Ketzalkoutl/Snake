import java.awt.event.*;

public class Main {

    dir direction = dir.right;
    Field field = new Field();
    Snake snake = new Snake(field);
    int x = snake.snake.get(snake.snake.size() - 1).getX();
    int y = snake.snake.get(snake.snake.size() - 1).getY();

    public void main(){

        while(true){


        }
    }

    public void move(dir dir) throws Exception {
        switch(dir){
            case down:
                if (direction != dir.up) {
                    y--;
                    direction = dir;
                }
                else
                    y++;
                break;
            case up:
                if (direction != dir.down) {
                    y++;
                    direction = dir;
                }
                else
                    y--;
                break;
            case right:
                if (direction != dir.left) {
                    x++;
                    direction = dir;
                }
                else
                    x--;
                break;
            case left:
                if (direction != dir.right) {
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


    public void eatenFruitCheck(){
        if (!snake.eaten_fruit.isEmpty()){
            Cell temp = snake.eaten_fruit.getFirst();
            if (temp.type == Type.type.VOID) {
                snake.addToTail(temp.getX(), temp.getY(), field);
                snake.eaten_fruit.pop();
            }
        }
    }
}
