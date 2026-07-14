# Notes - Switch Statement

## Project Information

- **Project:** Java Roadmap
- **Module:** 02 - Control Flow
- **Topic:** Switch Statement

---

# What is a Switch Statement?

The `switch` statement is a control flow statement that selects one block of code to execute from multiple possible options based on the value of a single expression.

It is often used as a cleaner alternative to multiple `if-else` statements when comparing the same variable with different constant values.

---

# Syntax

```java
switch (expression) {

    case value1:

        // Code
        break;

    case value2:

        // Code
        break;

    default:

        // Code

}
```

---

# How Switch Works

1. The expression is evaluated once.
2. Java compares the result with each `case`.
3. If a matching `case` is found, its code is executed.
4. The `break` statement exits the `switch`.
5. If no `case` matches, the `default` block is executed.

---

# Components of a Switch Statement

## switch

Evaluates a single expression.

```java
switch (day)
```

---

## case

Represents a possible matching value.

```java
case 1:
```

---

## break

Stops the execution of the `switch` statement.

```java
break;
```

Without `break`, Java continues executing the following cases.

This behavior is called **Fall-through**.

---

## default

Executes when no `case` matches.

```java
default:

    System.out.println("Invalid Value");
```

The `default` block is optional.

---

# Supported Data Types

A `switch` statement can work with:

- byte
- short
- int
- char
- String
- Enum

---

# Important Rules

- The expression is evaluated only once.
- Each `case` value must be unique.
- `break` prevents fall-through.
- `default` is optional but recommended.
- `switch` is useful when comparing one variable against many fixed values.

---

# Common Mistakes

❌ Forgetting `break`

```java
case 1:

    System.out.println("One");
```

Result:

Execution continues into the next case.

✔

```java
case 1:

    System.out.println("One");
    break;
```

---

❌ Duplicate case values

```java
case 1:
case 1:
```

Result:

Compilation Error

---

❌ Comparing ranges with switch

```java
case value > 10:
```

Result:

Not Allowed

Use `if-else` instead.

---

# Interview Tips

- Use `switch` when comparing one variable with multiple constant values.
- Use `if-else` for ranges or complex conditions.
- `String` is supported in `switch` since Java 7.
- `break` is usually required unless fall-through is intentional.

---

# Summary

After this topic you can:

- Write a `switch` statement.
- Use `case`, `break`, and `default` correctly.
- Create `switch` statements with `int` and `String`.
- Explain fall-through behavior.
- Decide when to use `switch` instead of `if-else`.