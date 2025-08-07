package org.example.FactoryDesignPattern.WithoutFactory;

public class Test1 {

    public static void main(String[] args) {
        Car car1= new SUV();
        car1.drive();

        Car car2= new Sedan();
        car2.drive();
    }
}

//❌ Problem:
//        Code is dependent on exact classes (Sedan, SUV)
//
//        If tomorrow Sedan is renamed or logic changes, you must update everywhere
//
//        Hard to mock/test or switch implementation