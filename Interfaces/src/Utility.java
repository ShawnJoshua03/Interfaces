import java.util.ArrayList;

public class Utility {
    public static Object[] collectAll(Object[] objects, Filter filter) {
        ArrayList<Object> acceptedObjects = new ArrayList<>();
        for (Object obj : objects) {
            if (filter.accept(obj)) {
                acceptedObjects.add(obj);
            }
        }
        return acceptedObjects.toArray();
    }
}