package main.Services;

import main.Entities.Dog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class DogService {

    private ArrayList<Dog> dogs;
    private final Scanner scan;

    public DogService() {
        this.dogs = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }

    public Dog createDog() {
        System.out.print("Name: ");
        String name = scan.next();

        System.out.print("Race: ");
        String race = scan.next();

        return new Dog(name, race);
    }

    public void printRaces() {
        dogs.forEach((dog) -> System.out.println(dog));
    }

    public boolean deleteDog(String race) {
        Iterator<Dog> iterator = dogs.iterator();

        while (iterator.hasNext()) {
            if (race.equalsIgnoreCase(iterator.next().getRace())) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public void sortByRace() {
        dogs.sort(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getRace().compareTo(o2.getRace());
            }
        });
    }

    public void addDog(Dog dog) {
        this.dogs.add(dog);
    }
}
