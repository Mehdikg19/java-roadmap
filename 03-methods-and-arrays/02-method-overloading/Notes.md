02-Method Overloading

Project Information

- Project: Java Roadmap Project
- Phase: Phase 3 — Methods and Arrays
- Module: 03-methods-and-arrays
- Lesson: 02-method-overloading
- Language: Java

Topic

Method Overloading — Notes

Purpose

Record the important practical behavior, rules, observations, common
mistakes, clean code considerations, and interview points related to
method overloading.

Method Overloading

Method overloading means defining multiple methods with the same name
but different parameter lists.

Example:

public static int calculate(int a, int b) {
    return a + b;
}

public static double calculate(double a, double b) {
    return a + b;
}

Both methods have the same name, but their parameter types are
different.

Overloading by Number of Parameters

Methods can be overloaded by changing the number of parameters.

Example:

public static int calculate(int a, int b) {
    return a + b;
}

public static int calculate(int a, int b, int c) {
    return a + b + c;
}

The methods have different parameter lists and are therefore valid
overloads.

Overloading by Parameter Type

Methods can be overloaded by changing the parameter type.

Example:

public static int display(int number) {
    return number;
}

public static long display(long number) {
    return number;
}

public static double display(double number) {
    return number;
}

The methods have the same name but different parameter types.

Overloading by Parameter Order

Methods can also be overloaded by changing the order of parameter
types.

Example:

public static void display(int number, double value) {
    // ...
}

public static void display(double number, int value) {
    // ...
}

The parameter lists are different because their parameter types occur
in a different order.

Method Signature

For overloading, the parameter list is the important part of the
method signature.

The parameter list includes:

- Number of parameters.
- Types of parameters.
- Order of parameter types.

The method name and parameter list allow Java to distinguish overloaded
methods.

Return Type

Return type alone cannot create a valid overload.

Invalid example:

public static int calculate(int a, int b) {
    return a + b;
}

public static double calculate(int a, int b) {
    return a + b;
}

Both methods have the same name and the same parameter list.

Changing only the return type does not create a different method
signature.

This causes a compile-time error.

Parameters and Arguments

A parameter is a variable declared in a method definition.

Example:

public static int calculate(int a, int b) {
    return a + b;
}

Here:

- "a" is a parameter.
- "b" is a parameter.

An argument is the actual value passed when the method is called.

Example:

calculate(10, 20);

Here:

- "10" is an argument.
- "20" is an argument.

Exact Match

When an argument has the same type as a parameter, Java can use the
exact matching overloaded method.

Example:

public static void display(int number) {
    System.out.println("int");
}

public static void display(long number) {
    System.out.println("long");
}

int value = 10;

display(value);

The argument is an "int", so "display(int)" is an exact match.

Output:

int

Exact matching should be considered before widening conversions.

Widening Primitive Conversion

Java allows certain primitive values to be widened to compatible
larger types.

Common widening conversions include:

byte → short → int → long → float → double

Another important conversion chain is:

char → int → long → float → double

Example:

public static void display(long number) {
    System.out.println("long");
}

int value = 10;

display(value);

The "int" value can be widened to "long".

Therefore, the method can be called successfully.

Overload Resolution

When Java encounters an overloaded method call, it determines which
method is applicable.

A useful reasoning process is:
1. Identify the argument types.
2. Compare the arguments with the available parameter lists.
3. Check for an exact match.
4. If necessary, consider applicable widening conversions.
5. Select the most appropriate applicable method.
6. If no applicable method exists, compilation fails.

Example:

public static void display(int number) {
    System.out.println("int");
}

public static void display(long number) {
    System.out.println("long");
}

public static void display(double number) {
    System.out.println("double");
}

short value = 10;

display(value);

The argument is "short".

"short" can be widened to "int".

It can also be widened further to "long" and "float"/"double".

The "int" overload is the closest applicable widening conversion.

Therefore:

Output:

int

Important Observation

Java does not select an overloaded method because it appears first in
the source code.

The compiler applies overload resolution rules.

For example:

public static void display(long number) {
    System.out.println("long");
}

public static void display(int number) {
    System.out.println("int");
}

int value = 10;

display(value);

The result is still:

int

The position of the methods in the source code does not determine
which overload is selected.

Compile-Time Behavior

Method overloading is resolved at compile time.

The compiler examines the method invocation and determines which
overloaded method is applicable.

This is why method overloading is associated with compile-time
polymorphism.

Runtime Behavior

After compilation, the selected method is executed by the JVM.

Method overloading should not be confused with method overriding.

Overloading and Overriding

Method Overloading:

- Same method name.
- Different parameter lists.
- Usually occurs in the same class.
- Resolved at compile time.

Method Overriding:

- Requires inheritance.
- Same method signature.
- Subclass provides a different implementation.
- Associated with runtime polymorphism.

This topic focuses on method overloading.

Common Mistakes

1. Using only the return type to overload a method.

2. Confusing parameters with arguments.

3. Assuming the first matching method is selected.

4. Ignoring the exact type of the argument.

5. Forgetting about widening primitive conversion.

6. Assuming Java chooses an overload based on the return type.

7. Confusing overloading with overriding.

8. Forgetting that overload resolution happens at compile time.

9. Creating overloaded methods that represent unrelated operations.

10. Not predicting the selected overload before running the program.

Clean Code Tips

- Use the same method name only when the overloaded methods represent
  the same logical operation.
- Keep overloaded methods easy to understand.
- Use meaningful parameter names.
- Keep behavior consistent between overloads.
- Avoid unnecessary overloads.
- Prefer readable APIs over excessive method variations.
- Do not use overloading merely to make code look shorter.

Interview Notes

Question:

What is method overloading?

Answer:

Method overloading is defining multiple methods with the same name
but different parameter lists.

Question:

Can Java overload methods by changing only the return type?

Answer:

No.

The parameter list must be different.

Question:

Can methods be overloaded by changing the number of parameters?

Answer:

Yes.

Question:

Can methods be overloaded by changing parameter types?

Answer:

Yes.

Question:

Can parameter order create a different overload?

Answer:

Yes, when the resulting parameter lists are different.

Question:

What happens when an exact match exists?

Answer:

The exact matching overload is preferred.

Question:

Can an "int" argument be passed to a "long" parameter?

Answer:

Yes.

This is a widening primitive conversion.

Question:

Can a "float" argument be passed to a "double" parameter?

Answer:

Yes.

"float" can be widened to "double".

Question:

When is overloaded method selection performed?

Answer:

Overload resolution is performed at compile time.

Quick Review

Remember:
- Same method name.
- Different parameter list.
- Number, type, or order of parameters can differ.
- Return type alone is not enough.
- Parameters belong to method declarations.
- Arguments belong to method calls.
- Exact matches are preferred.
- Widening primitive conversion can be used when applicable.
- Overload resolution occurs at compile time.
- Overloading is different from overriding.

Basic reasoning pattern:

Argument type
    ↓
Check exact match
    ↓
If no exact match
    ↓
Check applicable widening conversions
    ↓
Select the most appropriate overload
    ↓
Compile and execute

Final Note

The most important skill in this topic is not memorizing a list of
overloads.

The learner should be able to look at an overloaded method call,
identify the argument types, analyze the available parameter lists,
predict the selected method, and explain why Java selected it.