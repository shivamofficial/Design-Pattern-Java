package org.example.FactoryDesignPattern.WithFactory;

public class CarFactory {

    public static Car getCar(String type)
    {
        if(type.equalsIgnoreCase("Sedan"))
        {
            return new Sedan();
        } else if (type.equalsIgnoreCase("Suv")) {
            return new Suv();
            
        }
        else {
            throw new IllegalArgumentException("Unknow car type" +type);
        }
    }
}
