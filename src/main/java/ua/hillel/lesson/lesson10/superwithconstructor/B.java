package ua.hillel.lesson.lesson10.superwithconstructor;

public class B extends A {
    public B() {
        super(199);
        System.out.println("B - Метод построения без параметров");
    }

    public B(int value) {
        super(134);
        System.out.println("Метод построения B c параметром " + value);
    }

    public void test() {
        sayHello();

    }
}
