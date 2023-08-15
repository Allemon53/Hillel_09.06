package ua.hillel.lesson.lesson9.oop.polimorfizm;

public class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Myyyy");
    }

    public void aboutCow() {
        sayAnimalName("butionka");
        sound();
    }
}
