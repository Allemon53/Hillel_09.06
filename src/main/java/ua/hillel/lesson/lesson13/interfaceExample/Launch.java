package ua.hillel.lesson.lesson13.interfaceExample;

public class Launch {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Taxi taxi=new Taxi();
        taxi.aboutTaxi(toyota);
    }
}
