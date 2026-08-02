# Notes - While Loop

## What is a while Loop?

A while loop repeatedly executes a block of code as long as its condition is true.

Syntax:

java
while (condition) {
    // code
}


---

## How a while Loop Works

1. The condition is checked.
2. If the condition is true, the loop body executes.
3. The condition is checked again.
4. The process repeats until the condition becomes false.

---

## When to Use while

Use a while loop when:

- The number of iterations is unknown.
- You are waiting for user input.
- A loop should continue until a condition changes.

---

## while vs for

### for

- Best when the number of iterations is known.
- Initialization, condition, and update are written in one place.

### while

- Best when the number of iterations is unknown.
- Initialization is usually written before the loop.
- The update statement is written inside the loop.

---

## Infinite Loop

An infinite loop happens when the loop condition never becomes false.

Example:

java
int i = 1;

while (i <= 5) {
    System.out.println(i);
}


Problem:

The variable i is never updated, so the loop never ends.

Correct version:

java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}


---

## Common Mistakes

- Forgetting to update the counter variable.
- Writing an incorrect condition.
- Creating an infinite loop.
- Updating the wrong variable.

---

## Best Practices

- Use meaningful variable names.
- Keep the loop condition simple.
- Always make sure the loop can end.
- Choose for when the number of iterations is known.

---

# Quick Review

- while checks the condition before each iteration.
- If the condition is false initially, the loop never executes.
- while is useful when the number of repetitions is unknown.
- Always update the variable used in the condition.
- Forgetting the update usually causes an infinite loop.