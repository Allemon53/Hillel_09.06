package ua.hillel.lesson.lesson10.superwithconstructor;

public class A {
    int value;

    public A() {
    }

    public A(int value) {
        System.out.println("Метод построения A c параметром " + value);
        this.value = value;
    }

    public void sayHello() {
        System.out.println("Hello " + this.value);
    }
}
