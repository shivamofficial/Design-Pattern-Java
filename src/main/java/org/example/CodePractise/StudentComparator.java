package org.example.CodePractise;

public class StudentComparator {
    String name;
    int marks;

    StudentComparator(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}
