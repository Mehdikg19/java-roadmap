````markdown
# Java Roadmap Project

## Project Information

- **Project:** Java Roadmap
- **Phase:** 4 — OOP Basics
- **Lesson:** 05 — Packages
- **Status:** In Progress

## Topic

Java Packages

## Objective

Understand how Java packages organize classes and how to use `import` and fully qualified names to access classes and interfaces from other packages.

## Prerequisites

- Classes and Objects
- Methods
- Constructors
- The `this` Keyword
- Static Members
- Basic Java syntax
- Basic understanding of classes and interfaces

## Learning Outcomes

After completing this lesson, you should be able to:

- Understand the purpose of packages in Java.
- Declare a package using the `package` statement.
- Understand the relationship between package names and directory structure.
- Import classes and interfaces using `import`.
- Use fully qualified names without importing types.
- Understand the difference between a package declaration and an import declaration.
- Recognize common package-related compilation errors.
- Understand that access modifiers affect accessibility across packages.

## Files

### Java Source Files

```text
05-packages/
├── README.md
├── Notes.md
├── Resources.md
├── Completed.md
└── src/
    └── oopbasics/
        └── packages/
            ├── Example01.java
            ├── Example02.java
            ├── Exercise01.java
            ├── Exercise02.java
            └── Playground.java
````

## Key Concepts

### 1. Packages

A package groups related Java classes and interfaces under a common namespace.

Example:

```java
package oopbasics.packages;
```

The package declaration identifies the package to which the class belongs.

### 2. Import Statements

The `import` statement allows a class or interface to be referenced by its simple name instead of its fully qualified name.

Example:

```java
import java.util.List;
import java.util.ArrayList;
```

### 3. Fully Qualified Names

A fully qualified name includes the package name and the type name.

Example:

```java
java.util.List<String> languages =
        new java.util.ArrayList<>();
```

Fully qualified names can be used without importing the referenced types.

### 4. Package and Directory Structure

Package names normally correspond to directory structures in Java source projects.

For example:

```text
src/oopbasics/packages/Example01.java
```

corresponds to:

```java
package oopbasics.packages;
```

### 5. Access Across Packages

Accessing a type from another package depends on its accessibility.

A `public` class can be accessed from another package when the relevant visibility and compilation requirements are satisfied.

The `import` statement does not override access restrictions.

## Syntax

### Declaring a Package

```java
package packageName;
```

### Importing a Type

```java
import packageName.ClassName;
```

### Importing Types from a Package

```java
import packageName.*;
```

A wildcard import makes eligible types in that package available by their simple names. It does not import types from subpackages.

### Using a Fully Qualified Name

```java
packageName.ClassName object = new packageName.ClassName();
```

## Example Explanations

### Example01.java — Package Declaration

Introduces the `package` statement and demonstrates how a class belongs to the `oopbasics.packages` package.

### Example02.java — Packages and Imports

Demonstrates importing `List` and `ArrayList` from `java.util` and using their simple names in a Java program.

## Common Mistakes

* Omitting the package declaration when the class is intended to belong to a named package.
* Using a package declaration that does not match the intended project structure.
* Forgetting to import a type when using its simple name.
* Assuming `import` creates an object or executes a class.
* Assuming an import statement grants access to non-public types or members.
* Confusing a package with a directory, even though package names normally map to directories in a Java project.
* Assuming wildcard imports include subpackages.
* Confusing compilation errors with runtime errors when a type cannot be resolved.

## Topic Summary

Packages provide a namespace for organizing Java classes and interfaces.

The `package` statement declares a class's package, while `import` allows types to be referenced by their simple names.

Fully qualified names provide another way to reference types without import statements.

Understanding package structure and accessibility is essential for organizing larger Java applications and working with external libraries.

## Summary

Key points to remember:

* `package` declares the package of a class.
* `import` allows types to be referenced by their simple names.
* Fully qualified names can be used without imports.
* Package organization improves code structure and helps avoid naming conflicts.
* Access modifiers determine whether types and members can be accessed across packages.

## Next Lesson

**Phase 5 — OOP Advanced / 01 — Encapsulation**
