package Entities;

public class Horse extends Animal{
    public Horse(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void feed(){
        System.out.println("Horse is being fed");
    }
}
