package org.example.LazySingleton;

public class LazyThreadTest {
    public static void main(String[] args) {

        Runnable task =() ->{
            LazySingleton singleton= LazySingleton.getInstance();
            System.out.println("Instance hashcode from " + Thread.currentThread().getName()+": " + singleton.hashCode());
        };

        Thread t1= new Thread(task,"thread-1");
        Thread t2= new Thread(task,"thread-2");

        t1.start();
        t2.start();
    }
}

//output
//    Constructor called by thread-1
//        Constructor called by thread-2
//        Instance hashcode from thread-2: 1987980877
//        Instance hashcode from thread-1: 1794927165
//        That’s the exact race condition problem I wanted you to catch.
//        Two different constructors ran → two different hashcodes → Singleton broken 🚨.