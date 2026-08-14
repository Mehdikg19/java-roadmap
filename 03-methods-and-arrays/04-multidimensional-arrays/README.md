# Multidimensional Arrays

## Project Information

Project: Java Roadmap Project
Phase: 3 — Methods and Arrays
Topic: 04 — Multidimensional Arrays
Language: Java
Package: methodsandarrays.multidimensionalarrays

---

## Topic

Multidimensional Arrays

---

## Objective

Learn how to declare, initialize, access, and traverse multidimensional arrays in Java.

Understand how Java represents a two-dimensional array as an array of arrays, how rows and columns are accessed, how row lengths are determined, and how to safely traverse arrays with different row lengths.

---

## Prerequisites

- Variables and Data Types
- Operators
- Type Casting
- for Loop
- Nested Loops
- Arrays
- Array Indexes
- array.length

---

## Learning Outcomes

After completing this topic, the learner should be able to:

- Declare and initialize a two-dimensional array.
- Understand the relationship between rows and columns.
- Access an element using [row][column].
- Use array.length to determine the number of rows.
- Use array[row].length to determine the length of a specific row.
- Traverse a two-dimensional array using nested for loops.
- Work safely with rows that have different lengths.
- Understand Java's array-of-arrays structure.
- Recognize and analyze ArrayIndexOutOfBoundsException.
- Calculate totals, counts, and averages from a two-dimensional array.
- Understand the basic concept of jagged arrays.

---

## Files

### Java Files

- Example01.java
- Example02.java
- Exercise01.java
- Exercise02.java
- Playground.java

### Documentation Files

- README.md
- Notes.md
- Resources.md
- Completed.md

---

## Key Concepts

### Two-Dimensional Arrays

A two-dimensional array in Java is an array whose elements are themselves arrays.

Example:

    int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
    };

### Rows and Columns

A two-dimensional array can be viewed as rows and columns.

The first index identifies the row.

The second index identifies the element within that row.

Example:

    numbers[row][column]

Indexes start from 0.

For example:

    numbers[1][2]

accesses the element in row 1 and column 2.

### Array Length

The outer array's length represents the number of rows:

    numbers.length

The length of a specific row is obtained with:

    numbers[row].length

These two expressions do not necessarily return the same value.

### Nested Loops

Nested for loops are commonly used to traverse a two-dimensional array:

    for (int row = 0; row < numbers.length; row++) {

        for (int column = 0; column < numbers[row].length; column++) {

            System.out.println(numbers[row][column]);
        }
    }

The outer loop controls the rows.

The inner loop controls the elements of the current row.

### Array of Arrays

Java implements multidimensional arrays as arrays of arrays.

Therefore, rows can have different lengths.

Example:

    int[][] numbers = {
            {10, 20, 30},
            {40, 50},
            {60, 70, 80, 90}
    };

In this example:

- Row 0 has 3 elements.
- Row 1 has 2 elements.
- Row 2 has 4 elements.

This type of structure is commonly called a jagged array.

### Runtime Index Errors

Accessing an index that does not exist causes a runtime exception.

Example:

    numbers[1][2]

If row 1 contains only two elements, its valid indexes are:

    0
    1

Therefore, accessing index 2 causes:

    ArrayIndexOutOfBoundsException

The exception is a runtime error because the code can compile successfully but fails when the invalid access is executed.

---

## Topic Summary

The basic element access pattern is:

    array[row][column]

The number of rows is obtained with:

    array.length

The number of elements in the current row is obtained with:

    array[row].length

When traversing a two-dimensional array, the inner loop should normally use the length of the current row:

    for (int column = 0; column < array[row].length; column++)
This allows the code to work correctly even when different rows have different lengths.

---

## Common Mistakes

- Confusing rows and columns.
- Forgetting that array indexes start from 0.
- Using array.length instead of array[row].length for the current row.
- Assuming every row has the same number of elements.
- Accessing an index that does not exist.
- Causing ArrayIndexOutOfBoundsException.
- Confusing runtime exceptions with compilation errors.
- Using integer division when calculating an average.

---

## Summary

In this topic, the learner practiced:

- Creating two-dimensional arrays.
- Understanding rows and columns.
- Accessing elements with row and column indexes.
- Using array.length.
- Using array[row].length.
- Traversing multidimensional arrays with nested loops.
- Calculating totals, counts, and averages.
- Working with rows of different lengths.
- Identifying and analyzing runtime index errors.
- Understanding jagged arrays.
- Investigating multidimensional array behavior through Playground experiments.

---

## Status

In Progress