package org.example.FactoryDesignPattern.WithoutFactory;

public class SUV  implements  Car{

    @Override
    public void drive() {
        System.out.println("Driving an SUV...");
    }
}
