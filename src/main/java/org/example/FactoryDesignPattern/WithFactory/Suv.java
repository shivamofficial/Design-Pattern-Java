package org.example.FactoryDesignPattern.WithFactory;

public class Suv implements  Car{
    @Override
    public void drive() {
        System.out.println("Driving a SUV...");
    }
}
