package org.example.LazySingleton;

public class BillPluginTest {

    public static void main(String[] args) {

        Runnable task = () ->
        {
            BillPughSingleton singleton=  BillPughSingleton.getInstance();
            System.out.println("Instance hashcode from "
                    + Thread.currentThread().getName() + ": "
                    + singleton.hashCode());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

// same instance all three thread

//    Constructor called by Thread-1
//        Instance hashcode from Thread-2: 236981448
//        Instance hashcode from Thread-1: 236981448
//        Instance hashcode from Thread-3: 236981448