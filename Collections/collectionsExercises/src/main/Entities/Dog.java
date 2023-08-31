package main.Entities;

import java.util.Comparator;

public class Dog {

    private String name;
    private String race;

    public Dog(String name, String race) {
        this.name = name;
        this.race = race;
    }

//    public static Comparator<Dog> sortByRace = new Comparator<Dog>() {
//        @Override
//        public int compare(Dog o1, Dog o2) {
//            return o1.getRace().compareTo(o2.getRace());
//        }
//    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
