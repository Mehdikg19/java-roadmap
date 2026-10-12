# Static Members

## Overview

The `static` keyword is used to define class-level members that belong to the class rather than to individual objects.

Static members allow objects of the same class to share data and provide methods that can be called without creating an object.

In this topic, static fields and static methods are studied alongside instance fields and instance methods to understand their differences and appropriate usage.

## Learning Objectives

By completing this topic, you should be able to:

- Explain the purpose of the `static` keyword.
- Distinguish static fields from instance fields.
- Understand how static fields are shared among objects of the same class.
- Declare and initialize static fields.
- Distinguish static methods from instance methods.
- Access static members using the class name.
- Explain why a static method cannot directly access instance members.
- Understand how constructors can update static fields.
- Predict the behavior of static and instance fields when their values change.
- Apply static and instance members in practical Java examples.

## Topic Structure

04-oop-basics/
└── 04-static-members/
    ├── README.md
    ├── Notes.md
    ├── Resources.md
    ├── Completed.md
    └── src/
        └── oopbasics/
            └── staticmembers/
                ├── Example01.java
                ├── Example02.java
                ├── Exercise01.java
                ├── Exercise02.java
                └── Playground.java

## Learning Approach

This topic follows the Java Roadmap Project learning workflow:

1. Concept Introduction
2. Examples
3. Prediction
4. Execution
5. Guided Questions
6. Independent Exercises
7. Code Review
8. Code Improvement
9. Playground Experiments
10. Documentation
11. Quality Check
12. Git Checkpoint

The goal is to understand how static and instance members behave, apply them independently, review the code, and document the results before completing the topic.

## Key Concepts

### 1. Static Fields

A static field belongs to the class and is shared among its objects.

It is suitable for data that should be shared at the class level, such as a counter tracking how many objects have been created.

Static fields can be accessed using the class name.

### 2. Instance Fields

An instance field belongs to an individual object.

Each object has its own instance field values, so changing an instance field in one object does not automatically change the corresponding field in another object.

### 3. Static Methods

A static method belongs to the class rather than to a particular object.

It can be called using the class name without creating an object.

A static method cannot directly access instance fields or call instance methods because it does not have an implicit reference to a particular object.

### 4. Instance Methods

An instance method is associated with an object.

It can directly access that object's instance fields and other accessible members.

### 5. Static and Instance Members Together

Understanding the relationship between static and instance members is essential when designing classes that contain both shared information and object-specific data.

## Practical Files

- `Example01.java` — Demonstrates a static counter shared among objects and instance fields that store individual object data.
- `Example02.java` — Demonstrates the difference between static methods and instance methods.
- `Exercise01.java` — Applies static and instance members in a student-counting example.
- `Exercise02.java` — Applies static and instance members in a bank-account example.
- `Playground.java` — Provides experiments for observing how static and instance fields behave when their values are modified.

## Common Mistakes

- Using `static` for data that should belong to individual objects.
- Assuming each object has a separate copy of a static field.
- Attempting to access an instance field directly from a static method.
- Calling a static method through an object reference instead of using the class name.
- Assuming that a static counter automatically represents the number of objects currently existing in memory.
- Confusing class-level data with object-specific data.

## Summary

The `static` keyword allows fields and methods to belong to a class rather than to individual objects.

Static fields are shared among objects of the same class, while instance fields store object-specific data.

Static methods can be called without creating an object, but they cannot directly access instance members without an appropriate object reference.

Understanding these differences provides an important foundation for working with Java classes and object-oriented programming.

## Status

**Project:** Java Roadmap Project

**Phase:** Phase 4 — OOP Basics

**Topic:** Static Members

**Practical Files:** Prepared

**Documentation Status:** In Progress

**Topic Completion:** Pending final review, quality checks, and Git checkpoint.