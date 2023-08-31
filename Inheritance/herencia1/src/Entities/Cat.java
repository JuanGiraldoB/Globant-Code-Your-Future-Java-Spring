package Entities;

public class Cat extends Animal{
    public Cat(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void feed(){
        System.out.println("Cat is being fed");
    }
}
