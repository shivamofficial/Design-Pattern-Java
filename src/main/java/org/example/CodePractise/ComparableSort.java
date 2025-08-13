package org.example.CodePractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableSort {
    public static void main(String[] args) {

        List<StudentComparable> list = Arrays.asList(
                new StudentComparable("Shivam", 85),
                new StudentComparable("Amit", 92),
                new StudentComparable("Rohan", 78)
        );

        Collections.sort(list); //uses compare to
        System.out.println(list);

    }
}
