package ua.hillel.lesson.lesson10.Constructor.explicit;

public class Animal {
    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    private String name;
    private String age;

    void sayHello() {
        System.out.println("Hello");
    }

    void sayName() {
        System.out.println(this.name);
    }

    void sayAge() {
        System.out.println(this.age);
    }
}