package org.example.LazySingleton;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
    public static void main(String[] args) throws Exception {

        SerializedSingleton instace1=SerializedSingleton.getInstance();

        // serilize
        ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        outputStream.writeObject(instace1);
        outputStream.close();

        // deserlize

        ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("singleton.ser"));

        SerializedSingleton instance2=(SerializedSingleton) objectInputStream.readObject();
        objectInputStream.close();


        System.out.println("HashCode of instanceOne: " + instace1.hashCode());
        System.out.println("HashCode of instanceTwo: " + instance2.hashCode());


    }
}
