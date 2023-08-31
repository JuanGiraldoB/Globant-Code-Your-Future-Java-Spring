package Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Shelter {
    private final HashSet<Dog> dogs;
    private final ArrayList<HashMap<String,Dog>> adoptedDogs;


    public Shelter() {
        dogs = new HashSet<>();
        adoptedDogs = new ArrayList<HashMap<String,Dog>>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public Dog getDogByName(String dogName) {
        Iterator<Dog> iterator = dogs.iterator();

        while(iterator.hasNext()) {

            Dog dog = iterator.next();

            if (dog.getName().equalsIgnoreCase(dogName)) {
                iterator.remove();
                return dog;
            }
        }

        return null;
    }

    public void adoptDog(Person person, Dog dog) {
        HashMap<String, Dog> adoption = new HashMap<String,Dog>();
        adoption.put(person.getName(), dog);
        adoptedDogs.add(adoption);
    }

    public void printAdoptedDogs() {
        adoptedDogs.forEach(System.out::println);
    }

    public void printDogsInShelter() {
        dogs.forEach(System.out::println);
    }



}
