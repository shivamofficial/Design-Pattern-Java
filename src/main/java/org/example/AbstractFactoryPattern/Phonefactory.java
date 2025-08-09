package org.example.AbstractFactoryPattern;

public interface Phonefactory {

    Processor createprocessor();
    Display createDisplay();

    //🧠 This is the Abstract Factory — it defines methods to create related products.


}
