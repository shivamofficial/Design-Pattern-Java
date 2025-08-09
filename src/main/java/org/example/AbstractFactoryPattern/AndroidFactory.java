package org.example.AbstractFactoryPattern;

public class AndroidFactory implements  Phonefactory{
    @Override
    public Processor createprocessor() {
        return new AndroidProcessor();

    }

    @Override
    public Display createDisplay() {
        return new AndoidScreen();
    }
}
