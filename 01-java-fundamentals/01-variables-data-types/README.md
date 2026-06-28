01 - fundamentals.variables and Data Types

Objective

Learn how to declare variables, initialize them, and understand Java primitive data types. This section also introduces Java variable naming conventions and clean coding practices.

Topics

fundamentals.variables

Primitive Data Types

Variable Naming Rules

Declaration

Initialization

Key Concepts

Variable

A variable is a named memory location used to store data.

Example:

int age = 22; 

int → Data type

age → Variable name

22 → Value

Declaration

Creating a variable by specifying its data type and name.

int age; 

Initialization

Assigning a value to a variable.

age = 22; 

You can also declare and initialize a variable in one statement.

int age = 22; 

Primitive Data Types in Java

TypeDescriptionSizeExamplebyteSmall integer1 byte100shortInteger2 bytes25000intInteger (default)4 bytes1500longLarge integer8 bytes5000000000LfloatDecimal (single precision)4 bytes3.14fdoubleDecimal (double precision)8 bytes3.14159265charSingle character2 bytes'A'booleanTrue or FalseJVM-dependenttrue 

Variable Naming Rules

Variable names are case-sensitive.

They cannot start with a number.

They cannot contain spaces.

They cannot use Java keywords.

Use camelCase naming convention.

Choose meaningful and descriptive names.

Good examples:

studentName totalPrice isAvailable 

Bad examples:

a x1 temp 

Variable Declaration Syntax

type variableName = value; 

Example:

String name = "Mehdi"; int age = 22; double height = 1.78; boolean student = true; 

Files

FileDescriptionExample01.javaBasic variable declaration and outputExample02.javaUsing different primitive data typesExercise01.javaPlayground with variablesExercise02.javaBook information exerciseNotes.mdSummary and key pointsCompleted.mdCompletion status and review 

Learning Outcome

After completing this section, you should be able to:

Declare variables correctly.

Initialize variables.

Choose the appropriate primitive data type.

Follow Java naming conventions.

Print variables using System.out.println().

Write clean and readable Java code.