package Entities;

public class Dog extends Animal{

    public Dog(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void feed(){
        System.out.println("Dog is being fed");
    }
}
