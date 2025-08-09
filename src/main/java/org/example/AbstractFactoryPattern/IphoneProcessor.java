package org.example.AbstractFactoryPattern;

public class IphoneProcessor implements Processor{
    @Override
    public void process() {
        System.out.println("Apple processor working");
    }
}
