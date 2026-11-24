package Abstraction;

public class Lexus extends Car{

    public Lexus(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public String gas() {
        return "Gas";
    }

    @Override
    public String brake() {
        return "Breke";
    }
}
