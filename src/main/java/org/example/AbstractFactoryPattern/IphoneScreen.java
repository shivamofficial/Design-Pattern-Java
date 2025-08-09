package org.example.AbstractFactoryPattern;

public class IphoneScreen implements Display{
    @Override
    public void screen() {
        System.out.println("Apple screen displaying");
    }
}
