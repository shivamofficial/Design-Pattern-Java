package org.example.CodePractise;

public class sortedArrayCheck {

    public static  boolean isSorted(int[]arr)
    {
        int n=arr.length;

        for(int i=1;i<n;i++)
        {

                if(arr[i]<arr[i-1])
                {
                    return false;
                }


        }
        return true;

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,0};

        System.out.println(isSorted(arr));
    }
}
