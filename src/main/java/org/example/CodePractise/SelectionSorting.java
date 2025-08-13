package org.example.CodePractise;

public class SelectionSorting {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int minindex=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
          int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;

        }
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
