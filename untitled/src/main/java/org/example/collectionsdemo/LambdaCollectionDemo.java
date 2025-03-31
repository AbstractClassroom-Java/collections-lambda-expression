package org.example.collectionsdemo;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaCollectionDemo {

    public static void listFilterAndSort() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Amanda");

        System.out.println("Original list: " + names);

        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Names starting with 'A' (sorted): " + filtered);
    }

    public static void setToUpperCase() {
        Set<String> words = new HashSet<>(Arrays.asList("java", "lambda", "stream", "collection"));

        System.out.println("Original set: " + words);

        Set<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println("Uppercased set: " + upperWords);
    }

    public static void mapTransform() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Math", 90);
        scores.put("English", 85);
        scores.put("History", 88);

        System.out.println("Original map: " + scores);

        Map<String, String> gradeDescriptions = scores.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue() >= 90 ? "Excellent" :
                                e.getValue() >= 80 ? "Good" : "Needs Improvement"
                ));

        System.out.println("Transformed map with descriptions: " + gradeDescriptions);
    }

    public static void groupingExample() {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Brian", "Amanda", "Bella");

        System.out.println("Original names list: " + names);

        Map<Character, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println("Names grouped by first letter: " + grouped);
    }


}
