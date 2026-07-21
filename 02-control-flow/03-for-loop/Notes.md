# Notes - 03 for Loop

## What is a for Loop?

A `for` loop is used when the number of repetitions is known or controlled by a counter.

General syntax:

```java
for (initialization; condition; update)
{
    // Code to repeat
}
```

---

## The Three Parts

### 1. Initialization

Runs only once before the loop starts.

Example:

```java
int i = 1;
```

---

### 2. Condition

Checked before every iteration.

If the condition is `true`, the loop continues.

If the condition is `false`, the loop stops.

Example:

```java
i <= 10
```

---

### 3. Update

Runs after every iteration.

Examples:

```java
i++
i--
i += 2
i -= 5
```

---

## Common Examples

### Count Up

```java
for (int i = 1; i <= 5; i++)
{
    System.out.println(i);
}
```

---

### Count Down

```java
for (int i = 5; i >= 1; i--)
{
    System.out.println(i);
}
```

---

### Even Numbers

```java
for (int i = 2; i <= 20; i += 2)
{
    System.out.println(i);
}
```

---

### Odd Numbers

```java
for (int i = 1; i <= 19; i += 2)
{
    System.out.println(i);
}
```

---

## Important Notes

- The initialization runs only once.
- The condition is checked before every iteration.
- The update runs after every iteration.
- The loop stops immediately when the condition becomes false.
- The loop variable is commonly named `i`, but any valid variable name can be used.

---

## Common Mistakes

### Forgetting to update the counter

```java
for (int i = 1; i <= 5;)
{
}
```

Result:

Infinite loop.

---

### Wrong condition

```java
for (int i = 1; i >= 5; i++)
{
}
```

Result:

The loop never executes.

---

### Wrong update direction

```java
for (int i = 1; i <= 10; i--)
{
}
```

Result:

Infinite loop.

---

## Interview Tips

Be able to explain:

- Why we use loops.
- The purpose of initialization, condition, and update.
- The difference between `i++`, `i--`, `i += 2`, and `i -= 2`.
- When a `for` loop is preferred over a `while` loop.

---

## Summary

A `for` loop is the preferred choice when the number of iterations is known in advance. It combines initialization, condition checking, and updating in a single, clean statement, making the code easier to read and maintain.

---

## Quick Review

✓ A `for` loop is used when the number of iterations is known.

✓ Initialization runs only once.

✓ The condition is checked before every iteration.

✓ The update runs after every iteration.

✓ The loop ends when the condition becomes false.

✓ `i++` increases by 1.

✓ `i--` decreases by 1.

✓ `i += n` increases by n.

✓ `i -= n` decreases by n.

✓ Choose clear variable names and keep your loop readable.