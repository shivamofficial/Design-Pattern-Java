package org.example.CodePractise;

public class Insertionsort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};
int n=arr.length;

        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j]; //right shift
                j--; // go left to check
            }
            arr[j+1]=current; ////Insert current element
        }



        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
