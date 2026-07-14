# NOTES

---

## Project Information

**Project:** Java Roadmap

**Module:** 02 - Control Flow

**Topic:** 01 - if-else

---

# Important Concepts

## if Statement

The `if` statement executes a block of code only when its condition is `true`.

Syntax:

```java
if (condition) {
    // code
}
```

---

## if-else Statement

The `else` block executes when the `if` condition is `false`.

Syntax:

```java
if (condition) {
    // code
} else {
    // code
}
```

---

## else if Statement

Use `else if` when multiple conditions need to be checked.

Syntax:

```java
if (condition1) {

} else if (condition2) {

} else {

}
```

---

## Nested if

An `if` statement can be placed inside another `if` statement.

Example:

```java
if (age >= 18) {

    if (hasLicense) {
        System.out.println("You can drive.");
    }

}
```

---

# Important Rules

- Every `if` condition must evaluate to a boolean value.
- Parentheses `()` are required around the condition.
- Curly braces `{}` are recommended even for a single statement.
- Only the first matching condition in an `if-else if-else` chain is executed.
- After one condition is satisfied, the remaining conditions are skipped.

---

# Common Mistakes

### 1. Using assignment instead of comparison

Incorrect

```java
if (number = 10) {

}
```

Correct

```java
if (number == 10) {

}
```

---

### 2. Forgetting braces

Incorrect

```java
if (age >= 18)
    System.out.println("Adult");
    System.out.println("Finished");
```

Correct

```java
if (age >= 18) {
    System.out.println("Adult");
    System.out.println("Finished");
}
```

---

### 3. Incorrect condition order

Always place the most specific conditions before more general ones when using `else if`.

---

# Best Practices

- Write simple and readable conditions.
- Avoid deeply nested `if` statements whenever possible.
- Use meaningful variable names.
- Keep each condition focused on a single purpose.
- Prefer `switch` instead of long `else if` chains when checking a single variable against many constant values.

---

# Summary

The `if-else` statement is the primary decision-making structure in Java. It allows programs to execute different code paths based on conditions. Understanding conditional statements is essential before learning loops and more advanced control flow structures.