# Notes.md

# 03-Arrays

Project Information


- Project: Java Roadmap Project

- Phase: Phase 3 — Methods and Arrays

- Module: 03-methods-and-arrays

- Lesson: 03-arrays

- Language: Java


Topic

Arrays


Practical Notes

An array stores multiple values of the same data type under one variable name.

Java arrays have a fixed size.

For example:


- "int[] numbers = new int[5];"


creates an array containing five integer elements.

The indexes are:


- 0

- 1

- 2

- 3

- 4


The number of elements is five, but the last valid index is four.


Array Declaration

An array can be declared without immediately creating its elements:


- "int[] numbers;"


An array can be declared and initialized at the same time:


- "int[] numbers = {10, 20, 30};"


An array can also be created with a specified size:


- "int[] numbers = new int[5];"


Zero-Based Indexing

Java arrays use zero-based indexing.

For example:


- "numbers[0]" refers to the first element.

- "numbers[1]" refers to the second element.

- "numbers[2]" refers to the third element.


Important rule:


- First index = 0

- Last valid index = length - 1


Array Length

The number of elements is obtained using the "length" property:


- "numbers.length"


For an array containing five elements:


- length = 5

- last valid index = 4


"length" is a property, not a method.

Correct:


- "numbers.length"


Incorrect:


- "numbers.length()"


Array Access

An array element can be accessed by using its index.

Example:


- "int[] numbers = {10, 20, 30};"

- "int value = numbers[1];"


The value stored in "value" is "20".


Array Modification

An existing element can be changed using its index.

Example:


- "numbers[1] = 100;"


After this operation, the second element contains "100".


Array Traversal

An indexed "for" loop is commonly used when the index is required:


- "for (int i = 0; i < numbers.length; i++)"

- "    System.out.println(numbers[i]);"


The loop starts at index zero and stops before "numbers.length".


For-Each Loop

When the index is not required, a for-each loop can make the code simpler:


- "for (int number : numbers)"

- "    System.out.println(number);"


Use an indexed loop when the position of an element matters.

Use a for-each loop when only the values are required.


Default Values

When an array is created using "new", its elements receive default values.

For an "int" array, the default value is "0".

Example:


- "int[] numbers = new int[5];"


Initially:


- numbers[0] = 0

- numbers[1] = 0

- numbers[2] = 0

- numbers[3] = 0

- numbers[4] = 0


After:


- "numbers[0] = 10;"

- "numbers[1] = 20;"


the remaining elements still contain zero.


Conditional Processing

Arrays can be combined with "if" statements.

Example:


- "if (numbers[i] > 5)"

This allows a program to process only elements satisfying a specific condition.


Counting Pattern

A common array-processing pattern is counting elements that satisfy a condition.

Example structure:


- Initialize a counter to zero.

- Traverse the array.

- Test each element.

- Increment the counter when the condition is true.


Example:


- "int count = 0;"

- "if (numbers[i] % 2 == 0)"

- "    count++;"


This pattern can be used for many problems.


Classification Pattern

An array can also be used to classify values.

For example:


- Positive numbers

- Negative numbers

- Zero


A typical structure is:


- "if (numbers[i] == 0)"

- "    countZero++;"

- "else if (numbers[i] < 0)"

- "    countNegative++;"

- "else"

- "    countPositive++;"


Array Boundary

For:


- "int[] numbers = new int[5];"


valid indexes are:


- 0

- 1

- 2

- 3

- 4


Index 5 is invalid.

The expression:


- "numbers[numbers.length]"


is invalid because "numbers.length" equals the number of elements, not the last index.

The last element should be accessed with:


- "numbers[numbers.length - 1]"


ArrayIndexOutOfBoundsException

Accessing an invalid array index causes:


- "ArrayIndexOutOfBoundsException"


For example:


- "int[] numbers = {10, 20, 30};"

- "System.out.println(numbers[3]);"
The code can compile successfully, but the program fails at runtime because index 3 does not exist.


Compile-Time vs Runtime

An invalid index is not necessarily detected by the compiler when the index is calculated at runtime.

For example:


- "int index = 3;"

- "System.out.println(numbers[index]);"


The program may compile, but when executed, Java checks the actual index and throws "ArrayIndexOutOfBoundsException" if it is outside the valid range.


Primitive Value Copy

Consider:


- "int[] numbers = {10, 20, 30};"

- "int x = numbers[1];"

- "numbers[1] = 100;"


The value "20" is copied into "x".

After the assignment:


- x = 20

- numbers[1] = 100


Changing the array element does not change the primitive variable "x".


Clean Code Tips


- Use meaningful array names.

- Prefer "numbers", "scores", or "studentScores" over unclear names.

- Use "numbers.length" instead of hard-coded array sizes.

- Use "for-each" when the index is unnecessary.

- Use an indexed "for" loop when the index is required.

- Keep loop conditions simple.

- Avoid unnecessary nested conditions.

- Use meaningful counter names when multiple counters exist.

- Keep formatting consistent.

- Avoid unnecessary complexity in educational examples.


Compiler and Runtime Observations


- "numbers.length" is valid.

- "numbers.length()" is invalid because "length" is not a method.

- An array has a fixed size after creation.

- An invalid index causes "ArrayIndexOutOfBoundsException" at runtime.

- Primitive array elements receive default values when the array is created.

- An "int" element assigned to an "int" variable is copied by value.


Interview Notes

Question:

What is the first index of a Java array?

Answer:

"0".


Question:

If an array has length 10, what is the last valid index?

Answer:

"9".


Question:

Why is the last valid index "length - 1"?

Answer:

Because Java arrays use zero-based indexing.


Question:

What happens if an invalid index is accessed?

Answer:

Java throws "ArrayIndexOutOfBoundsException" at runtime.


Question:

What is the difference between "length" and the last index?

Answer:

"length" represents the number of elements. The last valid index is "length - 1".


Question:

Why is this loop normally written using "<"?


- "for (int i = 0; i < numbers.length; i++)"


Answer:

Because the largest valid index is "numbers.length - 1".


Question:

When is a for-each loop useful?

Answer:

When the program needs the elements but does not need their indexes.


Question:

Can the size of a Java array change after creation?

Answer:

No. Java arrays have a fixed length.


Common Mistakes


- Starting indexes from 1.

- Accessing "numbers[numbers.length]".

- Using "<=" instead of "<" in a normal indexed traversal.

- Treating "length" as a method.

- Forgetting that arrays have fixed size.

- Assuming unassigned integer elements contain random values.

- Ignoring array boundaries.

- Confusing compile-time errors with runtime exceptions.

- Using the wrong index.

- Forgetting to increment a counter.

- Using the wrong loop type for the problem.


Quick Review

Before moving to the next lesson, the learner should be able to explain:


- What an array is.

- Why Java arrays use zero-based indexing.

- How to declare an array.

- How to initialize an array.

- How to access an array element.

- How to modify an array element.

- What "length" represents.

- How to find the last valid index.

- How to traverse an array using "for".

- How to traverse an array using "for-each".

- What default value an "int" array contains.

- What happens when an invalid index is accessed.

- What "ArrayIndexOutOfBoundsException" means.

- How to count elements satisfying a condition.

- Why assigning an array element to an "int" variable creates a value copy.


Status

Completed