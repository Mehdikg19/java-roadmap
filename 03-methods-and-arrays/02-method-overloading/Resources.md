02-Method Overloading

Project Information

- Project: Java Roadmap Project
- Phase: Phase 3 — Methods and Arrays
- Module: 03-methods-and-arrays
- Lesson: 02-method-overloading
- Language: Java

Topic

Method Overloading — Resources

Purpose

Provide reliable references and additional practice resources for
understanding method overloading, method signatures, method invocation,
overload resolution, and widening primitive conversions.

Official Documentation

Java Language Specification — Method Declarations

Study the official Java Language Specification for method declarations,
method signatures, and overloading.

Focus on:

- Method declarations
- Method signatures
- Formal parameters
- Method overloading

Java Language Specification — Method Invocation

Study the official Java Language Specification for method invocation and
method selection.

Focus on:

- Method invocation expressions
- Applicable methods
- Method selection
- Compile-time method resolution
- Method invocation conversions

Java Language Specification — Conversions and Promotions

Study the official Java Language Specification for primitive type
conversions and promotions.

Focus on:

- Widening primitive conversion
- Primitive type conversion
- Method invocation conversion

Oracle Java Documentation

Use the official Java documentation as a reference for Java language
behavior and method-related concepts.

Recommended Reading

Study the concepts in this order:

1. Methods
2. Parameters and arguments
3. Method signatures
4. Method overloading
5. Method invocation
6. Overload resolution
7. Widening primitive conversion
8. Compile-time polymorphism

Additional Practice Ideas

Practice 01 — Basic Overloading

Create overloaded methods named "printValue" for:

- int
- double
- String

Call each method with an appropriate argument.

Predict the selected method before execution.

Practice 02 — Different Number of Parameters

Create overloaded methods named "sum":

- sum(int, int)
- sum(int, int, int)
- sum(int, int, int, int)

Call each method and predict which overload is selected.

Practice 03 — Primitive Types

Create overloaded methods named "display":

- display(byte)
- display(short)
- display(int)
- display(long)
- display(float)
- display(double)

Test values of different primitive types.

Predict the selected method before execution.

Practice 04 — Widening Conversion

Create these overloaded methods:

- display(int)
- display(long)
- display(double)

Then test them with:

- byte
- short
- int
- long
- float
- double

Predict the selected overload before running the program.

Practice 05 — Invalid Overloading

Try to create:

int calculate(int a, int b)

double calculate(int a, int b)

Observe the compiler error.

Explain why changing only the return type cannot create an overload.

Practice 06 — Method Selection

Create several overloaded methods with primitive parameter types.

For each method call:

1. Identify the argument type.
2. Look for an exact match.
3. Check possible widening conversions.
4. Predict the selected overload.
5. Run the program.
6. Compare the result with the prediction.

Practice 07 — Method Overloading vs Overriding

Create a simple example that demonstrates method overloading.

Later, after studying inheritance and polymorphism, compare it with
method overriding.

Practice Questions

- What is method overloading?
- What makes two methods valid overloads?
- Can methods be overloaded by changing only the return type?
- Can methods be overloaded by changing the number of parameters?
- Can methods be overloaded by changing parameter types?
- Can parameter order create a different overload?
- What is a method signature?
- What is an exact match?
- What is widening primitive conversion?
- Can byte be passed to an int parameter?
- Can short be passed to an int parameter?
- Can int be passed to a long parameter?
- Can float be passed to a double parameter?
- When does overload resolution occur?
- What happens when no applicable overloaded method exists?
- What is the difference between method overloading and overriding?
Learning Advice

Do not try to memorize overload resolution as isolated rules.

For every overloaded method call:

1. Identify the argument type.
2. List the available overloads.
3. Check for an exact match.
4. Check widening conversions if necessary.
5. Determine the most appropriate overload.
6. Predict the result.
7. Execute the program.
8. Compare the prediction with the actual result.
9. Explain why the selected method was chosen.

Resource Priority

Primary resources should be:

1. Java Language Specification
2. Official Java documentation
3. Reliable Java technical references

Additional tutorials and videos should only be used when they provide
clear explanations or useful practice.

Status

Completed