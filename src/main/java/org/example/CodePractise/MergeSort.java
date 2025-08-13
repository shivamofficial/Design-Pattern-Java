package org.example.CodePractise;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void mergeSort(int [] arr,int start,int end)
    {
        int mid = start + (end - start) / 2; // prevents overflow and is correct

        if(start>=end) return;

            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);

    }
    public static void merge(int [] arr,int start,int mid,int end)
    {

        List<Integer> temp=new ArrayList<>();
        int left=start;
        int right=mid+1;

while(left<=mid && right<=end)
{
    if(arr[left]<arr[right])
    {
        temp.add(arr[left]);
        left++;
    }
    else {
        temp.add(arr[right]);
        right++;
    }
}

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=start;i<=end;i++)
        {
            arr[i]=temp.get(i-start);
        }

    }
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
