package ua.hillel.lesson.lesson13.abstractExample;

import ua.hillel.lesson.lesson10.thisExample.B;

public class Launch {
    public static void main(String[] args) {
    CarControler carControler = new CarControler();
    Bmw bmw = new Bmw();
    carControler.aboutCar(bmw);
    }
}
