package ua.hillel.lesson.lesson12.aboutstatic;

import ua.hillel.lesson.lesson12.aboutstatic.Cat;

public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.name);
        sayHello();

    }

    public static void sayHello() {
        System.out.println("Hello world");
        Cat.aboutCat();
    }

    public void sayAge() {
        sayHello();
    }
}
