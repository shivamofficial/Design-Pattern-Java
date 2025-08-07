package org.example.LazySingleton;

public class BillPughSingleton {


    private BillPughSingleton()
    {
        System.out.println("Constructor called by " + Thread.currentThread().getName());
    }


    // Inner static helper class
    private static class Helper{

        private static  final BillPughSingleton instance= new BillPughSingleton();
    }

    public static BillPughSingleton getInstance()
    {
        return Helper.instance;
    }

}


