# Module 04 — Notes

## Scanner Class

The Scanner class is used to read user input from the keyboard.

Before using Scanner, import the package:

java
import java.util.Scanner;


Create a Scanner object:

java
Scanner input = new Scanner(System.in);


---

# Scanner Methods

## next()

Reads one word only.

Stops reading when it reaches a space.

Example

Input


Hello World


Output


Hello


---

## nextLine()

Reads an entire line, including spaces.

Example

Input


Hello World


Output


Hello World


---

## nextInt()

Reads an integer value.

Example

java
int age = input.nextInt();


---

## nextDouble()

Reads a decimal number.

Example

java
double height = input.nextDouble();


---

# Scanner Buffer Problem

One of the most common beginner mistakes.

Example

java
int age = input.nextInt();
String name = input.nextLine();


The program does not wait for the user's name.

Reason:

nextInt() reads only the integer.

The Enter key (↵) remains inside the Scanner buffer.

Then:

java
nextLine();


reads the remaining Enter immediately.

Result


name = ""


---

# Correct Solution

Always clear the buffer before calling nextLine().

java
int age = input.nextInt();

input.nextLine();

String name = input.nextLine();


---

# Difference Between next() and nextLine()

| Method | Reads |
|---------|-------|
| next() | One word |
| nextLine() | Entire line |

---

# Best Practices

- Always close the Scanner object.

java
input.close();


- Use meaningful prompts.

Example

`
Enter your age