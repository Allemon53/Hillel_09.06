package ua.hillel.lesson.lesson13.interfaceExample;

public class Taxi {
    public void aboutTaxi(Car car){
        System.out.println("in this car");
        car.getPassenger();
        car.passengerPay();
        car.passengerPlaces();
        car.price();
    }
}
