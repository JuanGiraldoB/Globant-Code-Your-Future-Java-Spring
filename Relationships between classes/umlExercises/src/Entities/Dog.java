package Entities;

import Enums.Raza;

public class Dog {

    private String name;
    private Raza raza;
    private Integer age;
    private Double size;

    public Dog(String name, Raza raza, Integer age, Double size) {
        this.name = name;
        this.raza = raza;
        this.age = age;
        this.size = size;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", raza=" + raza +
                ", age=" + age +
                ", size=" + size +
                '}';
    }
}
