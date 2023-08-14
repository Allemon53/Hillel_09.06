package ua.hillel.lesson.lesson9.oop.incapsulation.specific;

public class Specification {
    private String fuel = "Diesel";
    private String type;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void chooseCar() {
        if (this.fuel.equalsIgnoreCase("Diesel") && this.type.equalsIgnoreCase("Car")) {
            System.out.println("Renault");
        } else {
            System.out.println("Skoda");
        }
    }
}
