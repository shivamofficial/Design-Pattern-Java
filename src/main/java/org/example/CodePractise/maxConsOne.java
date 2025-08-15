package org.example.CodePractise;

public class maxConsOne {
    public static void main(String[] args) {

        int [] arr = {1, 1, 0, 0, 1, 1, 1, 1};

        int count=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                maxi=Math.max(maxi,count);
            }
            else {
                count=0;
            }
        }
        //return maxi;
        System.out.println(maxi);
    }
}
