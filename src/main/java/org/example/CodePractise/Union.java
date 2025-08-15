package org.example.CodePractise;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for(int n:arr1)
        {
            set.add(n);
        }
        for(int m:arr2)
        {
            set.add(m);
        }
        System.out.println(set);
    }
}
