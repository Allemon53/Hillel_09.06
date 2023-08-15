package ua.hillel.lesson.lesson13.abstractExample;

public class CarControler {
    public void aboutCar(Car car){
        System.out.println(car.maxSpeed());
        car.drive();
        car.brake();

    }
}
