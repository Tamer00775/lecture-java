package abstraction;

public class Main {
    public static void main(String[] args) {
        Car car = new Sedan("Toyota", "black", "230");
        car.gas();
        car.brake();;
        car.setColor("white");
    }
}
