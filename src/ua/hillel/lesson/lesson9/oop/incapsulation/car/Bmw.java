package ua.hillel.lesson.lesson9.oop.incapsulation.car;

import ua.hillel.lesson.lesson9.oop.incapsulation.specific.Specification;

public class Bmw {
    public static void main(String[] args) {
        Specification specification = new Specification();
        specification.color();
        System.out.println(specification.fuel);
    }
}
