package main;

import main.Entities.Dog;
import main.Services.DogService;

import java.util.Scanner;

public class Main1to2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DogService ds = new DogService();

        String ch;

        do {
            Dog dog = ds.createDog();
            ds.addDog(dog);
            System.out.println("Ingresar mas? (Y/N)");

            ch = scan.next();
        } while (ch.charAt(0) == 'y');

        boolean found = ds.deleteDog("b");

        if (!found) {
            System.out.println("Dog not on list");
        }

        ds.sortByRace();
        ds.printRaces();


//
//        Iterator iterator = dogs.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

    }
}