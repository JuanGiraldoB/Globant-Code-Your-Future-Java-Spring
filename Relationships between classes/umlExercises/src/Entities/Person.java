package Entities;

public class Person {

    private String name;
    private String lastName;
    private Integer age;
    private String id;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastName, Integer age, String id, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ",\n dog=" + dog +
                '}';
    }
}
