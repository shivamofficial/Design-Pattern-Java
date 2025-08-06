package org.example.LazySingleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Constructor called by " + Thread.currentThread().getName());
    }

    //public static LazySingleton getInstance() { ---issue thread create multiple instance
    public static synchronized LazySingleton getInstance(){ // race condition handle
        if (instance == null) {  // 👈 possible race condition
            instance = new LazySingleton();
        }
        return instance;
    }
}
