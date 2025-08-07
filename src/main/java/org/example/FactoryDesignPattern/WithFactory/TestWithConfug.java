package org.example.FactoryDesignPattern.WithFactory;

public class TestWithConfug {
    public static void main(String[] args) {
        try {
            Car car = CarFactoryWithConfig.getCarFromConfig();
            car.drive();  // Output based on config
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
