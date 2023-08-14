package ua.hillel.lesson.lesson12.aboutstatic;

public class CarChanger {
    public static void main(String[] args) {
        int wheelsCount = Car.WHEELS_COUNT;
        System.out.println(wheelsCount);

        Car.myStatic += 20;
        System.out.println(Car.myStatic);

        Car car1 = new Car();
        System.out.println("статическая переменная car1 = " + car1.myStatic);
        car1.nonStatic +=20;
        System.out.println("не статическая переменная car1 = " + car1.nonStatic);

        Car car2 = new Car();
        System.out.println("статическая переменная car1 = " + car2.myStatic);
        System.out.println("не статическая переменная car1 = " + car2.nonStatic);
    }
}
