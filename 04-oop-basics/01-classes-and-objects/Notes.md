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

## Practical Notes

A class is a definition used to describe the structure and behavior of objects.

An object is an instance created from a class.

Example:

    class Book {

        String title;
        int pages;

        void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Pages: " + pages);
        }
    }

Creating an object:

    Book book1 = new Book();

The reference variable book1 refers to the newly created Book object.

Object state can then be changed through the reference:

    book1.title = "Java Programming";
    book1.pages = 500;

Object behavior can be invoked through the reference:

    book1.displayInfo();

---

## Important Java Behavior

### Class vs Object

A class is a definition.

An object is an actual instance created from that definition.

    Class
      ↓
    Definition

    Object
      ↓
    Actual Instance

A single class can be used to create many objects.

---

### Object State

Instance variables hold state belonging to an individual object.

For example:

    Book book1 = new Book();
    Book book2 = new Book();

    book1.pages = 500;
    book2.pages = 464;

The two objects have independent pages values.

Changing:

    book1.pages = 600;

does not change:

    book2.pages

because book1 and book2 refer to different objects.

---

### Object Behavior

Methods defined inside a class can represent object behavior.

For example:

    void displayInfo() {
        System.out.println("Title: " + title);
    }

The method can be invoked through an object:

    book1.displayInfo();

The method operates using the state of the object through which it is invoked.

---

### Reference Variables

A variable such as:

    Book book1;

declares a reference variable.

It does not by itself create a Book object.

Object creation occurs with:

    new Book();

For example:

    Book book1 = new Book();

Conceptually:

    book1 ─────→ Book Object

---

### Multiple References to One Object

Consider:

    Car car1 = new Car();
    Car car2 = car1;

Only one Car object is created.

There are two reference variables:

    car1 ──┐
           ├──→ Car Object
    car2 ──┘

Therefore, changing the object through car1 can be observed through car2.

Example:

    car1.brand = "Toyota";

    System.out.println(car2.brand);

Output:

    Toyota

---

### new and Reference Assignment

A useful rule for this topic:

    new
    → creates a new object

    Reference assignment
    → makes another reference point to an existing object

For example:

    Car car1 = new Car();
    Car car2 = new Car();

creates two objects.

But:

    Car car3 = car1;

does not create another object.

---

## Compiler/Runtime Observations

A typo inside a string literal, such as:

    System.out.println("Studen's Name: " + name);

does not cause a compiler error if the Java syntax remains valid.

The program can compile and run while producing incorrectly written output.

This demonstrates that not every programming mistake is a compiler error.

Some problems are semantic, presentation, or code-quality issues.

---

## Prediction and Execution

Examples and exercises followed the project rule:

    Read
      ↓
    Predict
      ↓
    Execute
      ↓
    Compare
      ↓
    Explain

Predictions were made before execution for the examples and exercises.

The predicted outputs matched the actual outputs.

---

## Clean Code Tips

- Use meaningful class names.
- Use PascalCase for class names.
- Use camelCase for variables and methods.
- Use consistent indentation.
- Avoid unnecessary spaces around punctuation.
- Keep examples simple when introducing a new concept.
- Prefer clear names such as student1, book1, and car1.
- Keep each example focused on the concept being taught.

---

## Interview Notes

### Question
What is the difference between a class and an object?

### Key Answer

A class defines the structure and behavior, while an object is an instance created from that class.

---

### Question

Does declaring a reference variable create an object?

### Key Answer

No.

    Car car;

declares a reference variable.

An object is created with:

    new Car();

---

### Question

How many objects are created here?

    Car car1 = new Car();
    Car car2 = new Car();

Answer:

Two objects.

---

### Question

How many objects are created here?

    Car car1 = new Car();
    Car car2 = car1;

Answer:

One object and two reference variables.

---

### Question

Why does changing car1.brand not affect car2.brand in this case?

    Car car1 = new Car();
    Car car2 = new Car();

Because car1 and car2 refer to different objects.

---

## Common Mistakes

- Thinking a class itself is an object.
- Thinking a reference declaration automatically creates an object.
- Forgetting that new creates the object.
- Assuming objects created from the same class share instance variables.
- Assuming car2 = car1 creates a new object.
- Confusing reference variables with objects.
- Ignoring output formatting and spelling during code review.

---

## Quick Review

- A class defines structure and behavior.
- An object is an instance of a class.
- new creates a new object.
- A reference variable can refer to an object.
- Instance variables represent object state.
- Instance methods represent object behavior.
- Multiple objects can be created from one class.
- Separate objects have independent instance state.
- Multiple references can point to the same object.
- Car car2 = car1; copies a reference, not an object.

---

## Status

Completed