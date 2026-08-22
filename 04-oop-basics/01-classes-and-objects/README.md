# Java Roadmap Project

## Project Information

- Project: Java Roadmap Project
- Repository: java-roadmap
- Phase: 4 — OOP Basics
- Topic: 01 — Classes and Objects
- Language: Java
- Status: Completed

---

## Topic

Classes and Objects

---

## Objective

Understand the fundamental relationship between classes and objects in Java and learn how to create objects, manage their state, and invoke their behavior.

---

## Prerequisites

- Java Fundamentals
- Control Flow
- Methods
- Arrays

---

## Learning Outcomes

After completing this topic, the learner should be able to:

- Explain what a class is.
- Explain what an object is.
- Distinguish between a class and an object.
- Create objects using the new keyword.
- Declare and use reference variables.
- Define and use instance variables.
- Define and invoke instance methods.
- Understand object state and behavior.
- Create multiple objects from the same class.
- Understand that different objects have independent state.
- Understand that multiple reference variables can refer to the same object.
- Recognize the difference between object creation and reference assignment.

---

## Files

01-classes-and-objects/
├── README.md
├── Notes.md
├── Resources.md
├── Completed.md
└── src/
    └── oopbasics/
        └── classesandobjects/
            ├── Example01.java
            ├── Example02.java
            ├── Exercise01.java
            ├── Exercise02.java
            └── Playground.java

---

## Key Concepts

### Class

A class defines the structure and behavior that objects created from it can have.

### Object

An object is an instance created from a class.

### Instance Variables

Instance variables represent data belonging to an individual object.

### Instance Methods

Instance methods define behavior that can be performed by an object.

### Object State

The current values of an object's instance variables represent its state.

### Object Behavior

The methods available to an object represent its behavior.

### Reference Variable

A reference variable stores a reference to an object.

### new

The new keyword is used to create a new object.

### Multiple Objects

A single class can be used to create multiple independent objects.

### Shared Object Reference

Multiple reference variables can refer to the same object.

---

## Topic Summary

The fundamental OOP model introduced in this topic is:

Class
  ↓
Object
  ├── State
  └── Behavior

A class provides the definition from which objects are created.

Each call to new creates a new object. Objects created separately from the same class have independent state.

For example:

Car car1 = new Car();
Car car2 = new Car();

creates two separate objects.

However:

Car car3 = new Car();
Car car4 = car3;

creates only one object and two reference variables pointing to that object.

---

## Common Mistakes

- Confusing a class with an object.
- Assuming declaring a reference variable creates an object.
- Forgetting to use new when object creation is required.
- Assuming two objects created from the same class share instance state.
- Confusing a new object with a copied reference.
- Treating two reference variables as necessarily representing two different objects.
- Ignoring formatting and naming quality during implementation.

---

## Summary

Classes provide the definition of objects, while objects are actual instances created from those classes.

A Java object can contain state through instance variables and behavior through instance methods.

Understanding classes, objects, references, state, and behavior provides the foundation for the remaining OOP topics.

---

## Status

Completed