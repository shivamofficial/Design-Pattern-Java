package org.example.LazySingleton;

public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking instance;


    private DoubleCheckLocking()
    {

    }

    public static DoubleCheckLocking getInstance()
    {
        if(instance==null)
        {
            synchronized (DoubleCheckLocking.class)
            {
                if (instance == null) {           // ② Second check (with lock)
                    instance = new DoubleCheckLocking();
                }
            }

        }
        return instance;
    }
}
