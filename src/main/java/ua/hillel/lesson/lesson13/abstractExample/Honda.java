package ua.hillel.lesson.lesson13.abstractExample;

public class Honda extends Car {
    @Override
    protected String maxSpeed() {
        return "200";
    }

    @Override
    void drive() {
        System.out.println("Honda drive");

    }

    @Override
    void brake() {
        System.out.println("Honda brake");

    }

    @Override
    void repair() {

    }
}
