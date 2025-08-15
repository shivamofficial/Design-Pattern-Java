package org.example.CodePractise;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicate {
    public static int removeDuplicates(int [] nums)
    {
        int i=0;
        for(int j=1;j< nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int length = removeDuplicates(nums);

        System.out.println("Length: " + length);

        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        TreeSet<Integer> set = new TreeSet<>();
        for(int a:arr)
        {
            set.add(a);
        }
        System.out.println("unique element is  "+ set);
        System.out.println("unique element length " +set.size());

    }
}
