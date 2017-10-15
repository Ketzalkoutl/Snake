import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Field {

    private int size;
    public int getSize(){
        return size;
    }

    public Map<Point, type> stateCell = new HashMap<Point, type>();

    Field(){
        for (int x =0; x<size; x++){
            stateCell.put(new Point(x, 0), type.wall);
            stateCell.put(new Point(x, size-1), type.wall);
        }

        for (int y =0; y<size; y++){
            stateCell.put(new Point(0, y), type.wall);
            stateCell.put(new Point(size-1,y), type.wall);
        }
    }

}
