02-Method Overloading

Project Information

- Project: Java Roadmap Project
- Phase: Phase 3 — Methods and Arrays
- Module: 03-methods-and-arrays
- Lesson: 02-method-overloading
- Language: Java

Topic

Method Overloading

Objective

Understand how method overloading works in Java.

Learn how Java distinguishes overloaded methods using their parameter
lists, how overloaded methods are selected during method invocation,
and how primitive widening conversions can affect overload resolution.

Prerequisites

Before studying this topic, the learner should understand:

- Variables and Data Types
- Type Casting
- Methods
- Method Declaration
- Method Call
- Parameters
- Arguments
- Return Types
- Return Values
- Primitive Data Types

Learning Outcomes

After completing this topic, the learner should be able to:

- Define method overloading.
- Create overloaded methods.
- Overload methods using different numbers of parameters.
- Overload methods using different parameter types.
- Understand method signatures.
- Understand the difference between parameters and arguments.
- Understand exact method matching.
- Understand widening primitive conversion during overload resolution.
- Predict which overloaded method Java selects.
- Understand why return type alone cannot overload a method.
- Recognize compile-time errors caused by invalid overloading.
- Distinguish method overloading from method overriding.
- Analyze overloaded method calls using primitive data types.
- Explain method overloading in an interview.

Files

Java Files

- "Example01.java"
- "Example02.java"
- "Exercise01.java"
- "Exercise02.java"
- "Playground.java"

Documentation Files

- "README.md"
- "Notes.md"
- "Resources.md"
- "Completed.md"

Key Concepts

- Method Overloading
- Method Signature
- Parameter List
- Parameters
- Arguments
- Number of Parameters
- Parameter Types
- Parameter Order
- Exact Match
- Overload Resolution
- Widening Primitive Conversion
- Compile-Time Method Selection
- Return Type
- Compile-Time Error
- Primitive Type Conversion
- Method Invocation
- Compile-Time Polymorphism

Topic Summary

Method overloading allows multiple methods in the same class to have
the same method name while having different parameter lists.

Methods can be overloaded by changing:

- The number of parameters.
- The parameter types.
- The order of parameter types.

Return type alone cannot be used to overload a method.

For example, these methods cannot be overloaded only because their
return types are different:

- "int calculate(int, int)"
- "double calculate(int, int)"

When Java encounters an overloaded method call, it examines the
argument types and determines which method is applicable.

An exact parameter match is preferred when available.

Java can also use widening primitive conversion when an exact match
is not available.

Examples of widening primitive conversion include:

- byte → short
- short → int
- int → long
- long → float
- float → double

For example, an "int" argument can be passed to a method with a
"long" parameter through widening conversion.

Method overloading is resolved at compile time and is therefore
associated with compile-time polymorphism.

Common Mistakes

- Thinking return type alone can overload a method.
- Confusing parameters with arguments.
- Assuming Java selects the first overloaded method in the source code.
- Ignoring the actual type of an argument.
- Forgetting about widening primitive conversion.
- Assuming every compatible overload has the same priority.
- Confusing method overloading with method overriding.
- Forgetting that overload resolution occurs at compile time.
- Creating overloaded methods that have unclear or unrelated purposes.
- Failing to predict the selected overload before execution.

Summary

Method overloading allows related operations to use the same method
name with different parameter lists.

Java determines the appropriate overloaded method during compilation
by examining the method invocation and the available parameter lists.
Exact matches are preferred, while widening primitive conversions may
be used when necessary.

Understanding method overloading is important for writing readable
and reusable Java code and for understanding Java's compile-time
method selection rules.

Status

Completed