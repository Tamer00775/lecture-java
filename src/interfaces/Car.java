package interfaces;

public interface Car {
    void start() ;

    default void stop() {
        System.out.println("stop!");
        brake();
    }

    private void brake() {
        System.out.println("brake");
    }
}
