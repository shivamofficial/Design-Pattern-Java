package org.example.CodePractise;

public class palindromeString {
    public static void main(String[] args) {

        String str="racecar";

        StringBuilder sb= new StringBuilder(str).reverse();

        System.out.println(str.equalsIgnoreCase(sb.toString()));

boolean ispallindrom=true;
int n=str.length();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                ispallindrom=false;
                break;
            }
        }

        System.out.println("ispalindrom " + ispallindrom);

    }
}
