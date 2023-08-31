import Entities.Dog;
import Entities.Person;
import Entities.Shelter;
import Enums.Raza;

public class Main {
    public static void main(String[] args) {
        Dog rocket = new Dog("Rocket", Raza.CHANDA, 1, 30D);
        Person juan = new Person("Juan", "Giraldo", 25, "1053866284", rocket);

        Shelter shelter = new Shelter();

        shelter.addDog(rocket);
        shelter.printDogsInShelter();

        Dog dogToAdopt = shelter.getDogByName("Rocket");

        shelter.printDogsInShelter();

        shelter.adoptDog(juan, dogToAdopt);
        shelter.printAdoptedDogs();
    }
}