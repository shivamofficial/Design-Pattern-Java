package org.example.CodePractise;

public class LeftRotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // number of rotations
        int n = arr.length;

        int [] result= new int[n];

        for(int i=0;i<n;i++)
        {
            result[(i+d)%n]=arr[i];
        }
        for(int r:result)
        {
            System.out.print(r+" ");
        }
    }
}
