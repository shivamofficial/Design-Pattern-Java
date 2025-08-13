package org.example.CodePractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StudentComparable implements Comparable<StudentComparable>{

    String name;
    int marks;

    public StudentComparable(String name,int marks) {
        this.name = name;
        this.marks=marks;
    }

    @Override
    public int compareTo(StudentComparable s) {

        return this.marks-s.marks;

    }

    @Override
    public String toString() {
        return "StudentComparable{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }



}


