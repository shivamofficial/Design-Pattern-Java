package org.example.CodePractise;

public class Secondlargest {
    public static void main(String[] args) {

int [] arr= {8, 8, 7, 6, 5};

int n=arr.length;

int largest=Integer.MIN_VALUE;
int slargest=Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++)
{
    largest=Math.max(largest,arr[i]);
}

for(int i=0;i<n;i++)
{
if(arr[i]>slargest && arr[i] !=largest)
{
slargest=arr[i];
}
}
        System.out.println(largest + "is largest");
        System.out.println(slargest+"secondlargest");
    }
}
