package homeWork.hw2.hw17;

public class Bicycle implements Transport {
    private String brand;
    private String model;
    private int year;
    private int pedals;
    public Bicycle(String brand, String model, int year, int numPedals) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pedals = numPedals;
    }
    @Override
    public void start() {
        System.out.println("Поездка на велосипеде" + " " + brand + " " + "началась. У велосипеда" + " " + pedals + " " + "педали.");
    }
    @Override
    public void stop() {
        System.out.println("Поездка на велосипеде" + " " + brand + " " + "завершена.");
    }
}
