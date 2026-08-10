02-Control Flow — 06-break-continue

Project Information

Project: Java Roadmap
Module: 02 - Control Flow
Topic: 06 - break and continue

---

Important Concepts

break

"break" immediately terminates the nearest enclosing loop.

break;

After "break" executes, control moves to the first statement after that loop.

"break" does not automatically terminate the entire Java program.

---

continue

"continue" skips the remaining statements of the current loop iteration.

continue;

The loop then proceeds with its next iteration.

For a "for" loop, after "continue", the update expression is still reached before the next condition check.

For example:

for (int i = 1; i <= 10; i++)
{
    if (i == 5)
    {
        continue;
    }

    System.out.println(i);
}

The number "5" is not printed, but the loop continues with the next value.

---

Syntax

break

for (...)
{
    if (condition)
    {
        break;
    }
}

continue

for (...)
{
    if (condition)
    {
        continue;
    }

    // Remaining statements
}

---

Important Rules

Rule 1 — break stops the nearest loop

If "break" is inside nested loops, it terminates only the nearest enclosing loop.

Outer Loop
    ↓
Inner Loop
    ↓
break
    ↓
Inner Loop ends
    ↓
Outer Loop continues

---

Rule 2 — continue skips only the current iteration

"continue" does not terminate the loop.

It skips the remaining statements of the current iteration.

---

Rule 3 — statements after continue are skipped

Example:

if (condition)
{
    continue;
}

System.out.println("Hello");

If the condition is true, ""Hello"" is not executed for that iteration.

---

Rule 4 — continue in a for loop reaches the update step

Conceptually:

condition
   ↓
body
   ↓
continue
   ↓
update expression
   ↓
condition

This is important when analyzing "for" loops.

---

Rule 5 — break does not mean program termination

Consider:

for (int i = 1; i <= 10; i++)
{
    if (i == 5)
    {
        break;
    }
}

System.out.println("Done");

"Done" is still printed because the "break" only terminated the loop.

---

Common Mistakes

Mistake 1 — Treating continue like break

Incorrect assumption:

«"continue" stops the loop.»

Correct:

«"continue" skips the current iteration.»

---

Mistake 2 — Treating break like System.exit()

"break" does not terminate the whole program.

It terminates the nearest loop or switch statement in which it is used.

---

Mistake 3 — Forgetting the nearest-loop rule

In nested loops, "break" and "continue" apply to the nearest enclosing loop.

---

Mistake 4 — Expecting code after continue to execute

This code:

continue;

System.out.println(i);

does not execute the "println" during that iteration.

---

Mistake 5 — Misreading nested-loop output

When analyzing nested loops, track the outer and inner loop variables separately.

---

Best Practices

- Use "break" when a meaningful termination condition has been reached.
- Use "continue" when skipping an iteration improves clarity.
- Avoid unnecessary use of "break" and "continue".
- Prefer readable conditions.
- Keep loop bodies simple.
- Be especially careful with nested loops.
- Predict the execution before running the code.

---

Interview Notes

Question 1

What is the difference between "break" and "continue"?

Answer:

"break" terminates the nearest loop, while "continue" skips the current iteration and allows the loop to continue.

Question 2

Does "break" terminate the entire program?

Answer:

No. It terminates the nearest enclosing loop or switch statement.

Question 3

What happens when "continue" is executed inside a "for" loop?

Answer:

The remaining statements in the current iteration are skipped. The "for" loop then proceeds through its update expression and checks its condition for the next iteration.

Question 4

What happens when "break" is used inside a nested loop?

Answer:

It terminates only the nearest enclosing loop.

---

Practical Observation

During the Playground experiments, we observed that:

- "break" stops the nearest loop.
- "continue" skips the current iteration.
- Neither statement automatically terminates the entire program.
- Nested loops require careful tracking of which loop is affected.

---

Summary

Remember:

break    → exit the nearest loop
continue → skip the current iteration

In nested loops:

both affect the nearest enclosing loop

---

Quick Review

✓ "break" terminates the nearest loop.
✓ "continue" skips the current iteration.
✓ "break" does not terminate the entire program.
✓ "continue" allows the loop to continue.
✓ In nested loops, both affect the nearest enclosing loop.
✓ Common mistake: confusing "continue" with "break".
✓ Best practice: use them only when they make loop logic clearer.