import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Field {

    private int size = 20;

    public int getSize() {
        return size;
    }

    public Map<Point, MapObject> stateCell = new HashMap<Point, MapObject>();

    public Field() {
        for (int x = 0; x < size; x++) {
            stateCell.put(new Point(x, 0), new Wall());
            stateCell.put(new Point(x, size - 1), new Wall());
        }

        for (int y = 0; y < size; y++) {
            stateCell.put(new Point(0, y), new Wall());
            stateCell.put(new Point(size - 1, y), new Wall());
        }
    }

    public Field(int size) {
        for (int x = 0; x < size; x++) {
            stateCell.put(new Point(x, 0), new Wall());
            stateCell.put(new Point(x, size - 1), new Wall());
        }

        for (int y = 0; y < size; y++) {
            stateCell.put(new Point(0, y), new Wall());
            stateCell.put(new Point(size - 1, y), new Wall());
        }
    }

    public void addRandomFruit(Snake snake) {

        boolean pointInStateCell  = true;

        do {
            Point newRandomPoint = getRandomPointInSize();
            if (!(stateCell.containsKey(newRandomPoint) && snake.objectSearch(newRandomPoint) == null)) {
                stateCell.put(newRandomPoint, new Fruit());
                pointInStateCell  = false;
            }

            if (snake.snake.size() + stateCell.size() == size * size)
                pointInStateCell  = false;

        } while (pointInStateCell );
    }

    public Point getRandomPointInSize() {
        Random random = new Random();
        return new Point(random.nextInt(size), random.nextInt(size));
    }

}
