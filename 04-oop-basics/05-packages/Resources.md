# Resources — 05 Packages

## 1. Official Java Documentation

### Packages

**Resource:** The Java Tutorials — Creating and Using Packages

**Link:** https://docs.oracle.com/javase/tutorial/java/package/

**Purpose:**
- Understand Java packages.
- Learn package declaration syntax.
- Understand package naming conventions.
- Learn how packages organize Java types.

### Importing Types

**Resource:** The Java Language Specification — Imports

**Link:** https://docs.oracle.com/javase/specs/jls/se25/html/jls-7.html#jls-7.5

**Purpose:**
- Understand import declarations.
- Learn single-type and wildcard imports.
- Understand the limitations of wildcard imports.

### Package Declarations

**Resource:** The Java Language Specification — Package Declarations

**Link:** https://docs.oracle.com/javase/specs/jls/se25/html/jls-7.html#jls-7.4

**Purpose:**
- Understand package declaration rules.
- Learn how compilation units declare their packages.
- Review the relationship between package declarations and Java source files.

### Access Control

**Resource:** The Java Language Specification — Access Control

**Link:** https://docs.oracle.com/javase/specs/jls/se25/html/jls-6.html#jls-6.6

**Purpose:**
- Understand accessibility across packages.
- Review `public` and package-private access.
- Understand why imports do not override access restrictions.

## 2. Recommended Reading Order

1. Review the purpose and structure of Java packages.
2. Study package declaration syntax.
3. Learn how import declarations work.
4. Compare imports with fully qualified names.
5. Review wildcard imports and subpackages.
6. Study access control across packages.
7. Revisit the lesson examples and exercises.

## 3. Practical Study

Review the following concepts using the lesson's Java source files:

- `package` declarations
- `import` declarations
- Fully qualified names
- `java.lang` types
- Package accessibility
- `List` and `ArrayList`
- Compile-time errors caused by unresolved type names

## 4. Practice Questions

Use these questions to test your understanding:

1. What problem do Java packages solve?
2. What is the difference between a package declaration and an import declaration?
3. Can you use a class without importing it?
4. Does a wildcard import include subpackages?
5. Why can `String` be used without an explicit import?
6. Does importing a class make an inaccessible type accessible?
7. What happens when the compiler cannot resolve a type name?
8. Why is `List` commonly used as a reference type for an `ArrayList` object?

Try answering each question without consulting the lesson notes.

## 5. Resource Policy

- Prefer official Oracle documentation for Java language rules.
- Use the Java Language Specification when precise technical details are needed.
- Practise with the existing lesson files before introducing additional examples.
- Avoid collecting unnecessary resources before understanding the current topic.

## Next Lesson

**Phase 5 — OOP Advanced / 01 — Encapsulation**