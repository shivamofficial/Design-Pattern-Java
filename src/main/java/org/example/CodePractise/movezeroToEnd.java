package org.example.CodePractise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class movezeroToEnd {
    public static void moveZeroes(int [] arr)
    {

        int index=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++]=arr[i];
            }
        }
       while (index <arr.length)
       {
           arr[index++]=0;
       }

    }
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
