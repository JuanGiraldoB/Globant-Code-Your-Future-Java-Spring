import Entities.Circle;
import Entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5d, 5d);
        Rectangle r = new Rectangle(5d, 5d);

        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());

        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());

    }
}
