package Entities;

public class Animal {
    protected String name;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String name, String alimento, Integer edad, String raza) {
        this.name = name;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void feed(){
        System.out.println("Feeding");
    }
}
