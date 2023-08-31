package Entities.Person;

public abstract class Person {
    protected String name;
    protected Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
