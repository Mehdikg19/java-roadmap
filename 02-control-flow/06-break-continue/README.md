02-Control Flow — 06-break-continue

Project Information

Project: Java Roadmap
Module: 02 - Control Flow
Topic: 06 - break and continue

---

Overview

This topic introduces the "break" and "continue" statements in Java.

These statements provide additional control over loop execution.

"break" is used to terminate the current loop, while "continue" skips the remaining statements of the current iteration and proceeds with the next iteration.

---

Learning Objectives

By completing this topic, you should be able to:

- Understand the purpose of "break".
- Understand the purpose of "continue".
- Explain the difference between "break" and "continue".
- Use "break" inside loops.
- Use "continue" inside loops.
- Understand their behavior in nested loops.
- Predict loop behavior before execution.
- Recognize common mistakes involving loop control statements.

---

Prerequisites

Before studying this topic, you should understand:

- "if" statements
- "for" loops
- "while" loops
- "do-while" loops
- Boolean conditions
- Relational operators
- Logical operators
- Modulus operator "%"

---

Key Concepts

1. break

The "break" statement immediately terminates the nearest enclosing loop.

Example:

for (int i = 1; i <= 10; i++)
{
    if (i == 6)
    {
        break;
    }

    System.out.println(i);
}

Output:

1
2
3
4
5

When "i" becomes "6", "break" terminates the loop.

---

2. continue

The "continue" statement skips the remaining code in the current iteration and continues with the next iteration.

Example:

for (int i = 1; i <= 10; i++)
{
    if (i % 2 == 0)
    {
        continue;
    }

    System.out.println(i);
}

Output:

1
3
5
7
9

Even numbers are skipped.

---

3. break vs continue

Statement| Behavior
"break"| Terminates the nearest loop
"continue"| Skips the current iteration
"break"| Loop does not continue
"continue"| Loop continues with the next iteration

---

Nested Loops

Both "break" and "continue" affect the nearest enclosing loop.

For example:

for (int i = 1; i <= 3; i++)
{
    for (int j = 1; j <= 3; j++)
    {
        if (j == 2)
        {
            break;
        }

        System.out.println(i + " " + j);
    }
}

Here, "break" terminates the inner "j" loop.

The outer "i" loop continues.

---

Examples

Example01

Demonstrates how "break" stops a loop completely.

Example02

Demonstrates how "continue" skips even numbers while allowing the loop to continue.

---

Exercises

Exercise01

Finds the first number between 1 and 20 that is divisible by both 3 and 5.

The loop stops using "break".

Exercise02

Prints odd numbers from 1 to 20 by using "continue" to skip even numbers.

---

Playground

The Playground explores:

1. "break" in nested loops.
2. "continue" in nested loops.
3. Combining "continue" and "break".

The purpose is to observe how these statements affect loop execution.

---

Common Mistakes

- Confusing "break" with "continue".
- Assuming "continue" terminates the loop.
- Assuming "break" terminates the entire program.
- Forgetting that "break" and "continue" affect the nearest enclosing loop.
- Forgetting that statements after "continue" in the current iteration are skipped.
- Misunderstanding the execution order of a "for" loop after "continue".

---

Summary

"break" and "continue" provide fine-grained control over loops.

Use:

break;

when the loop should stop completely.

Use:

continue;

when the current iteration should be skipped but the loop should continue.

Understanding these statements is important for writing clear loops and for correctly reasoning about nested loop execution.

---

Next Lesson

03 - Methods and Arrays