package org.example.FactoryDesignPattern.WithFactory;

import org.example.FactoryDesignPattern.WithoutFactory.SUV;

import java.io.FileInputStream;
import java.util.Properties;

public class CarFactoryWithConfig {

    public static Car getCarFromConfig() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));  // Load config file

        String type = props.getProperty("car.type");

        if ("sedan".equalsIgnoreCase(type)) {
            return new Sedan();
        } else if ("suv".equalsIgnoreCase(type)) {
            return new Suv();
        } else {
            throw new IllegalArgumentException("Invalid car type in config");
        }
    }

}