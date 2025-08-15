package org.example.CodePractise;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length + 1; // total numbers including missing one

        int sum=0;
        int nsum=(n*(n+1))/2;

       for(int x:arr)
       {
           sum+=x;
       }
       int missing=nsum-sum;
        System.out.println(missing);
    }
}
