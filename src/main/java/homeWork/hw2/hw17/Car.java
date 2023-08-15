package homeWork.hw2.hw17;

public class Car implements Transport {
    private String brand;
    private String model;
    private int year;
    private int doors;
    public Car(String brand, String model, int year, int numDoors) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doors = numDoors;
    }
    @Override
    public void start() {
        System.out.println("Двигатель автомобиля" + " " + brand + " " + "запущен. У авто" + " " + doors + " " + "двери!");
    }
    @Override
    public void stop() {
        System.out.println("Двигатель автомобиля" + " " + brand + " " + "остановлен.");
    }

}
