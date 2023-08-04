package ua.hillel.lesson.lesson13.abstractExample;

public class Bmw extends Car{

    @Override
    protected String maxSpeed() {
        return "300";
    }

    @Override
    void drive() {
        System.out.print("BMW drive");

    }

    @Override
    void brake() {
        System.out.println("BMW brake");

    }

    @Override
    void repair() {

    }
}
