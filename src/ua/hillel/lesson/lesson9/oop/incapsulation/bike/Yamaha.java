package ua.hillel.lesson.lesson9.oop.incapsulation.bike;

import ua.hillel.lesson.lesson9.oop.incapsulation.specific.Specification;

public class Yamaha {
    public static void main(String[] args) {
        Specification specification = new Specification();
        specification.setFuel("Petrol");
        System.out.println(specification.getFuel());

        Specification specification2 = new Specification();
        System.out.println(specification2.getFuel());

    }
}
