package org.example.AbstractFactoryPattern;

public class IphoneFactory implements Phonefactory{
    @Override
    public Processor createprocessor() {
        return new IphoneProcessor();
    }

    @Override
    public Display createDisplay() {
        return new IphoneScreen();
    }
}
