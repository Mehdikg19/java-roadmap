# Notes - Constants & final

## What is final?

The final keyword is used to make a variable immutable after it has been assigned a value.

A final variable can be assigned only once.

java
final int MAX_SPEED = 120;


After initialization, its value cannot be changed.

---

## Why Use Constants?

Using constants makes programs:

- Easier to read
- Easier to maintain
- Less error-prone
- More reliable

Instead of writing magic numbers:

java
price = price * 0.15;


Use:

java
final double TAX_RATE = 0.15;

price = price * TAX_RATE;


The meaning of the code becomes much clearer.

---

## Naming Convention

Constants should always be written using:

UPPER_SNAKE_CASE

Examples:

java
MAX_SPEED
PI
SECONDS_IN_MINUTE
DAYS_IN_WEEK


This is not a Java language rule.

It is a Java Coding Convention followed by professional developers.

---

## final vs Variable

Variable

java
int age = 20;

age = 21;


✔ Allowed

---

Constant

java
final int AGE = 20;

AGE = 21;


❌ Compile-time Error

---

## Del