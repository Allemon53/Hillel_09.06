package ua.hillel.lesson.lesson10.Constructor.explicit;

import ua.hillel.lesson.lesson10.Constructor.implicit.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayName();
        animal.sayAge();

        Animal animal2 = new Animal();
        animal2.sayHello();

    }
}
