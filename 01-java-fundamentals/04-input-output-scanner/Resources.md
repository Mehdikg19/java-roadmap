# Module 04 — Resources

## Official Documentation

### Oracle Java Scanner Documentation

https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html

Official documentation for the Scanner class.

Topics include:

- Scanner Constructors
- next()
- nextLine()
- nextInt()
- nextDouble()
- Delimiters
- Input Parsing

---

## Java Documentation

https://docs.oracle.com/en/java/

Official Java SE Documentation.

Useful for all future Java modules.

---

# Concepts to Review

- Scanner Class
- Console Input
- Primitive Data Types
- String
- next()
- nextLine()
- nextInt()
- nextDouble()
- Input Buffer
- Delimiters

---

# Recommended Practice

Practice reading different combinations of user input.

Examples:

- First Name
- Full Name
- Age
- Height
- Weight
- City
- Country
- Address

Mix different data types together.

Example:


Name
Age
Height
City


Try changing the order of the input methods and predict the output before running the program.

---

# Common Problems

## Problem 1

Using next() for text containing spaces.

Input


Ali Reza


Output


Ali


Solution

java
nextLine();


---

## Problem 2

Scanner Buffer Problem

Wrong

java
nextInt();
nextLine();


Correct

java
nextInt();

input.nextLine();

nextLine();


---

## Best Practices

- Always close the Scanner object.

java
input.close();


- Use meaningful prompts.

Example


Enter your full name:


instead of


Name:


- Use nextLine() whenever spaces are expected.

- Format console output clearly.

- Predict the output before executing the program.

---

# Suggested Videos

Search YouTube for:

- Java Scanner Tutorial
- Java next() vs nextLine()
- Java Scanner Buffer Problem
- Java Console Input

---

# Key Takeaway

Understanding how Scanner reads input is far more valuable than memorizing its methods.

Knowing when to use next(), nextLine(), nextInt(), and nextDouble() prevents common programming mistakes and improves code quality.