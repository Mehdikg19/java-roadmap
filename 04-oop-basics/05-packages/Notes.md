# Notes — 05 Packages

## 1. Package Fundamentals

A package is a namespace used to organize related Java classes and interfaces.

Example:

    package oopbasics.packages;

This declaration places the class in the `oopbasics.packages` package.

### Benefits of Packages

- Organize classes into logical groups.
- Help prevent naming conflicts between classes.
- Support access control.
- Make larger projects easier to maintain.

## 2. Package Declaration

A package declaration identifies the package to which a class belongs.

Example:

    package oopbasics.packages;

    public class Example01
    {
        public static void main(String[] args)
        {
            System.out.println("Java Packages");
        }
    }

### Important Rules

- The package declaration must appear before import declarations and class declarations.
- Comments may appear before the package declaration.
- A package name normally corresponds to the directory structure.
- Classes in the same package can generally refer to one another by simple name, subject to accessibility rules.

Example directory:

    src/
    └── oopbasics/
        └── packages/
            └── Example01.java

Corresponding declaration:

    package oopbasics.packages;

## 3. Import Statements

An `import` declaration allows a type to be referenced by its simple name.

Example:

    package oopbasics.packages;

    import java.util.ArrayList;
    import java.util.List;

    public class Example02
    {
        public static void main(String[] args)
        {
            List<String> students = new ArrayList<>();

            students.add("Sara");
            students.add("Ali");

            System.out.println(students);
        }
    }

Without the imports, the types can still be referenced using their fully qualified names.

### Import Rules

- The package declaration, if present, comes before imports.
- Import declarations come before the class declaration.
- Imports do not create objects.
- Imports do not execute code.
- Imports do not grant additional access to restricted classes or members.
- Importing a type does not import its entire package hierarchy.

## 4. Fully Qualified Names

A fully qualified name contains the package name followed by the type name.

Example:

    java.util.List<String> languages =
            new java.util.ArrayList<>();

This works without importing `List` or `ArrayList`.

### Two Ways to Reference a Type

**Using imports:**

    import java.util.ArrayList;
    import java.util.List;

    List<String> languages = new ArrayList<>();

**Using fully qualified names:**

    java.util.List<String> languages =
            new java.util.ArrayList<>();

Both approaches can reference the same types.

Imports are usually more readable when a type is used multiple times.

## 5. Importing a Package

A wildcard import can make eligible types from a package available by their simple names.

Example:

    import java.util.*;

This allows eligible types in `java.util` to be referenced by simple name.

**Important:** A wildcard import does not import types from subpackages.

For example, importing `java.util.*` does not automatically import types from `java.util.concurrent`.

For clarity, explicit imports are often preferred when only a few types are needed.

## 6. The `java.lang` Package

Java automatically makes types from `java.lang` available by their simple names.

Examples include:

- `String`
- `System`
- `Math`
- `Integer`
- `Object`

Therefore, a normal Java program does not need this import:

    import java.lang.String;

For example:

    String language = "Java";
    System.out.println(language);

Both `String` and `System` can be used without explicit imports.

## 7. Packages and Access Modifiers

Access modifiers affect whether classes and members can be accessed from other packages.

### Public

A `public` class can generally be accessed from other packages when the required compilation and module-access conditions are satisfied.

### Package-Private

A top-level class without an access modifier has package-private access.

It is accessible only within its own package.

Example:

    class InternalHelper
    {
    }

The class `InternalHelper` is not directly accessible by its simple name from another package.

### Important Distinction

An import statement does not change a type's access level.

A type must be accessible before it can be used, regardless of whether it is imported.

## 8. Common Compilation Errors

### Missing Import

Using a type by its simple name without importing it or otherwise making it available can cause a compilation error.

Example:

    List<String> languages = new ArrayList<>();

If neither type is imported and no applicable declaration makes the names available, the compiler cannot resolve them.

### Incorrect Package Declaration

A package declaration that does not match the intended source layout or project configuration can cause source organization or compilation problems.

### Incorrect Class Name

The public class name must match the source filename.

For example, `Exercise01.java` should declare:

    public class Exercise01
    {
    }

### Compile-Time Error vs. Runtime Error

A missing or unresolved type is a compile-time problem.

The program cannot successfully compile until the issue is corrected.

A runtime error occurs after a program has started executing.

## 9. Packages, Lists, and Collections

This lesson uses `List` and `ArrayList` to practise imports.

    import java.util.ArrayList;
    import java.util.List;

    List<String> students = new ArrayList<>();

- `List` is an interface.
- `ArrayList` is a class that implements `List`.
- `new ArrayList<>()` creates an `ArrayList` object.
- `add()` appends an element to the list.
- `size()` returns the number of elements.
- `contains()` checks whether an element is present.
- `ArrayList` allows duplicate elements.

Example:

    students.add("Ali");
    students.add("Sara");
    students.add("Ali");

    System.out.println(students.size());
    System.out.println(students.contains("Ali"));

Expected output:

    3
    true

The list contains three elements, even though `"Ali"` appears twice.

## 10. Clean Code Practices

- Use meaningful package names.
- Keep related classes in appropriate packages.
- Use explicit imports when they improve readability.
- Avoid unnecessary fully qualified names throughout a class.
- Follow consistent naming conventions.
- Keep the source directory structure consistent with package declarations.
- Do not use imports as a substitute for understanding access modifiers.

## 11. Interview Notes

**Q1. What is a package in Java?**

A package is a namespace used to organize related types and help avoid naming conflicts.

**Q2. What is the purpose of the `package` statement?**

It declares the package to which a class belongs.

**Q3. What is the purpose of `import`?**

It allows types to be referenced by their simple names instead of their fully qualified names.

**Q4. Can a type be used without importing it?**

Yes. It can be referenced by its fully qualified name if it is accessible.

**Q5. Does `import java.util.*;` import subpackages?**

No. It applies to eligible types directly within `java.util`, not its subpackages.

**Q6. Does an import statement create an object?**

No. Objects are created through object-creation expressions, such as `new ArrayList<>()`.

**Q7. Does importing a class make a non-public class accessible?**

No. Importing a type does not override access restrictions.

**Q8. Why is `String` available without an import?**

Because `String` belongs to `java.lang`, whose types are automatically available by simple name.

**Q9. What happens if a type name cannot be resolved?**

The compiler reports a compilation error.

## 12. Quick Review

Before moving to the next lesson, make sure you can explain:

- What a Java package is and why it is useful.
- How to declare a package.
- How package names relate to source directories.
- How and when to use import statements.
- How to reference a type using its fully qualified name.
- Why wildcard imports do not include subpackages.
- Why `java.lang` types do not require explicit imports.
- How access modifiers affect access across packages.
- The difference between compile-time errors and runtime errors.
- How `List` and `ArrayList` are used in the lesson examples.

## Next Lesson

**Phase 5 — OOP Advanced / 01 — Encapsulation**