do-while Loop

Topic Introduction

The do-while loop is a repetition structure that executes its body first and checks its condition afterward.

Its most important characteristic is:

A do-while loop always executes its body at least once.

This makes it different from the while loop.

Learning Objectives

By the end of this topic, you should be able to:

Explain how a do-while loop works.

Write correct do-while syntax.

Trace a do-while loop step by step.

Explain why the loop executes at least once.

Compare while and do-while.

Use a do-while loop for appropriate problems.

Identify and prevent infinite loops.

Understand the role of the loop-control variable.

Basic Syntax

do { // statements } while (condition); 

The semicolon after the condition is required.

Execution Flow

Execute the body ↓ Check the condition ↓ ┌───┴───┐ true false ↓ ↓ repeat exit 

while vs do-while

while

Check condition ↓ true → execute body false → skip body 

A while loop can execute zero times.

do-while

Execute body ↓ Check condition ↓ true → repeat false → exit 

A do-while loop always executes at least once.

Examples

Example01

Demonstrates the normal execution of a do-while loop by printing numbers from 1 to 5.

Before running the program, predict the output and trace the value of the loop-control variable.

Example02

Demonstrates that the body executes once even when the condition is initially false.

Before running the program, predict the output and explain why the body still executes.

Exercises

Exercise01

Print the numbers from 1 to 10 using a do-while loop.

Exercise02

Print the even numbers from 2 to 20 using a do-while loop.

Common Mistakes

1. Forgetting the semicolon

Correct:

} while (condition); 

2. Forgetting to update the control variable

This can create an infinite loop.

3. Confusing while and do-while

Remember:

while → condition first do-while → body first 

4. Choosing the wrong loop

Use do-while when at least one execution is required.

Key Takeaway

The most important idea in this lesson is the execution order:

while: condition → body → condition → ... do-while: body → condition → body → ... 

Next Topic

break and continue