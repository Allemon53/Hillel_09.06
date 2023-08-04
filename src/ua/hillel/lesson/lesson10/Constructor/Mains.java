package ua.hillel.lesson.lesson10.Constructor;

public class Mains {
    public static void main(String[] args) {
        Animals animals = new Animals("Cat", "2" );
        animals.sayAge();
        animals.sayName();

        Animals animals1 = new Animals();
        animals1.sayHello();
    }
}
