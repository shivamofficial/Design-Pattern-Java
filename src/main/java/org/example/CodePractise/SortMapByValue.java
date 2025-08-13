package org.example.CodePractise;

import java.util.HashMap;
import java.util.Map;

public class SortMapByValue {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Shivam", 85);
        map.put("Amit", 92);
        map.put("Rohan", 78);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}
