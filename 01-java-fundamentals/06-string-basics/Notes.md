# String Basics Notes

## What is a String?

A String is a class in Java that represents a sequence of characters.

Example:

java
String language = "Java";


In this example:

- String is the data type (class).
- language is the variable name.
- "Java" is a String literal.

---

# String Variables

A String variable stores a reference to a String object.

java
String city = "London";


The variable points to the String object, not to individual characters.

---

# String Concatenation

The + operator joins two or more Strings.

Example:

java
String firstName = "Mehdi";
String lastName = "Karimi";

System.out.println(firstName + " " + lastName);


Output:


Mehdi Karimi


---

# Concatenation with Numbers

If a String appears in an expression, the remaining + operators perform String concatenation.

Example:

java
System.out.println(10 + 20 + " Java");


Output:


30 Java


Example:

java
System.out.println("Java " + 10 + 20);


Output:


Java 1020


Use parentheses when numerical calculations should happen first.

Example:

java
System.out.println("Result = " + (10 + 20));


Output:


Result = 30


---

# String Reference

A String variable stores a reference.

Example:

java
String language = "Java";

language = "Python";


The variable no longer refers to "Java".

It now refers to "Python".

---

# Immutable String

String objects are immutable.

Once a String object is created, it cannot be modified.

Whenever a String appears to change, Java creates a new String object and updates the variable reference.

Example:

java
String text = "Java";

text = text + " Programming";


A new String object is created.

The original "Java" String remains unchanged.

---

# concat()

The concat() method returns a new String.

Example:

java
String text = "Java";

text = text.concat(" Programming");


Result:


Java Programming


If the returned value is ignored, the original String does not change.

---

# Common Mistakes

- Thinking that String is a primitive data type.
- Forgetting that String objects are immutable.
- Expecting concat() to modify the original String automatically.
- Forgetting parentheses in mixed String and numeric expressions.
- Assuming variables store the actual String instead of a reference.

---

# Summary

- String is a class.
- String variables store references.
- + concatenates Strings.
- Parentheses affect evaluation order.
- String objects are immutable.
- concat() returns a new String.
- Reassigning a variable changes its reference.