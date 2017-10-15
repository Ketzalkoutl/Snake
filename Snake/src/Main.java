

public class Main {


    static dir direction = dir.right;
    static Field field = new Field();
    static Snake snake = new Snake(field);


    public static void main(String[] args) {
        while (true)
        {
            snake.setCurrentDir(direction);
            try {
                Move.move(field, snake, direction);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}