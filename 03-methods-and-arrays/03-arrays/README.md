# 03-Arrays

Project Information


- Project: Java Roadmap Project

- Phase: Phase 3 — Methods and Arrays

- Module: 03-methods-and-arrays

- Lesson: 03-arrays

- Language: Java


Topic

Arrays


Objective

Understand how arrays work in Java.

Learn how to declare, initialize, access, modify, and traverse arrays, how Java handles array indexes and default values, and how array boundaries affect runtime behavior.


Prerequisites

Before studying this topic, the learner should understand:


- Variables and Data Types

- Primitive Data Types

- Operators

- Type Casting

- Methods

- Method Declaration

- Method Call

- Parameters

- Arguments

- Return Types

- Return Values

- for Loop

- if-else

- break and continue


Learning Outcomes

After completing this topic, the learner should be able to:


- Define an array.

- Explain why arrays are used.

- Declare an array.

- Initialize an array.

- Create an array with a fixed size.

- Access array elements using indexes.

- Understand zero-based indexing.

- Modify array elements.

- Understand the array length.

- Use the length property correctly.

- Traverse an array using a for loop.

- Traverse an array using a for-each loop.

- Use conditions while processing array elements.

- Count elements that satisfy a condition.

- Count even numbers in an array.

- Count positive numbers, negative numbers, and zeros.

- Understand default values of primitive array elements.

- Understand the relationship between array length and the last valid index.

- Recognize ArrayIndexOutOfBoundsException.

- Distinguish compile-time errors from runtime exceptions.

- Predict array-related program output before execution.

- Explain basic array behavior in an interview.


Files

Java Files


- "Example01.java"

- "Example02.java"

- "Exercise01.java"

- "Exercise02.java"

- "Playground.java"


Documentation Files


- "README.md"

- "Notes.md"

- "Resources.md"

- "Completed.md"


Key Concepts


- Array

- Array Declaration

- Array Initialization

- Array Creation

- Array Element

- Array Index

- Zero-Based Indexing

- Array Length

- Element Access

- Element Modification

- Array Traversal

- for Loop

- for-each Loop

- Conditional Processing

- Counting Pattern

- Default Values

- Array Boundary

- Last Valid Index

- ArrayIndexOutOfBoundsException

- Runtime Exception

- Primitive Value Copy

- Fixed-Size Data Structure


Topic Summary

An array is a fixed-size data structure that stores multiple values of the same type.

Java arrays use zero-based indexing. This means the first element is stored at index 0.

For example:


- "numbers[0]" refers to the first element.

- "numbers[1]" refers to the second element.

- "numbers[2]" refers to the third element.


The number of elements in an array is available through the "length" property.

For example, an array with five elements has:


- length = 5

- first index = 0

- last valid index = 4


The general rule is:


- First index = 0

- Last valid index = length - 1


An array can be initialized directly:


- "int[] numbers = {10, 20, 30};"


An array can also be created with a fixed size:


- "int[] numbers = new int[5];"


When an integer array is created using "new", its elements initially contain the default value "0".

For example:


- "int[] numbers = new int[5];"


Initially contains:


- "0"

- "0"

- "0"

- "0"

- "0"


Array elements can be accessed and modified using their indexes.

For example:


- "numbers[0]"

- "numbers[1]"

- "numbers[2]"


An array can be traversed using an indexed "for" loop:


- "for (int i = 0; i < numbers.length; i++)"


The condition uses "<" because "numbers.length" is the number of elements, while the last valid index is "numbers.length - 1".

Arrays can also be traversed using a "for-each" loop when the index is not required.

For example:


- "for (int number : numbers)"


Array processing can be combined with conditions.

For example, a program can examine each element and count only even numbers.

A common counting pattern is:


- Initialize a counter to zero.

- Traverse the array.
- Check a condition.

- Increment the counter when the condition is true.


Arrays have a fixed size. Once an array is created, its length cannot be changed.

Attempting to access an invalid index causes an "ArrayIndexOutOfBoundsException" at runtime.

For example, if an array has length 3, the valid indexes are:


- 0

- 1

- 2


Index 3 is outside the valid range.

Array elements of primitive types contain their appropriate default values when the array is created.

When a primitive array element is assigned to a primitive variable, the value is copied.

For example:


- "int x = numbers[1];"


copies the current integer value into "x".

Changing the array element afterward does not change the copied primitive value.


Common Mistakes


- Thinking the first array index is 1 instead of 0.

- Using an index equal to array length.

- Confusing array length with the last valid index.

- Using "i <= numbers.length" instead of "i < numbers.length" when traversing an array.

- Writing "numbers.length()" instead of "numbers.length".

- Assuming an array created with "new int[size]" contains undefined integer values.

- Forgetting that arrays have a fixed size.

- Accessing an element outside the valid index range.

- Confusing a runtime exception with a compile-time error.

- Modifying the wrong array element.

- Using an indexed loop when a for-each loop would be clearer.

- Using a for-each loop when the index is actually required.

- Forgetting to update a counter when a condition is satisfied.

- Assuming changing an array element changes a separate primitive variable that previously received its value.


Summary

Arrays allow Java programs to store multiple values of the same type under one variable name.

Java arrays use zero-based indexing, and the number of elements is available through the "length" property.

The last valid index is always "length - 1".

Arrays can be traversed using both indexed "for" loops and "for-each" loops.

Array elements can be accessed, modified, filtered, counted, and processed using conditions.

When an array is created with a fixed size, primitive elements receive their default values.

Attempting to access an invalid index causes "ArrayIndexOutOfBoundsException" at runtime.

Understanding arrays provides an important foundation for multidimensional arrays, collections, data structures, searching, sorting, and algorithm development.


Status

Completed