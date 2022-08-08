import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Rectangle());
        shapeList.add(new Circle());
        shapeList.add(new Line());
        shapeList.add(new Triangle());
        shapeList.add(new MyShape());
        shapeList.add(new Point());

        for (Shape shape : shapeList) {
            System.out.println(shape.getName());
        }
    }
}
