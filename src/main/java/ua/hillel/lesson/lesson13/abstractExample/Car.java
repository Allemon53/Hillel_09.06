package ua.hillel.lesson.lesson13.abstractExample;

public abstract class Car {

    protected abstract String maxSpeed();
    abstract void drive();
    abstract void brake();

    abstract void repair();

    void countWheels(){

        System.out.println("4");
    }
}
