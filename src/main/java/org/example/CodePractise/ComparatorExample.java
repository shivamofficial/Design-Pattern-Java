package org.example.CodePractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<StudentComparator> list = Arrays.asList(
                new StudentComparator("Shivam", 85),
                new StudentComparator("Amit", 92),
                new StudentComparator("Rohan", 78)
        );

        // sort by marksa
        Comparator<StudentComparator> bymakrks= (s1, s2)->s2.marks-s1.marks;

        list.sort(bymakrks);
        System.out.println("By Marks Desc: " + list);

        // sort by name

        Comparator<StudentComparator> byname=(s1,s2)->s1.name.compareTo(s2.name);
        list.sort(byname);
        System.out.println("By Name: " + list);

    }
}

