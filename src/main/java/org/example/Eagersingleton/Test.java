package org.example.Eagersingleton;

import org.example.Eagersingleton.Testing;

public class Test{

    private static final Testing testing= Testing.getInstance();
    public static void main(String[] args) {
        System.out.println("Program start");


        System.out.println("End of program");
    }
}
