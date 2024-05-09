package interfaces;

public class Toyota implements Car{
    @Override
    public void start() {
        System.out.println("started");
    }

    @Override
    public void stop() {
        Car.super.stop();
    }
}
