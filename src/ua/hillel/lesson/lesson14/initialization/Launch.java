package ua.hillel.lesson.lesson14.initialization;

public class Launch {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(dog.getAge());
    }
}
