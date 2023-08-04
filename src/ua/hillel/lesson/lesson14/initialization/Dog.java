package ua.hillel.lesson.lesson14.initialization;

public class Dog {
    private String name;
    private String breed;
    private int age;

    {
        name = "Rex";
        breed = "Putin";
        age = 80;
    }

    public Dog() {

    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}