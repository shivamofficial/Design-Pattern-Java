package org.example.CodePractise;

public class ReverseString {
    public static void main(String[] args) {

        String str = "racecars";

        StringBuilder sb = new StringBuilder(str).reverse();

        System.out.println(sb);


        String str2 = "hello";
        int n = str2.length();
        String reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            reverse += str2.charAt(i);

        }
        System.out.println(reverse);
    }
}
