# Java Arrays - Basic Guide

## Table of Contents
1. Introduction
2. Array Declaration and Creation
3. Array Initialization
4. Common Operations
5. Multidimensional Arrays
6. Common Methods and Properties
7. Best Practices
8. Examples

## 1. Introduction
Arrays in Java are fixed-size sequential collections of elements of the same type. They can store primitive data types such as int, byte, char, etc., as well as objects of a class. Arrays are zero-indexed, meaning the first element is accessed with index 0.

## 2. Array Declaration and Creation

### Single-dimensional Arrays
```java
// Method 1: Declaration and allocation
int[] numbers = new int[5];

// Method 2: Declaration and initialization
String[] fruits = {"Apple", "Banana", "Orange"};

// Method 3: Declaration first, allocation later
double[] prices;
prices = new double[10];
```

## 3. Array Initialization
Arrays can be initialized at the time of creation or element by element:

```java
// Initialize at creation
int[] scores = {90, 85, 88, 92, 95};

// Initialize element by element
int[] grades = new int[5];
grades[0] = 90;
grades[1] = 85;
grades[2] = 88;
grades[3] = 92;
grades[4] = 95;
```

## 4. Common Operations

### Accessing Elements
```java
int firstElement = numbers[0];
int lastElement = numbers[numbers.length - 1];
```

### Modifying Elements
```java
numbers[2] = 42;  // Sets the third element to 42
```

### Iterating Through Arrays
```java
// Using for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Using enhanced for loop (for-each)
for (int number : numbers) {
    System.out.println(number);
}
```

## 5. Multidimensional Arrays
Java supports multidimensional arrays:

```java
// 2D array declaration and initialization
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing elements
int element = matrix[1][2];  // Gets element 6
```

## 6. Common Methods and Properties

### Properties
- `array.length`: Returns the length of the array

Remember that arrays in Java are objects, and when passed to methods, they are passed by reference. This means changes to the array inside a method will affect the original array.