package ua.hillel.lesson.lesson9.oop.polimorfizm;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Gav");
    }

    public void aboutDog() {
        sayAnimalName("Rex");
        sound();
    }
}
