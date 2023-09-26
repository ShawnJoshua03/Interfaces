import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(1, 5));
        rectangles.add(new Rectangle(2, 9));
        rectangles.add(new Rectangle(3, 1));
        rectangles.add(new Rectangle(1, 8));
        rectangles.add(new Rectangle(2, 4));
        rectangles.add(new Rectangle(3, 6));
        rectangles.add(new Rectangle(3, 1));


        Object[] bigRectangles = Utility.collectAll(rectangles.toArray(), new BigRectangleFilter());
        for (Object rect : bigRectangles) {
            Rectangle rectangle = (Rectangle) rect;
            System.out.println("Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
        }
    }
}
