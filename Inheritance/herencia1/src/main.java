import Entities.Animal;
import Entities.Cat;
import Entities.Dog;
import Entities.Horse;

public class main {
    public static void main(String[] args) {
        Animal p1 = new Dog("a", "b", 13, "c");
        p1.feed();

        Animal p2 = new Cat("a", "b", 13, "c");
        p2.feed();

        Animal p3 = new Horse("a", "b", 13, "c");
        p3.feed();

    }
}
