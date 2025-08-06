package org.example.LazySingleton;

public class Testing {
private static Testing instance;

    private Testing() {
        System.out.println("call during class load");
    }

    public static Testing getInstance() {
        if (instance == null) {
            instance = new Testing();
        }
        return instance;
    }

    public void log() {
        System.out.println("logEntry");
    }
}
