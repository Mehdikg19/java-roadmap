# this Keyword

## Overview

The `this` keyword is a reference to the current object.

It is mainly used to:

* Distinguish instance fields from constructor or method parameters.
* Access members of the current object explicitly.
* Call instance methods of the current object.
* Call another constructor in the same class using `this(...)`.

## Learning Objectives

By completing this topic, you should be able to:

* Explain what `this` refers to.
* Use `this.field` to access instance fields.
* Use `this.field = parameter` when field and parameter names are the same.
* Use `this.method()` to call a method on the current object.
* Explain the difference between `this` and `this(...)`.
* Understand constructor chaining with `this(...)`.

## Topic Structure

```text
04-oop-basics/
└── 03-thiskeyword/
    ├── README.md
    ├── Notes.md
    ├── Resources.md
    ├── Completed.md
    └── src/
        └── oopbasics/
            └── thiskeyword/
                ├── Example01.java
                ├── Example02.java
                ├── Exercise01.java
                ├── Exercise02.java
                └── Playground.java
```

## Learning Approach

This topic follows the project learning workflow:

1. Concept Introduction
2. Examples
3. Prediction
4. Execution
5. Exercises
6. Code Review
7. Code Improvement
8. Playground
9. Documentation
10. Quality Check
11. Git Checkpoint

## Key Principle

`this` refers to the current object.

```java
this.name = name;
```

Here:

* `this.name` → instance field of the current object
* `name` → constructor parameter