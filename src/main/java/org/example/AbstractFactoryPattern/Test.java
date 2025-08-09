package org.example.AbstractFactoryPattern;

public class Test {

    public static void main(String[] args) {

        Phonefactory factory= new AndroidFactory();

        Processor processor=factory.createprocessor();
        Display display=factory.createDisplay();

        processor.process();
        display.screen();
    }
}

//without abstract code
//// Direct object creation – tightly coupled
//        Processor processor = new AndroidProcessor();
//        Screen screen = new AndroidScreen();