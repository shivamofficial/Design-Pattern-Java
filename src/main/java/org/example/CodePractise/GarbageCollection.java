package org.example.CodePractise;

public class GarbageCollection {

    public static void main(String[] args) {
        String name= new String("shivam");
        name=null;//"Shivam" object is now unreachable, eligible for GC
        System.out.println(name);

    }
}
