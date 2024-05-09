package interfaces;

public interface Shape {
    double calculateArea();

    double calculatePerimeter();

    default String print() {
        return "Area: " + calculateArea() + "\n" +
                "Perimeter: " + calculatePerimeter();
    }
}
