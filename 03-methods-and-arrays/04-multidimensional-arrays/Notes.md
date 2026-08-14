# Notes.md

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

## Practical Notes

Java multidimensional arrays are implemented as arrays of arrays.

This is important because each inner array is an independent array and can have its own length.

For example:

    int[][] numbers = {
            {10, 20, 30},
            {40, 50},
            {60, 70, 80, 90}
    };

The rows do not have to contain the same number of elements.

This structure is commonly called a jagged array.

---

## Important Java Behavior

### length Depends on the Array Being Referenced

For a two-dimensional array:

    numbers.length

refers to the outer array.

For a specific row:

    numbers[row].length

refers to that row's inner array.

Therefore, the two expressions answer different questions:

    numbers.length
    → How many rows are there?

    numbers[row].length
    → How many elements are in this row?

This distinction is especially important when rows have different lengths.

---

### Indexing Is Applied at Each Level

In:

    numbers[row][column]

Java first selects the row using row.

It then accesses an element inside that selected row using column.

Therefore, the validity of column depends on the length of the selected row.

Example:

    int[][] numbers = {
            {10, 20, 30},
            {40, 50}
    };

The expression:

    numbers[1][1]

is valid.

The expression:

    numbers[1][2]

is invalid because row 1 contains only two elements.

---

## Compiler/Runtime Observations

### ArrayIndexOutOfBoundsException

An invalid array index can compile successfully but fail during execution.

For example:

    numbers[1][2]

can produce:

    ArrayIndexOutOfBoundsException

when the selected row does not contain index 2.

A message such as:

    Index 2 out of bounds for length 2

means that Java attempted to access index 2 in an array whose length is 2.

Because indexing starts at 0, a length of 2 provides only:

    0
    1

---

### Debugging an Index Exception

When an ArrayIndexOutOfBoundsException occurs, check:

1. Which row was selected?
2. What is the length of that row?
3. Which index was requested?
4. Is that index within the valid range?

For example:

    numbers[row].length

can be used to determine the valid size of the selected row.

The valid index range is:

    0 ... numbers[row].length - 1

---

## Clean Code Tips

When traversing a multidimensional array, avoid hard-coding the dimensions.

Avoid:

    for (int row = 0; row < 3; row++) {

        for (int column = 0; column < 3; column++) {

            // ...
        }
    }

Prefer:

    for (int row = 0; row < numbers.length; row++) {

        for (int column = 0; column < numbers[row].length; column++) {

            // ...
        }
    }

The second approach adapts to the actual structure of the array and also works with jagged arrays.

Use meaningful names such as:

    row
    column
    scores
    numbers
    total
    count

Avoid unnecessary assumptions about the array's dimensions.

---

## Interview Notes

### Question 1

Why can rows in a Java multidimensional array have different lengths?

Answer:

Because a multidimensional array is an array of arrays. Each inner array is independent and can have its own length.

### Question 2

What is the difference between:

    numbers.length

and:

    numbers[row].length

Answer:

The first gives the length of the outer array, while the second gives the length of the selected row.

### Question 3

Why can numbers[1][2] fail even when numbers.length is greater than 1?

Answer:

Because numbers.length only determines whether row 1 exists. The second index must also be valid for that specific row.

### Question 4

What does Index 2 out of bounds for length 2 mean?

Answer:

Java attempted to access index 2 in an array containing two elements. The only valid indexes are 0 and 1.

---
## Common Mistakes

### Using the Outer Length for Every Row

Incorrect:

    for (int column = 0; column < numbers.length; column++)

The outer length describes the number of rows, not the size of the current row.

Use:

    numbers[row].length

for the current row.

### Assuming All Rows Have Equal Length

Do not assume that every row has the same number of elements.

A valid Java array may contain:

    {10, 20, 30}
    {40, 50}
    {60, 70, 80, 90}

Each row must therefore be handled according to its own length.

### Forgetting Zero-Based Indexing

For an array with length 3, the valid indexes are:

    0
    1
    2

Index 3 is outside the valid range.

---

## Quick Review

Key points to remember:

- A Java multidimensional array is an array of arrays.
- Each row can have its own length.
- array.length refers to the outer array.
- array[row].length refers to the selected row.
- Each index in array[row][column] must be valid at its own level.
- Invalid indexes can cause ArrayIndexOutOfBoundsException.
- Use actual array lengths instead of hard-coded dimensions.
- Nested loops should use the current row's length when traversing potentially jagged arrays.

---

## Status

In Progress