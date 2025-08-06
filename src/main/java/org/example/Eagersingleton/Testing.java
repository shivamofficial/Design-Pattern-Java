package org.example.Eagersingleton;

public class Testing {
    private static final Testing instance = new Testing();

    private Testing() {
        System.out.println("call during class load");
    }

    public static Testing getInstance() {
        return instance;
    }

    public void log() {
        System.out.println("logEntry");
    }
}
