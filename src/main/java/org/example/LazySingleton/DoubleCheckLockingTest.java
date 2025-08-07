package org.example.LazySingleton;

public class DoubleCheckLockingTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            DoubleCheckLocking singleton = DoubleCheckLocking.getInstance();
            System.out.println("Instance hashcode from "
                    + Thread.currentThread().getName() + ": "
                    + singleton.hashCode());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
//same instance for both thread
//Instance hashcode from Thread-1: 993823496
//        Instance hashcode from Thread-2: 993823496


