Notes — do-while Loop

1. Definition

A do-while loop is a repetition structure in Java where the loop body executes before the condition is evaluated.

Because of this execution order, the body always executes at least once.

2. Syntax

do { // statements } while (condition); 

The semicolon after the condition is mandatory.

3. Execution Order

The execution flow is:

1. Execute body 2. Update state if necessary 3. Evaluate condition 4. If true → repeat 5. If false → exit 

4. while vs do-while

Featurewhiledo-whileCondition checkedBefore bodyAfter bodyMinimum executions01Best whenZero executions may be validAt least one execution is required 

5. Important Concept

Consider:

int number = 10; do { System.out.println(number); } while (number < 5); 

The condition is initially false:

10 < 5 → false 

But the output is still:

10 

Why?

Because the body is executed before the condition is checked.

6. Loop-Control Variable

A loop usually needs a state that changes during execution.

Example:

int number = 1; do { System.out.println(number); number++; } while (number <= 5); 

The statement:

number++; 

allows the loop to progress toward termination.

7. Infinite Loops

This code can run forever:

int number = 1; do { System.out.println(number); } while (number <= 5); 

The value of number never changes.

Therefore:

number <= 5 

remains true.

8. Behind the Scenes

At the Java language level, do-while is a post-test loop.

Conceptually:

┌───────────────┐ ↓ │ Execute body │ ↓ │ Check condition │ ↓ │ true ──────────────┘ │ false ↓ Exit 

Java source code is compiled into bytecode before execution. The important conceptual point is that the first body execution occurs before the condition test.

9. Clean Code Tips

Use meaningful variable names.

Keep the loop body focused.

Make the termination condition easy to understand.

Update the control variable clearly.

Avoid unnecessary nesting.

Prefer while when zero executions are logically valid.

10. Interview Questions

Question 1

What is the main difference between while and do-while?

Answer:
while checks the condition before executing the body, while do-while executes the body first and checks the condition afterward.

Question 2

Can a do-while loop execute zero times?

Answer:
No. Its body always executes at least once.

Question 3

What happens if the initial condition is false?

Answer:
The body executes once, then the condition is checked and the loop terminates.

Question 4

Why can a do-while loop become infinite?

Answer:
If the condition never becomes false, usually because the loop-control state is not updated correctly.

Quick Review

do-while executes the body first.

The condition is checked afterward.

The body executes at least once.

A semicolon is required after the condition.

The control variable must eventually allow termination.

while can execute zero times.

do-while cannot execute zero times.

Choose the loop based on the required behavior.