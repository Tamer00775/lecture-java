package abstraction;

public class Sedan extends Car {

    public Sedan(String model, String color, String maxSpeed) {
        super(model, color, maxSpeed);
    }
    @Override
    protected void brake() {
        System.out.println("Sedan: brake");
    }

    @Override
    protected void gas() {
        System.out.println("Sedan: gas");
    }
}
