package org.example.LazySingleton;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

    private static  Logger instance;
PrintWriter printWriter;


    private Logger(){

        try
        {
printWriter= new PrintWriter(new FileWriter("applog.log",true),true);
            System.out.println("Logger initialized...");

        }
        catch(Exception e)
        {
            throw new RuntimeException("Failed to initialize logger",e);
        }
    }

    public static Logger getInstance()
    {
        if(instance==null)
        {
            instance=new Logger();

        }
        return instance;
    }

    public void log(String level, String message) {
        String logEntry = LocalDateTime.now() + " [" + level + "] " + message;
        printWriter.println(logEntry);
        System.out.println(logEntry);
    }
}
