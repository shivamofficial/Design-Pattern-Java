package org.example.FactoryDesignPattern.WithFactory;

public class Test2 {
    public static void main(String[] args) {

        Car car1= CarFactory.getCar("sedan");
        car1.drive();


        Car car2= CarFactory.getCar("suv");
        car2.drive();


    }
}


//🧠 Interview Explanation Summary
//        ❌ Before:
//        Used new Sedan() and new SUV() in client
//
//        Tightly coupled → not flexible
//
//        ✅ After:
//        Used CarFactory.getCar("sedan")
//
//        No direct dependency on new
//
//        Easy to update, maintain, and extend

