package org.example.LazySingleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("Program start");

        // 👇 Notice: nothing created until we call getInstance()
        Testing oj=Testing.getInstance();
        oj.log();


        System.out.println("After getInstance()");
    }
}
