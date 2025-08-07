package org.example.LazySingleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {


    public static final long serialVersionUID=1L;


    public static final SerializedSingleton instance= new SerializedSingleton();

    private SerializedSingleton() {
        System.out.println("Constructor called");
    }

    public static SerializedSingleton getInstance()
    {
        return instance;
    }

    // Prevents new instance during deserialization
    protected Object readResolve() {
        return instance;
    }


}
