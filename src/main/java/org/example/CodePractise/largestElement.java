package org.example.CodePractise;

public class largestElement {
    public static void main(String[] args) {

        int [] arr={23,45,1,45,56};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++ )
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
