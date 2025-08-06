package org.example.Eagersingleton;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

    private static final Logger instance= new Logger();

    private PrintWriter printWriter;

    private Logger()
    {
        try{
            printWriter=new PrintWriter(new FileWriter("application.log",true),true);
        }
        catch (Exception e) {
            throw new RuntimeException("Failed to initialize logger", e);
        }


    }

    public static  Logger getInstance()
    {
        return instance;
    }

    public void log(String level ,String message)
    {
        String logEntry= LocalDateTime.now()+"["+level+"]"+message;
        printWriter.println(logEntry);
        System.out.println(logEntry);// also print to console
    }
}
