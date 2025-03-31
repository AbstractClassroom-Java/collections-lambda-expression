# Java Collections and Lambda Expressions

This package demonstrates how to use **Java Collections** with **lambda expressions** and **Stream API collectors**. It is designed as an instructional resource for students learning modern Java programming techniques.

## What Are Java Collections?

A **collection** in Java is an object that groups multiple elements into a single unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. Java provides a rich set of interfaces and classes in the `java.util` package to work with collections.

### Common Collection Types

- **List**: An ordered collection that may contain duplicates. Example: `ArrayList`, `LinkedList`.
- **Set**: A collection that does not allow duplicates. Example: `HashSet`, `TreeSet`.
- **Map**: A key-value pair structure that is not a true collection but often grouped with them. Example: `HashMap`, `TreeMap`.

## What Are Lambda Expressions?

**Lambda expressions** are a concise way to represent anonymous functions (functions without names). They were introduced in Java 8 to enable functional-style programming.

A lambda expression has the following syntax:
```java
(parameters) -> expression
```

For example:
```java
name -> name.startsWith("A")
```
This is a lambda expression that takes a `name` and returns `true` if it starts with "A".

Lambda expressions are commonly used with **functional interfaces**, especially in the **Stream API**.

## Stream API and Collectors

The **Stream API** allows developers to process collections of objects in a functional style. A stream is a sequence of elements that supports sequential and parallel aggregate operations.

Streams are often used in conjunction with **collectors**, which are used to gather the results of stream operations into different forms such as lists, sets, or maps.

Example:
```java
List<String> result = names.stream()
    .filter(name -> name.startsWith("A"))
    .collect(Collectors.toList());
```

## Summary of Demonstrations

The included `LambdaCollectionDemo` class contains several methods that demonstrate the following operations:

### 1. `listFilterAndSort()`
- Filters a list of strings to include only those starting with "A"
- Sorts the filtered list alphabetically
- Collects the result into a new list

### 2. `setToUpperCase()`
- Converts a set of lowercase strings to uppercase
- Collects the result into a new set

### 3. `mapTransform()`
- Transforms a map of scores into descriptive text values
- Uses a lambda expression inside a `Collectors.toMap()` operation

### 4. `groupingExample()`
- Groups a list of names by their first character using `Collectors.groupingBy()`
- Produces a map where each key is a character and each value is a list of names

## Educational Objectives

By studying and modifying this code, students will:
- Understand how collections behave and are used in Java
- Learn how to apply lambda expressions to perform filtering, mapping, and grouping
- Gain experience using the Stream API for processing data
- See practical examples of functional programming in Java
